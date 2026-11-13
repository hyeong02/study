import java.util.*;

public class RandomNubersWithoutDuplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇개의 정수를 입력하시겠습니까? >>");
        int n;
        n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0; i<a.length; i++){
            int k=((int)(Math.random()*100))+1;
            a[i]=k;
            for(int j=0; j<i; j++){
                if(a[j]==k) {
                    i--;
                    break;
                }
                    
            }
            
        }
        System.out.println(Arrays.toString(a));
        double hap=0;
        for(int i=0; i<a.length; i++){
            hap+=a[i];
        }
        System.out.println(hap/a.length);

    }
}
