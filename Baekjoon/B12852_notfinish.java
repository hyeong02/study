import java.util.*;

public class B12852_notfinish {
    public static int[][] dp;
    public static int [][] re;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int min = 1000001;
        

        dp = new int[4][x + 1];
        re = new int[4][x+1];
        for (int i = 0; i < 4; i++){
            Arrays.fill(dp[i], -1);
            Arrays.fill(re[i], -1);
        }

        for (int i = 1; i < 4; i++) {
            int tmp = re(x, i);
            min = Math.min(tmp, min);

        }
        System.out.println(min);
        

        for (int i = 0; i < 4; i++)
            System.out.println(Arrays.toString(re[i]));
    }

    public static int re(int x, int pattern) {

        if (dp[pattern][x] != -1)
            return dp[pattern][x];
        else {
            if (pattern == 1 && x % 3 == 0)
                x /= 3; 
            else if (pattern == 1 && x % 3 != 0)
                return 1000001;
            else if (pattern == 2 && x % 2 == 0)
                x /= 2;
            else if (pattern == 2 && x % 2 != 0)
                return 1000001;
            else if (pattern == 3)
                x -= 1;


            if (x == 1)
                return 1;
            else if (x < 1)
                return 1000001;

            int min = 1000001;
            for (int i = 1; i < 4; i++) {
                int tmp = re(x, i) + 1;
                min = Math.min(tmp, min);
            }
            re [pattern][x]=x;
            return dp[pattern][x] = min;

        }

    }
}
