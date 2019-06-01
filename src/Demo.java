public class Demo {
    private int x, y;
    
    public void changeX(int a){
        x=a;
    }
    
    public Demo(int a, int b){
        x=a;
        y=b;
    }
    public void show(){
        System.out.println(x+","+y);
    }
}
