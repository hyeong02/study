class ColorTV{
    public ColorTV(int size, int color){
        this.size=size;
        this.color=color;
    }
    protected int size;
    protected int color;
    public void printProperty(){
        System.out.println(size+"인치 "+color+"컬러 TV");
    }

}
class SmartTV extends ColorTV{
    public SmartTV(String ip, int size, int color){
        super(size, color);
        this.ip=ip;
    }
    String ip;
     
    public void printProperty(){
        System.out.println("\""+ip+"\""+" 주소에 "+size+"인치 "+color+" 컬러 TV");

    }
    
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV("192.168.0.5", 77, 20000000);
        // "192.168.0.5" 주소에 77인치 20000000 컬러 TV
        smartTV.printProperty();
    }

}


