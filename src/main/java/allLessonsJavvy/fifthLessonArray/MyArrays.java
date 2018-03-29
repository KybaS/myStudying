package allLessonsJavvy.fifthLessonArray;

import java.util.Arrays;

public class MyArrays {
    public static void main(String[]args){

        //block0
        String[] names1 = {"Jack", "Rose"};
        String output;
        output = Arrays.toString(names1);
        System.out.print("block0 - ");
        System.out.println(output);

        //block1
        String[] nameS = {"Jack", "Bob", "Den", "Tommy"};
        System.out.print("block1 - ");
        System.out.println(nameS.length);

        //block2
        String[] nameses = {"Anna", "Jonn", "Katty"};
        String name = nameses[0];
        System.out.print("block2 - ");
        System.out.println(name);

        //block3
        int[] innocents = {};  //check empty array
        boolean empty;
        empty = innocents.length == 0;
        if (empty){
            System.out.print("block3 - ");
            System.out.println("Innocents: 0");
        }else {
            System.out.print("block3 - ");
            System.out.println("array with some data");
        }

        //block4
        int[] numbers = {1,2,3,1,5};
        numbers[3] = 4;
        String outputs;
        outputs = Arrays.toString(numbers);
        System.out.print("block4 - ");
        System.out.println(outputs);

        //block5
        int level = 2;
        String[] planets = {"zero", "one", "two", "three", "fourth"};
        String p = planets[level];
        String out = "Sam -> " + p;
        System.out.print("block5 - ");
        System.out.println(out);

        //block6
        String[][] names = {              //multidimensional array
                {"Mr. ", "Mrs. ", "Ms. "},
                {"Smith", "Jones", "Anna"}
        };
        System.out.print("block6 - ");
        System.out.print(names[0][2] + names[1][2]);
        System.out.println(" , " + names[0][2] + names[1][1]);

        //block7
        char[] copyFrom = { 'd', 'e', 'k', 'i', 't', 't', 'y',
                'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[5];

        System.arraycopy(copyFrom, 2, copyTo, 0, 5);
        System.out.print("block7 - ");
        System.out.println(new String(copyTo));

        System.out.print("copyOfRange - ");
        char[] copyToChar = java.util.Arrays.copyOfRange(copyFrom, 2, 7);

        System.out.println(new String(copyToChar));
    }
}
