package docs.constructors;

public class ShapesDemo {
    public static void main(String[]args){

        int mySquare = new Square().getAreaOfSquare(4,3);
        if (mySquare==9){
            System.out.println("My Square = 9");
        }else {
            System.out.println(mySquare);
        }

        int nextSquare = new Square().getAreaOfSquare(1,5);

        int i;
        for (i = nextSquare; i < 100; i++){
            System.out.println(nextSquare);
            nextSquare++;
        }

        Rectangle firstRect = new Rectangle(5,10);
        firstRect.areaOfRect();

String test = "test text";

    }
}
