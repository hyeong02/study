import java.util.*;

public class TwoThreshold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[4][4];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 256);
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "     ");
            }
            System.out.println(" ");
        }

        System.out.print("임계값 입력>>");
        int b= sc.nextInt();

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] <= b)
                    System.out.print(0 + "     ");
                else
                    System.out.print(255+ "     ");

            }
            System.out.println(" ");
        }
    }
}
