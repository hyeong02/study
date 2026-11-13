public class Eight {
    public static int n[]={1, -2, 6, 20, 5, 72, -16, 256};

    public static void main(String[] args) {
        for(int i=0; i<n.length; i++){
        if(n[i]>0 && n[i]%4==0){//4의 배수들을 뽑는 함수이다.
            System.out.print(n[i]+ " ");}
    }
        
    }
    
}
