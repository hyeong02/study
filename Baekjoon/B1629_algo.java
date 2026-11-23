import java.util.*;
public class B1629_algo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        long a=sc.nextLong();
        long b=sc.nextLong();
        long c=sc.nextLong();
        long result=1;
        long pp=a;

        while(b>=1){

            if(b%2==1){
                
                 result=result*pp%c;
            }  
            b=b/2;
            pp=pp*pp%c;

            
        }
        System.out.println(result%c);
        sc.close();
    }
}
