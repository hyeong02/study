import java.util.*;

public class B11049_algo {
    public static int n;
    public static int[] a;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n + 1];
        int tmp;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (i != n - 1)
                tmp = sc.nextInt();
            else
                a[n] = sc.nextInt();
        
        }
        opt(0, n);
    }
    public static int opt(int s, int e){
        if (s==e)return 0;
        int min=100000000;
        for(int i=s; i<e; i++){
            int u=opt(s, i)+opt(i+1,e)+a[s]*a[s+1]*a[s+2];
            if(u<min)min=u;
        }
        return min;
    }
    
}