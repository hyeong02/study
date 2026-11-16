public class Rectangle {
    public Rectangle(int x, int y, int width, int height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }

    public boolean isSquare(){
        if (width==height)return true;
        else return false;
    }
    public boolean contains(Rectangle b){
        if((this.x<=b.x) && (this.y<=b.y)&& (this.x+this.width>=b.x+b.width) && (this.y+this.height>=b.y+b.height))
            return true;
        else return false;
    }
    public void show(){
        System.out.println("("+ x + ","+ y+")"+"에서 크기가 "+ width+ "x"+ height+ "인 사각형");
    }

    private int x, y, width, height;

    public static void main(String[] args) {
        Rectangle a = new Rectangle(3, 3, 6, 6); // (3,3) 점에서 6x6 크기의 사각형
        Rectangle b = new Rectangle(4, 4, 2, 3); // (4,4) 점에서 2x3 크기의 사각형
        a.show();
        if (a.isSquare())
            System.out.println("a는 정사각형입니다.");
        else
            System.out.println("a는 직사각형입니다.");
        if (a.contains(b))
            System.out.println("a는 b를 포함합니다.");
    }
}
