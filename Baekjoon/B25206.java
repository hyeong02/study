import java.util.*;
public class B25206{
    public static double result=0, score=0;
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<20; i++){
            String s=sc.next();
            s=s+s;
            double a=sc.nextDouble();
            String grade=sc.next();
            switch(grade){
                case "A+":
                    result+=a*4.5;
                    score+=a;
                    break;
                case "A0":
                    result+=a*4.0;
                    score+=a;
                    break;
                case "B+":
                    result+=a*3.5;
                    score+=a;
                    break;
                case "B0":
                    result+=a*3.0;
                    score+=a;
                    break;
                case "C+":
                    result+=a*2.5;
                    score+=a;
                    break;
                case "C0":
                    result+=a*2.0;
                    score+=a;
                    break;
                case "D+":
                    result+=a*1.5;
                    score+=a;
                    break;
                case "D0":
                    result+=a*1.0;
                    score+=a;
                    break;
                case "F":
                    result+=a*0.0;
                    score+=a;
                    break;
                default :
                    break;
                
            }
        }
        sc.close();
        System.out.println(result/score);
    }
}