import pandas as pd
import numpy as np

print("\nbasic #1")
df_raw=pd.read_csv("/home/dhlee/study/ADP_2026/store_sales-1.csv")
df=df_raw.drop_duplicates().reset_index(drop=True)
df=df.dropna(subset=["qty"]).reset_index(drop=True)


from sklearn.model_selection import train_test_split
x=df[["price", "discount"]]
y=df["qty"]
x_train, x_test, y_train, y_test=train_test_split(x, y, test_size=0.3, random_state=42)
print(np.shape(y_train))
print(np.shape(y_test))


print("\nbasic #2")
from sklearn.linear_model import LinearRegression
model=LinearRegression().fit(x_train, y_train)
print(np.round(model.coef_, 4))
print(np.round(model.intercept_, 4))


print("\nbasic #3")
from sklearn.metrics import mean_absolute_error, r2_score
y_pred=model.predict(x_test)
print(round(mean_absolute_error(y_test, y_pred), 3))
print(round(r2_score(y_test, y_pred), 2))


print("\nbasic #4")
y_old=np.full(len(y_test), y_train.mean()) #만약 원래 평균으로 예측 시 train 데이터의 평균으로 예측
print(round(mean_absolute_error(y_test, y_old),3))
print(round(mean_absolute_error(y_test, y_pred),3))


print("\nIntermediate #1")
for i in [["price"], ["price", "discount"]]:
    x=df[i]
    y=df["qty"]
    x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=0.3, random_state=42)
    model=LinearRegression().fit(x_train, y_train)
    y_pred=model.predict(x_test)
    print(f"{i} {r2_score(y_test, y_pred).__round__(3)}")
    
    
print("\nIntermediate #2")
x=pd.get_dummies(df[["price", "discount", "category"]], columns=["category"], drop_first=True, dtype=int)
print(x.columns.to_list())
x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=0.3, random_state=42)
model=LinearRegression().fit(x_train, y_train)
y_pred=model.predict(x_test)
print(r2_score(y_test, y_pred).__round__(3))


print("\nIntermediate #3")
x=df[["price", "discount"]]
y=df["qty"]
x_train,  x_test, y_train, y_test=train_test_split(x, y, test_size=0.3, random_state=42)
model=LinearRegression().fit(x_train, y_train)
y_pred=model.predict(x_test)
k=y_test-y_pred
print(k.mean(), k.std(ddof=1), abs(k).max())


print("\nIntermediate #4") 
x=df[["price", "discount"]]
y=df["qty"]
x_train,  x_test, y_train, y_test=train_test_split(x, y, test_size=0.3, random_state=42)
model=LinearRegression().fit(x_train, y_train)
y_pred=model.predict(x_test)
import matplotlib.pyplot as plt
fig, ax=plt.subplots(figsize=(4,4))
ax.scatter(y_test, y_pred, alpha=0.4)
lim=[y_test.min(), y_test.max()]
ax.plot(lim,  lim, color="red")
ax.set_xlabel("y_test")
ax.set_ylabel("y_pred")
print(np.corrcoef(y_test, y_pred)[1,0])

print("\nAdvanced #1")
k={"p":df[["price"]], "p+d":df[["price", "discount"]], "p+d+c":pd.get_dummies(df[["price", "discount", "category"]], columns=["category"], drop_first=True, dtype=int)}
for i in ["p", "p+d", "p+d+c"]:
    x=k.get(i)
    y=df["qty"]
    x_train, x_test, y_train, y_test=train_test_split(x, y, test_size=0.3, random_state=42)
    model=LinearRegression().fit(x_train, y_train)
    y_pred=model.predict(x_test)
    print(f"{i}의 mae : {mean_absolute_error(y_test, y_pred)} r2 : {r2_score(y_test, y_pred)}")
    
    
print("\nAdvanced #2")
for i in [0.2, 0.3, 0.4]:
    x=df[["price", "discount"]]
    y=df["qty"]
    x_train,  x_test, y_train, y_test=train_test_split(x, y, test_size=i, random_state=42)
    model=LinearRegression().fit(x_train, y_train)
    y_pred=model.predict(x_test)
    print(f"{i} {r2_score(y_test, y_pred).__round__(3)}")
    
    
print("\nAdvanced #3")
x=df[["price", "discount"]]
y=df["qty"]
x_train,  x_test, y_train, y_test=train_test_split(x, y, test_size=0.3, random_state=42)
model=LinearRegression().fit(x_train, y_train)
new=pd.DataFrame({
    "price":[79000],
    "discount":[0.2]
})
y_new=model.predict(new)
y_pred=model.predict(x_test)
new=round(y_new[0],2)
print(new)
mae=mean_absolute_error(y_test, y_pred).__round__(2)
print(mae)
print(f"예상 {new}개 +- {mae}개")