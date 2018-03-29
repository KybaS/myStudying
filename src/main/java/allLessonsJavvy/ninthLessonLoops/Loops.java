package allLessonsJavvy.ninthLessonLoops;

import java.util.HashMap;

public class Loops {
    public static void main(String[]args){

        //block0
        int c = 0;
        while (c < 3){
            c ++;
        }
        System.out.print("block 0 - ");
        System.out.println(c);

        //block1
        System.out.print("block 1 - ");
        for (int i = 1; i <= 7; i++){
            System.out.print(i);
        }

        //block2
        int sum = 0;
        String log = "0";
        for (int i = 1; i < 10; i++){
            sum += i;
            log += "+" + i;
        }
        System.out.println(" ");
        System.out.print("block 2 - ");
        System.out.println(log + "=" + sum);

        //block3 foreach loop
        String[] friends = {"Harry", "Max", "Anna"};
        System.out.print("block 3 - ");
        for (String f : friends){
            System.out.print(f+"; ");
        }

        //block4
        HashMap<String, String> people = new HashMap<>();
        people.put("Anna", "Kyba");
        people.put("Sergiy", "Kyba");

        System.out.println(" ");
        System.out.print("block 4 - ");
        for (String k : people.keySet()){
            String s = k + " ";
            s += people.get(k) + "; ";
            System.out.print(s);
        }

        //block5
        int planets = 0;
        System.out.println(" ");
        System.out.print("block 4 - ");
        String sentence = "We made it! ";
        while (planets < 3){
            planets++;
            System.out.print(sentence);
        }
    }
}
