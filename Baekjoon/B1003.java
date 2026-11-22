import java.util.Arrays;
import java.util.Scanner;

public class B1003 {
    public static int a = 0;
    public static int b = 0;
    public static int q[];
    public static int p[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            q= new int[k+1];
            p = new int[k+1];
            Arrays.fill(q, -1);
            Arrays.fill(p, -1);
            fibonacci(k);
            System.out.println(p[k] + " " + q[k]);
            a = 0;
            b = 0;
        }
        sc.close();
    }

    public static void fibonacci(int n) {
        if (n == 0) {
            p[0]=1;
            q[0]=0;
            return;
        } else if (n == 1) {
            p[1]=0;
            q[1]=1;
            return;
        } else if(p[n]==-1&&q[n]==-1) {
            fibonacci(n - 1); fibonacci(n - 2);
            p[n]=p[n-1]+p[n-2]; q[n]=q[n-1]+q[n-2];
        }
        
          p[n]=p[n-1]+p[n-2]; q[n]=q[n-1]+q[n-2];
        
    }
}