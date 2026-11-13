import java.util.*;

public class RectInclusion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1, x2, y1, y2;
        x1=sc.nextInt();
        y1=sc.nextInt();
        x2=sc.nextInt();
        y2=sc.nextInt();
        if(x1<=200 && x1>=10&& x2>=10 &&x2<=200&&y1<=300&&y1>=10&&y2>=10&&y2<=300)
            System.out.printf("(%d, %d) (%d, %d) 사각형은 (10, 10), (200, 300) 사각형에 포함된다.", x1, y1, x2, y2);
        else
            System.out.printf("(%d, %d) (%d, %d) 사각형은 (10, 10), (200, 300) 사각형에 포함되지않는다.", x1, y1, x2, y2);
        
    }
}
