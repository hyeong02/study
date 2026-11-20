import java.util.*;
public class QuickSort{
    public static int partition(int start, int end, int a[]){
        int i=start+1;
        int j=end;
        while(i<=j){
            while((i<=end)&&(a[start]>=a[i]))i++;
            while((j>=start+1)&&(a[start]<=a[j]))j--;
            if(i<=j){
            int tmp; tmp=a[i]; a[i]=a[j]; a[j]=tmp;}
        }
        int tmp; tmp=a[j]; a[j]=a[start]; a[start]=tmp;
        return j;
    }

    public static void qsrt(int start, int end, int a[]){
        if(start>=end) return;
        int m=partition(start, end, a);
        qsrt(start, m-1, a);
        qsrt(m+1, end, a);
    }

    
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("size of array >>");
        int n=sc.nextInt();
        int [] a=new int[n];

        for(int i=0; i<n; i++){
            System.out.print("a["+i+ "] of array>>");
            a[i]=sc.nextInt();
        }
        qsrt(0, a.length-1, a);
        System.out.println(Arrays.toString(a));
        sc.close();
    }
}