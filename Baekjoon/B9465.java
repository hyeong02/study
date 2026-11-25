import java.util.*;

public class B9465 {
    public static int[][] a;
    public static int[][] dp;
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int q = 0; q < k; q++) {

            n = sc.nextInt();
            a = new int[2][n];
            dp = new int[2][n];

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                    dp[i][j] = -1;
                }
            }

            System.out.println(Math.max(re(0, 0), re(0, 1)));

        }
        sc.close();

    }

    public static int re(int cnt, int i) {
        if (cnt == n - 1)
            return a[i][cnt];
        int u;
        int max = Integer.MIN_VALUE;
        if (dp[i][cnt] != -1)
            return dp[i][cnt];

        else {
            if (i == 1)
                u = a[i][cnt] + re(cnt + 1, 0);
            else
                u = a[i][cnt] + re(cnt + 1, 1);
            max = Math.max(max, u);

            if (cnt + 2 < n) {
                u = a[i][cnt] + re(cnt + 2, 1);
                max = Math.max(max, u);
                u = a[i][cnt] + re(cnt + 2, 0);
                max = Math.max(max, u);
            }

            return dp[i][cnt] = max;
        }
    }
}
