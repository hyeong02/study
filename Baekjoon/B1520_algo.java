import java.util.*;

public class B1520_algo {
    public static int map[][];
    public static int dp[][];
    public static boolean visit[][];
    public static int cnt = 0, m, n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        map = new int[m][n];
        dp = new int[m][n];
        visit = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
                visit[i][j] = false;
                dp[i][j] = -1;
            }
        }
        find(0, 0);
        System.out.println(cnt);
        sc.close();
    }

    public static void find(int i, int j) {
        if (i == m - 1 && j == n - 1){
            cnt++;
            return;

        }

        if (dp[i][j] != -1)
            cnt += dp[i][j];

        else {
            if(dp[i][j]==-1)dp[i][j]=0;
            visit[i][j] = true;
            
            if (i + 1 < m && map[i + 1][j] < map[i][j]) {
                int k = cnt;

                find(i + 1, j);             

                if (k != cnt)
                    dp[i][j]+=(cnt-k);
                else dp[i][j]+=0;

            }
            if (i - 1 >= 0 && map[i - 1][j] < map[i][j]) {
                int k = cnt;

                find(i - 1, j);
                
                if (k != cnt)
                    dp[i][j]+=(cnt-k);
                else dp[i][j]+=0;
            }
            if (j + 1 < n && map[i][j + 1] < map[i][j]) {
                int k = cnt;

                find(i, j + 1);

                if (k != cnt)
                    dp[i][j]+=(cnt-k);
                else dp[i][j]+=0;
            }

            if (j - 1 >= 0 && map[i][j - 1] < map[i][j]) {
                int k = cnt;

                find(i, j - 1);

                if (k != cnt)
                    dp[i][j]+=(cnt-k);
                else dp[i][j]+=0;

            }
            visit[i][j] = false;
        }

    }
}
