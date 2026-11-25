
import java.util.*;

public class B14440_algo {
    public static int N = 2;
    public static int[][] a;
    public static int[][] I;
    public static int[][] tmp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int F0 = sc.nextInt();
        int F1 = sc.nextInt();
        int b = sc.nextInt();
        a = new int[][] { { x, y }, { 1, 0 } };
        I = new int[][] { { 1, 0 }, { 0, 1 } };
        tmp = new int[2][2];
        if (b == 0)
            System.out.printf("%02d", F0);
        else if (b == 1)
            System.out.printf("%02d", F1);
        else {
            b -= 1;
            while (b > 0) {
                if (b % 2 == 1) {
                    MutMat(I, a, tmp);
                    CopyMat(tmp, I);
                }
                b /= 2;
                MutMat(a, a, tmp);
                CopyMat(tmp, a);

            }
            System.out.printf("%02d", (I[0][0] * F1 + I[0][1] * F0) %100);
        }
        sc.close();
    }

    public static void MutMat(int[][] a, int[][] b, int[][] c) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int t = 0;
                for (int k = 0; k < N; k++) {
                    t += (a[i][k] * b[k][j]) % 100;
                }
                c[i][j] = t % 100;
            }
        }
    }

    public static void CopyMat(int[][] a, int[][] b) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                b[i][j] = a[i][j];
            }
        }
    }
}
