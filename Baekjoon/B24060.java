import java.util.*;
public class B24060 {
    public static int  []a;
    public static int []tmp;
    public static int cnt=0;
    public static int k;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        k=sc.nextInt();
        a=new int [n];
        tmp=new int[n];
        for(int i=0; i<n; i++)
            a[i]=sc.nextInt();
        
        merge_sort(a, 0, n-1);
        sc.close();
        if (cnt<k)System.out.println("-1");
    }

    public static void merge_sort(int[] a, int s, int e){
        if(s<e){
            int m=(s+e)/2;
            merge_sort(a, s, m);
            merge_sort(a, m+1, e);
            merge(a, s, m, e);
        }
    }
    public static void merge(int[] A, int s, int m, int e){
        int i=s; int j=m+1; int t=0;
        while(i<=m & j<=e){
            if(A[i]<=A[j]){
                tmp[t++]=A[i++]; 
            }
            else{
                tmp[t++]=A[j++]; 
            }
        }
        while(i<=m){
            tmp[t++]=A[i++];
        }
        while(j<=e){
            tmp[t++]=A[j++];
        }
        i=s;
        j=0;
        while(i<=e){
            A[i++]=tmp[j++];
            cnt++;
            if(cnt==k)System.out.println(tmp[j-1]);
                    }
       
    }
}