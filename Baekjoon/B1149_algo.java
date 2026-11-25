import java.util.*;

public class B1149_algo {
    public static int[][] a;
    public static int[][] dp;
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n][3];
        dp = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
                dp[i][j] = -1;
            }
        }
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++)
            min = Math.min(rgb(0, i), min);
        System.out.println(min);
        sc.close();

    }

    public static int rgb(int i, int j) {
        if (i == n - 1)
            return a[i][j];

        if (dp[i][j] != -1)
            return dp[i][j];
        else {
            int min = Integer.MAX_VALUE;
            if (j != 0) {
                min = Math.min(rgb(i + 1, 0), min);
            }
            if (j != 1) {
                min = Math.min(rgb(i + 1, 1), min);
            }
            if (j != 2) {
                min = Math.min(rgb(i + 1, 2), min);
            }
            return dp[i][j]=a[i][j] + min;
        }

    }
}
