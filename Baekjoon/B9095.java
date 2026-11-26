import java.util.*;

public class B9095 {
    public static int[][] dp;
    public static int cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        for (int j = 0; j < k; j++) {

            cnt = 0;
            int n = sc.nextInt();
            dp = new int[n+1][4];

            for (int i = 0; i < n+1; i++)
                Arrays.fill(dp[i], -1);

            for (int i = 1; i < 4; i++) {
                hap(n, i);
            }

            System.out.println(cnt);
        }
        sc.close();
    }

    public static void hap(int n, int i) {
        n = n - i;

        if (dp[n+i][i] != -1) {
            cnt += dp[n+i][i];
        } 
        else {
            
            if (n == 0) {
                cnt++;
                return;

            } else if (n < 0)
                return;

            for (int j = 1; j < 4; j++) {

                int k = cnt;
                hap(n, j);
                if (cnt != k) {

                    if (dp[n+i][i] == -1)
                        dp[n+i][i] = dp[n+i][i] + 1 + (cnt - k);
                    else
                        dp[n+i][i] += (cnt - k);
                }
            }
        }

    }
}
