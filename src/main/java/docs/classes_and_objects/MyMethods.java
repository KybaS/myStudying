package docs.classes_and_objects;

public class MyMethods {

    public void areaOfTriangle(int a, int b, int c){
        int x = a * b * c;
        System.out.println(x);
    }

    void myMethod(Triangle triangle, int a, int b, int c) {
        triangle.setA(triangle.getA() + a);
        triangle.setB(triangle.getB() + b);
        triangle.setC(triangle.getC() + c);
        triangle = new Triangle(0, 0, 0);

        int x = a * b * c;
        System.out.println(x + "" + triangle);
    }
}
