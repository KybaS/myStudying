package java_tutorial;

public class Dog extends Animal {

    public Dog(String name, int age){
        System.out.println(name);
        System.out.println(age);
    }

    public void bark(int sound, String value){
        System.out.println("gav gav, sound level = " + sound + " " + value);
    }
}
