import java.util.*;

public class B10830_algo {
    public static int N;
    public static int base=1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        long b = sc.nextLong();

        long[][] a = new long[N][N];
        long[][] tmp = new long[N][N];
        long[][] I = new long [N][N];

        for(int i=0; i<N; i++){
            Arrays.fill(I[i], 0);
               I[i][i]=1;
    
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                a[i][j] = sc.nextLong();
            }
        }

        sc.close();

        while(b>0){
            if(b%2==1){
                MulMat(a, I, tmp);
                CopyMat(tmp, I);
            }
            MulMat(a, a, tmp);
            CopyMat(tmp, a);
            b=b/2;
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(I[i][j]);
                if(j!=N-1)System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

    public static void MulMat(long[][] a, long[][] b, long[][] c){
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                long t=0;
                for(int k=0; k<N; k++){
                    t+=(a[i][k]*b[k][j])%base;
                }
                c[i][j]=t%base;
            }
        }
        return;
    }

    public static void CopyMat(long[][] a, long[][] b){
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                b[i][j]=a[i][j];
            }
        }
        return;
    }
}