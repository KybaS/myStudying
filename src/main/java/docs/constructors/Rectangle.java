package docs.constructors;

public class Rectangle {

    private int height;
    private int weight;

    private int id;

    private static int numberOfRect = 0;

    public Rectangle(int sideA, int sideB){
        height = sideA;
        weight = sideB;

        id = ++numberOfRect;
    }

    public void areaOfRect(){
        int area = height * weight;
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

    public int getWeight(){
        return weight;
    }

    public void setWeight(int newValue){
        weight = newValue;
    }
}
