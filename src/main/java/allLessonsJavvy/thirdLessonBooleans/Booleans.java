package allLessonsJavvy.thirdLessonBooleans;

public class Booleans {
    public static void main(String[]args){

        //block1
        boolean myBoolean = 5 > 3;
        System.out.print("block1 - ");
        System.out.println(myBoolean);

        //block2
        int six = 6;
        boolean myBool = 5 >= six;
        System.out.print("block2 - ");
        System.out.println(myBool);

        //block3
        int siks = 6;
        boolean myBoo = siks == 6;
        System.out.print("block3 - ");
        System.out.println(myBoo);

        //block4
        boolean myBoole = 5 != 6;
        System.out.print("block4 - ");
        System.out.println(myBoole);

        //block5
        boolean theTruth = true;
        boolean whatWayneSaid;
        whatWayneSaid = !theTruth;
        System.out.print("block5 - ");
        System.out.println(whatWayneSaid);

        //block6
        boolean b1 = true;
        boolean b2 = 3 > 137;
        boolean result  = b1 && b2;
        System.out.print("block6 - ");
        System.out.println(result);

        //block7
        boolean bool1 = false;
        boolean bool2 = true;
        boolean res = bool1 || bool2;
        System.out.print("block7 - ");
        System.out.println(res);


    }
}
