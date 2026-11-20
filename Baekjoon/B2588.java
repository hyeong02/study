import java.util.*;
public class B2588{
    public static void main(String[] args) {
        int a, b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        int b_1=b%10;
        int b_10=b%100/10;
        int b_100=b/100;
        int ans_1=b_1*a;
        int ans_2=b_10*a;
        int ans_3=b_100*a;
        System.out.println(ans_1);
        System.out.println(ans_2);
        System.out.println(ans_3);
        System.out.println(ans_1+ans_2*10+ans_3*100);
        sc.close();
    }
    

}