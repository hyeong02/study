import java.util.*;

public class B10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();
            for (int k = p - 1; k < q; k++) {
                a[k] = r;
                ;
            }
        }
        for (int i = 0; i < a.length-1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print(a[n - 1]);
        sc.close();
    }
}
