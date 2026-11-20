import java.util.Scanner;

public class B1002 {
    public static void main(String[] args) {
        int x1, x2, y1, y2, r1, r2;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
        x1=sc.nextInt();
        y1=sc.nextInt();
        r1=sc.nextInt();
        x2=sc.nextInt();
        y2=sc.nextInt();
        r2=sc.nextInt();
        int r=(int)(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
        int sum=(int)Math.pow((r1+r2),2);
        int dif=(int)Math.pow((r1-r2),2);
        if(r==0 && r1==r2)System.out.println("-1");
        else if(r>sum || r<dif)System.out.println("0");
        else if (r == sum || r == dif) System.out.println("1");
        else System.out.println("2");



    }
    sc.close();
    }
    
}
