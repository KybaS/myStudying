package allLessonsJavvy.tenthLessonMethods;

public class MethodsMain {
    public static void main(String[] args) {
        Methods myMethods = new Methods("my");

        //test
        myMethods.doubleIt(5);
        System.out.println("");

        //block0
        System.out.print("block 0 - ");
        myMethods.doubleIt(5);

        //block1
        System.out.println(" ");
        System.out.print("block 1 - ");
        System.out.println(myMethods.doublE(20));
        System.out.print("block 1/2 - ");
        System.out.print(myMethods.myNum);

        //block2
        System.out.println("");
        System.out.print("block 2 - ");
        System.out.println(myMethods.sumUp(1, 10, 9, 7));

        //block3
        int[] myNumbrs = {3, -3, 5, 10};
        System.out.print("block 3 - ");
        myMethods.process(myNumbrs);

        //block4
        int myNum = 21;
        System.out.println("");
        System.out.print("block 4 - ");
        myMethods.addSix(7);
        System.out.print(", " + myNum);

        //block5
        double time = Methods.calkTime(123.5, 19.0);
        System.out.println("");
        System.out.print("block 5 - ");
        System.out.println("ETA: " + time);

        //block6
        String str = myMethods.reverse("abyK annA");
        System.out.print("block 6 - ");
        System.out.println(str);
    }
}
