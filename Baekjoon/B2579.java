import java.util.*;

public class B2579 {
    public static int[] stair;
    public static int[][] dp;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        stair = new int[n + 1];
        dp = new int[n+1][3];

        for (int i = 0; i < n; i++) {
            stair[i] = sc.nextInt();
            Arrays.fill(dp[i], -1);
        }

        int max = Integer.MIN_VALUE;
        for (int i = 1; i < 3; i++) {
            max = Math.max(max, up(n - 1, i));
        }
        System.out.println(max);
        sc.close();
    }

    public static int up(int n, int i) {

        if (n >=0&& dp[n][i] != -1)
            return dp[n][i];

        else {
            if (n <= -1)
                return 0;

            if (i == 1) {
                return dp[n][i] =stair[n] + up(n - i, 2);
            } else {

                int u = stair[n] + up(n - i, 1);
                int k = stair[n] + up(n - i, 2);
                return dp[n][i] = Math.max(k, u);
            }
        }

    }
}