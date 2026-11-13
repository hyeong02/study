import java.util.*;
public class BirtydayCandle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("나이를 입력하세요>>");
        int a=sc.nextInt();
        System.out.printf("빨간초 %d개, 파란초 %d개, 노란 초 %d개, 총 %d개가 필요합니다.",  a/10, a%10/5, a%10%5, a/10+a%10/5+a%10%5);
        
    }

}
