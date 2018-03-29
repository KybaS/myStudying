package java_tutorial;

public class Animal implements Behaviors {

    String nameNonStaticField = "Animal";
    String aliasInstanceVariable = "Bobic";

    static int numberStaticField = 1;
    static String ownerClassVariable = "human";

    public  String eat(){
        String localVariable = "Test text";
        return localVariable;
    }

    public void Method(){
        System.out.println("animal method");
    }
}
