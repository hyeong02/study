import java.util.*;

public class Sum9 {
    public static void main(String[] args) {
        int a[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            int real, mod, hap=0;
            real=a[i];
            while (true) {

                mod=a[i]%10;
                a[i]/=10;
                hap+=mod;
                if(mod==0)break;
                
            }
            if(hap==9)System.out.print(real+ " ");
        }

    }
}
