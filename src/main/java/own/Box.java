package own;

public class Box {

    private int width;
    private int height;
    private int depth;

    protected Box(int width, int height, int depth){
       this.width = width;
       this.height = height;
       this.depth = depth;
    }

    public Box() {
    }

    protected void myBox(){
        System.out.println("Empty constructor and Method");
    }

    protected void getVolume(){
        //return width * height * depth;
        System.out.println(width * height * depth);
    }

    boolean variable = true;
    public void myMethod1(){
        System.out.println("some code executed/login and password");
        if (variable){
            System.out.println("this code execute only when os not initialization");
        }else {
            System.out.println("login successful!");
        }
    }
}
