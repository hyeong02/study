import java.util.*;
public class TravelCost {
    public static void main(String[] args) {
        String where;
        int people, day, plane, sleep;
        Scanner sc=new Scanner(System.in);
        System.out.print("여행지>>");
        where=sc.nextLine();
        System.out.print("인원수>>");
        people=sc.nextInt();
        System.out.print("숙박일>>");
        day=sc.nextInt();
        System.out.print("1인당 항공료>>");
        plane=sc.nextInt();
        System.out.print("1방 숙박비>>");
        sleep=sc.nextInt();

        System.out.printf("%d명의 %s %d박 %d일 여행에는 방이 %d개 필요하며 경비는%d입니다.", people, where, day, day+1,(people+1)/2, plane*people+(people+1)/2*sleep*day);
    }
}
