import java.util.*;
public class B27433 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        long result=factorial(n);
        System.out.println(result);
        sc.close();
    }
    public static long factorial(long n){
        if (n==0) return 1;
        if(n==1)return 1;
        else if(n==2)return 2;
        return n*factorial(n-1);
    
    }
}
