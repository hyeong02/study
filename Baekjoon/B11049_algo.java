import java.util.*;

public class B11049_algo {
    public static int n;
    public static int[] a;
    public static int [][] dp;

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
                
        dp=new int[n+1][n+1];
        for(int i=0; i<n; i++)
            Arrays.fill(dp[i], -1);

        System.out.println(opt(1, n));
        sc.close();
    }
    public static int opt(int s, int e){
        if (s==e)return 0;
        int min = Integer.MAX_VALUE;
        for(int i=s; i<e; i++){
        
             if(dp[s][e]!=-1){
                return dp[s][e];
            }
            else{ int u=opt(s, i)+opt(i+1,e)+a[s-1]*a[i]*a[e];
                
            if(u<min)min=u;}
        }
        dp[s][e]=min;
        return min;
    }
    
}