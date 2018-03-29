package allLessonsJavvy.seventhLessonArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists {
    public static void main(String[] args) {

        //block0
        ArrayList<String> names = new ArrayList<>();
        names.add("Jack");
        names.add("Anna");
        names.add("Jon");

        String s = String.join(",", names);
        System.out.print("block 0 - ");
        System.out.println(s);

        //block1
        ArrayList<String> people = new ArrayList<>();
        people.add("Neo");
        people.add("Sara");
        people.add("Anna");

        String name = people.get(2);
        System.out.print("block 1 - ");
        System.out.println(name);

        //block2
        ArrayList<String> human = new ArrayList<>();
        human.add("Anna");
        human.add("ergiy");
        human.add("Rex");

        human.set(1, "Sergiy");

        String o = String.join(",", human);
        System.out.print("block 2 - ");
        System.out.println(o);

        //block3
        ArrayList<String> person = new ArrayList<>();
        person.add("Jack");
        person.add("Sara");
        person.add("Conner");
        person.add("Sara");
        person.add("Jackson");
        person.add("Andrey");

        person.remove(3);

        String t = String.join(",", person);
        System.out.print("block 3 - ");
        System.out.println(t);

        //block4
        ArrayList<String> innocents = new ArrayList<>();

        boolean e1 = innocents.isEmpty();
        boolean e2 = innocents.size() == 0;

        if (e1 && e2) {
            System.out.print("block 4 - ");
            System.out.println("Innocents: 0");
        }

        //block5
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Stive");
        names1.add("Rey");
        names1.add("Bred");

        Object[] names2 = names1.toArray();

        String w = Arrays.toString(names2);
        System.out.print("block 5 - ");
        System.out.println(w);

        //block6

        ArrayList<String> planets = new ArrayList<>();
        planets.add("Ruby");
        planets.add("php");

        planets.remove(0);
        planets.add("Java");

        String h = String.join(",", planets);
        System.out.print("block 6 - ");
        System.out.println(h);

    }
}
