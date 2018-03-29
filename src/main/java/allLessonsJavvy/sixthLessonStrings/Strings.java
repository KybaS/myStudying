package allLessonsJavvy.sixthLessonStrings;

import java.util.Scanner;

public class Strings {
    public static void main(String[]args){

        //block0
        String myString = "test text";
        int length = myString.length();
        String output = "That's " + length;
        System.out.print("block 0 - ");
        System.out.println(output);

        //block1
        String a = "";
        String b = new String();
        System.out.print("block 1 - ");
        System.out.println(a.equals(b));

        //block2
        String c = "Java is ";
        String d = c.concat("awesome!");
        System.out.print("block 2 - ");
        System.out.println(d);

        //block3
        char[] myChar = {'a', 'b', 'c', 'd'};
        String g = new String(myChar);
        System.out.print("block 3 - ");
        System.out.println(g);

        //block4
        String idol = "Mr. Jon";
        if (idol.startsWith("Mrs.")){
            String outpt = "Hello madam!";
            System.out.print("block 4 - ");
            System.out.println(outpt);
        }else if(idol.startsWith("Mr.")){
            System.out.print("block 4 - ");
            String outpt = "Hello sir!";
            System.out.println(outpt);
        }else {
            System.out.print("block 4 - ");
            System.out.println("Hello all!");
        }

        //block5
        String people = "Anna";
        if (people.endsWith("a")){
            String outs = "Hello madam!";
            System.out.print("block 5 - ");
            System.out.println(outs);
        }else {
            System.out.print("block 5 - ");
            String outs = "Hello sir!";
            System.out.println(outs);
        }

        //block6
        String mString = "";
        if (mString.isEmpty()){
            System.out.print("block 6 - ");
            System.out.println("It's empty!");
        }

        //block7 not from app
        String s = "ах ты бяка";
        String s2 = s.replaceAll("бяка", "вырезано цензурой");
        System.out.println(s2);

        //block8 not from app
        System.out.println("");
        System.out.println("Ця програмка покаже чому дорівнює ваша вага на місяці");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Введіть вашу вагу на землі - ");
        double weightOnEarth = keyboard.nextInt();

        double weightOnMoon = weightOnEarth * 0.17;

        System.out.println("Ваша вага на місяці буде " + weightOnMoon + " кг.");


    }
}
