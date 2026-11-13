import java.util.Scanner;
public class Birthday {
    public static void main(String[] args) {
        int a;
        Scanner sc= new Scanner(System.in);
        System.out.print("생일 입력 하세요 >>");
        a=sc.nextInt();
        System.out.printf("%d년 %d월 %d일", a/10000, a%10000/100, a%10000%100);
        
    }
}
