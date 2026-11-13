import java.util.*;

public class Naming {
    public static void main(String[] args) {
        System.out.println("*****작명 프로그램이 실행됩니다.*****");
        Scanner sc = new Scanner(System.in);
        String s;
        String boy[] = {
                "민준", "서준", "도윤", "예준", "시우",
                "지호", "주원", "현우", "용우", "민태"
        };

        String girl[] = {
                "서연", "서윤", "지우", "하윤", "지민",
                "수아", "지아", "나은", "채원", "은수" };

        while (true) {
            System.out.print("남/여 선택>>");
            s = sc.nextLine();
            if (s.equals("남") || s.equals("여")) {
                System.out.print("성 입력>>");
                String k;
                k=sc.nextLine();
                System.out.println("추천 이름"+ k+ boy[(int)(Math.random()*10)]);

            }
            else if(s.equals("그만"))break;
            else System.out.println("남/여 중에서 입력하세요!");
        }
    }
}
