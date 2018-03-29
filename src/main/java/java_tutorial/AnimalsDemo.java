package java_tutorial;


public class AnimalsDemo {
    public static void main(String[]args){

        Dog dog1 = new Dog("Sirko", 10);
        Animal animal = new Animal();

        System.out.println(dog1);
        System.out.println(animal.eat());
        animal.Method();
    }
}
