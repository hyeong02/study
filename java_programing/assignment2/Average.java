public class Average {
    private int[] a = new int[10];
    private int nextIndex = 0;

    public void put(int x) {
        a[nextIndex++] = x;
    }

    public double getAvg() {
        double hap = 0;
        for (int i = 0; i < nextIndex; i++) {
            hap += a[i];
        }
        return hap/(nextIndex);
    }
    public void showAll(){
        System.out.println("***** 저장된 데이터 모두 출력 *****");
        for(int i=0; i<nextIndex; i++)
            System.out.print(a[i]+ " ");
        System.out.println("");
    }

    public static void main(String[] args) {
        Average avg = new Average();
        avg.put(10); // 10 저장
        avg.put(15); // 15 저장
        avg.put(100); // 100 저장
        avg.showAll(); // 저장된 모든 원소 출력
        System.out.print("평균은 " + avg.getAvg()); // 평균 출력
    }
}
