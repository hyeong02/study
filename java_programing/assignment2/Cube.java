public class Cube {
    public Cube(int x, int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public void increase(int x, int y, int z){
        this.x+=x;
        this.y+=y;
        this.z+=z;
    }
    public boolean isZero(){
        if(x*y*z==0)return true;
        else return false;
    }

    public int getVolume(){
        return (x*y*z);
    }

    private int x;
    private int y;
    private int z;

    public static void main(String[] args) {
        Cube cube = new Cube(1, 2, 3); // 가로, 세로, 높이가 각각 1, 2, 3인 큐브 객체 생성
        System.out.println("큐브의 부피는 " + cube.getVolume());
        cube.increase(1, 2, 3); // 가로, 세로, 높이 각각 1,2,3 씩 증가
        System.out.println("큐브의 부피는 " + cube.getVolume());
        if (cube.isZero())
            System.out.println("큐브의 부피는 0");
        else
            System.out.println("큐브의 부피는 0이 아님");
    }
}
