class Equipment{
    Equipment(){
        this("미등록", 1);
    }
    Equipment(String name){
        this(name, 1);

    }
    Equipment(String name, int stock){
        this.name=name; this.stock=stock;
        this.id=cnt++;
    }
    private String name;
    private int stock;
    private final int id;
    public static int cnt=1;
    
    
    public static int getCreatedCount(){
        return cnt;
    }
    protected boolean hasStock(){
        if(stock==0)return false;
        else return true;
    }
    boolean rentOne(){
        if(stock==0) return false;
        else{
            stock--;
            return true;
        }
    }
    public String getName(){
        return this.name;
    }
    public int getStock(){
        return stock;
    } 
    public int getId(){
        return id;
    }
}

// class rental_cabinet{
//     public final static Equipment[] Cabinet=new Equipment[n];
//     static final int n= 3;
//     void put(put index, Equipment item){
//         this.Cabinet=item;
//     }
//     Equipment get(int index){
//         return Cabinet[index];
//     }
//     void rent(int index){
//         rent(get(index));
//     }
//     rent(Equipment item){
//         if(item==null)return false;
//         else return item.rentOne();
        
//     }
//     static previewStock(int stock){
        
//     }
//     reset(){
//         re();
//     }
//     private static void re(){
//         for(int i=0; i<3; i++){
//             Cabinet[i]=null;
//         }
//     }
    
// }

public class test_2026_11_11{
    public static void main(String[] args) {
    Equipment tripod = new Equipment("삼각대", 2);
    Equipment mic = new Equipment("마이크");
    Equipment unnamed = new Equipment();

    System.out.println(tripod.getId() + " " + tripod.getStock());
    System.out.println(mic.getId() + " " + mic.getStock());
    System.out.println(unnamed.getId() + " " + unnamed.getStock());
    System.out.println(Equipment.getCreatedCount());
}
}