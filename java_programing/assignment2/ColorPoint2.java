class ColorPoint {
    ColorPoint(int x, int y, String color){
        this.x=x;
        this.y=y;
        this.color=color;
    }
    protected int x;
    protected int y;
    protected String color;

    public String toString() {
        return "\"" + color + "\"" + "색의 "+"(" + x + "," + y + ")" + "의 점";
    }
}

class ColorPoint2 extends ColorPoint {
    public ColorPoint2(int x, int y, String color){
        super(x, y, color);
    }
    public ColorPoint2(int x, int y){
        super(x, y, "Black");
    }
    public ColorPoint2(){
        super(0, 0, "WHITE");
    }
    public void set(int x, int y){
        this.x=x; this.y=y;
    }
    public void set(String color){
        this.color=color;
    }
    public double getDistance(ColorPoint2 point){
        double dis;
        dis=Math.sqrt((this.x-point.x)*(this.x-point.x)+(this.y-point.y)*(this.y-point.y));
        return dis;
    }

       public static void main(String[] args) {
        ColorPoint2 zeroPoint = new ColorPoint2(); // (0,0) 위치의 "WHITE" 색 점
        System.out.println(zeroPoint.toString() + "입니다.");
        ColorPoint2 cp = new ColorPoint2(10, 10, "RED"); // (10,10) 위치의 "RED" 색 점
        cp.set("BLUE");
        cp.set(10, 20);
        System.out.println(cp.toString() + "입니다.");
        ColorPoint2 thresholdPoint = new ColorPoint2(100, 100); // (100, 100) 위치의
        // "BLACK" 점
        System.out.println("cp에서 임계점까지의 거리는 " + cp.getDistance(thresholdPoint));
    }
}

