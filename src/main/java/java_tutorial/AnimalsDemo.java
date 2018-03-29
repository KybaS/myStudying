package java_tutorial;


public class AnimalsDemo {
    public static void main(String[]args){
        System.out.println("constructor dog:");
        Dog dog = new Dog("Sirko", 10);
        dog.bark(10, "dBA");

        Animal animal = new Animal();
        Cat cat = new Cat();

        System.out.println("cat data:");
        cat.catData();

        System.out.println("animal class:");
        System.out.println(animal.eat());
        animal.Method();
    }
}
