import java.util.*;

public class EvenSort {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList <Integer> a = new ArrayList <Integer>();
        int cnt =0;
        for(int i=0; i<N; i++){
            int k=sc.nextInt();
            if(k%2==0){
            a.add(k);
            cnt++;
            }
        }
        Collections.sort(a);
        System.out.println(cnt);
        System.out.println(a.toString());
    }
}