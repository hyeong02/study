import java.util.*;

public class B11055 {
    public static int[] a;
    public static int n;
    public static int[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        dp = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            dp[i] = -1;
        }

        int max = -1;
        for (int i = 0; i < n; i++) {
            int k = max(i);
            max = Math.max(k, max);
        }
        System.out.println(max);
        sc.close();

    }

    public static int max(int p) {
        if(p==n-1)return a[p];

        if (dp[p] != -1)
            return dp[p];
        else {
            int max = -1;

            for (int i = p + 1; i < n; i++) {
                int q;
                if (a[p] < a[i])
                    q = max(i) + a[p];
                else
                    q = a[p];
                max = Math.max(q, max);
            }

            return dp[p] = max;
        }
    }
}
