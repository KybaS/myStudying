package java_tutorial;

public class Cat extends Animal {

    String aliasInstanceVariable = "Cat's alias";

    public void catData(){
        nameNonStaticField = "Cat's name";   //now local variable
        System.out.println(nameNonStaticField);
        System.out.println(aliasInstanceVariable);
        System.out.println(numberStaticField);
        System.out.println(ownerClassVariable);
    }
}
