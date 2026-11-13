import java.util.*;
public class AudoStatus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String s;
        String q;
        if((a&64)==64)s="달리는 상태";
        else s="정지 상태";
        if((a&32)==32)q="켜진";
        else q="꺼진";
        int ondo=a&31;

        System.out.println("자동차 상태는 "+ s+"이고 "+"에어컨이 "+q+"상태이고" + " 온도는 "+ondo+"도이다.");
    }
}
