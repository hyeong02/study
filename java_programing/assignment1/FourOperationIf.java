import java.util.*;
public class FourOperationIf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Double a, b;
        String s;
        System.out.print("연산 입력 >>");
        a=sc.nextDouble();
        s=sc.next();
        b=sc.nextDouble();
        if(s.equals("곱하기")){
            System.out.printf("%f %s %f의 계산 결과는 %f", a, s, b, a*b);
        }
        else if(s.equals("나누기")){
            System.out.printf("%f %s %f의 계산 결과는 %f", a, s, b, a/b);
        }
        else if(s.equals("더하기")){
            System.out.printf("%f %s %f의 계산 결과는 %f", a, s, b, a+b);
        }
        else if(s.equals("빼기")){
            System.out.printf("%f %s %f의 계산 결과는 %f", a, s, b, a-b);
        }
        else{
            System.out.println("사칙 연산이 아닙니다.");
        }
    }
}
