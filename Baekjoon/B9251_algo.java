import java.util.*;

public class B9251_algo {
    public static String a, b;
    public static int L1, L2;
    public static int[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.next();
        b = sc.next();
        L1 = a.length();
        L2 = b.length();
        dp = new int[L1][L2];
        for(int i=0; i<L1; i++)Arrays.fill(dp[i], -1);
        System.out.println(LCS(0, 0));
        sc.close();
    }

    public static int LCS(int i, int j) {
        if ((L1 != i && L2 != j)&&dp[i][j] != -1)
            return dp[i][j];
        else {
            if ((L1 == i || L2 == j))
                return 0;

            else if (a.charAt(i) == b.charAt(j))
                return dp[i][j]=(LCS(i + 1, j + 1) + 1);

            else {
                int p = LCS(i + 1, j);
                int q = LCS(i, j + 1);
                return dp[i][j]=(Math.max(p, q));
            }
        }
    }
}