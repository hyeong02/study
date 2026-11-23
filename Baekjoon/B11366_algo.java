import java.util.*;

public class B11366_algo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a[][] = { { 1, 1 }, { 1, 0 } };
            int b[][] = { { 1, 0 }, { 0, 1 } };
            int c[][] = new int[2][2];
            int f0 = sc.nextInt();
            int f1 = sc.nextInt();
            int n = sc.nextInt();
            if (f0 == 0 && f1 == 0 && n == 0)
                break;
           
            while (n > 0) {
                if (n % 2 == 1) {
                    MulMat(a, b, c);
                    CopyMat(b, c);
                }
                MulMat(a, a, c);
                CopyMat(a, c);
                n /= 2;
            }
            System.out.println(b[0][0]*f1+b[0][1]*f0);

        }
        sc.close();

    }

    public static void MulMat(int[][] a, int[][] b, int[][] c) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int t = 0;
                for (int k = 0; k < 2; k++) {
                    t += a[i][k] * b[k][j];
                }
                c[i][j] = t;
            }
        }
    }

    public static void CopyMat(int[][] a, int[][] b) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = b[i][j];
            }
        }
    }
}
