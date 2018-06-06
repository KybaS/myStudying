package docs.constructors;

public class Rectangle {

    public static int x = 7;
    public int y = 3;

    private int height;
    private int width;

    private int id;

    private static int numberOfRect = 0;

    public Rectangle(int sideA, int sideB){
        height = sideA;
        width = sideB;

        id = ++numberOfRect;
    }

    public Rectangle(){

    }

    public void areaOfRect(){
        int area = height * width;
        System.out.println(area);
    }

    public int getId(){
        return id;
    }

    public int getNumberOfRect(){
        return numberOfRect;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int newValue){
        height = newValue;
    }

    public int getWidth(){
        return width;
    }

    public void setWidth(int newValue){
        width = newValue;
    }
}
