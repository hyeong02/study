import java.util.*;
public class Gambling {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("겜블링 게임을 시작합니닷!");
        while(true){       
            System.out.print("엔터키 입력>>");
            sc.nextLine();
            int a=(int)(Math.random()*3);
            int b=(int)(Math.random()*3);
            int c=(int)(Math.random()*3);
            int d=(int)(Math.random()*3);
            int e=(int)(Math.random()*3);
            int f=(int)(Math.random()*3);
            int g=(int)(Math.random()*3);

            System.out.println(a+"   "+b+"   "+c+"   "+d+"   "+e+"   "+f+"   "+g);
            if(a==b&&b==c&&c==d&&d==e&&e==f&&f==g){
                System.out.println("성공! 대박났어요!");
                System.out.print("계속하시겠습니까?(yes/no)>>");
                String s=sc.nextLine();
                if(s.equals("yes"));
                else if(s.equals("no"))
                    break;
                else{
                    System.out.println("제대로 입력 안했으니 그만 두겠습니다.");
                    break;
                }

                
            }


        }
        System.out.println("게임을 종료합니다.");
        
    }
}
