import java.util.*;
public class AverageWithNumberFormatException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int hap=0, cnt=0;
        while (true) { 
            String s;
                s=sc.next();
            try {
                int a=Integer.valueOf(s);
                if(a==-1)break;
                else if(a<=0){
                    System.out.println(a+ " 제외");
                    continue;
                }
                cnt++;
                hap+=a;
                
                
            } catch (NumberFormatException e) {
                System.out.println(s+" 제외");
            }
            
        }
        double avg=(double)hap/cnt;
        System.out.println("평균은"+ avg);
    }
}
