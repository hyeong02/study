import pandas as pd
import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import r2_score, mean_absolute_error
df_raw=pd.read_csv("/home/dhlee/study/ADP_2026/store_sales-1.csv")
df=df_raw.drop_duplicates().reset_index(drop=True)
df=df.dropna(subset=["qty"]).reset_index(drop=True)
x=df[["price", "discount"]]
y=df["qty"]
x_train, x_test, y_train, y_test=train_test_split(x, y, test_size=0.25, random_state=31)
print(x_train.shape, x_test.shape)

k={"p":df[["price"]], "p+d":df[["price", "discount"]],
   "p+d+c":pd.get_dummies(df[["price","discount","category"]], columns=["category"], drop_first=True, dtype=int)}

for i in ["p", "p+d", "p+d+c"]:
    x=k.get(i)
    x_train, x_test, y_train, y_test=train_test_split(x, y, test_size=0.24, random_state=31)
    model=LinearRegression().fit(x_train, y_train)
    y_pred=model.predict(x_test)
    mae=mean_absolute_error(y_test, y_pred)
    r2=r2_score(y_test, y_pred)
    print(f"{i} 일 때 mae:{mae}, r2score:{r2}")