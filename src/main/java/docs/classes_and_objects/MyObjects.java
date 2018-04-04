package docs.classes_and_objects;

public class MyObjects {
    public static void main(String[] args) {

        MyMethods methods = new MyMethods();
        Triangle myTriangle = new Triangle();

        methods.areaOfTriangle(10, 10, 10);

        methods.myMethod(myTriangle, 5, 5, 5);

    }
}
