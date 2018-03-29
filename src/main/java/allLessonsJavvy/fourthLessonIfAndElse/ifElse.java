package allLessonsJavvy.fourthLessonIfAndElse;

public class ifElse {
    public static void main(String[]args) throws NullPointerException{

        //block0
        int six = 6;
        boolean myBoolean = six == 6;
        if(myBoolean){
            System.out.print("block0 - ");
            System.out.println("Yes!");
        }

        //block1
        boolean myBool = 5 > 6;
        if(myBool){
            System.out.print("block1 - ");
            System.out.println("if because true");
        }else {
            System.out.print("block1 - ");
            System.out.println("else because false");
        }

        //block2
        double pi = 3.14159;
        if (pi != 3.0){
            System.out.print("block2 - ");
            System.out.println("Triggered!");
        }

        //block3
        int x = 5;
        if (x==6){
            System.out.println("x is 6!");
        }else if (x == 5){
            System.out.print("block3 - ");
            System.out.println("x is 5!");
        }else {
            System.out.println("Not 5, not 6");
        }

        //block4
        int v = -3;
        if (v < 5){
            if (v > -5){
                System.out.print("block4 - ");
                System.out.println("Triggered!");
            }
        }

        //block5
        String a = "Orange";
        String b = "Apple";
        boolean myBooleanRes = a.equals(b);
        System.out.print("block5 - ");
        System.out.println(myBooleanRes);

        //block6
        try {
            String one = null;
            String two = "Apple";
            if (a == null) {
                System.out.println("null");
            } else {
                System.out.println(one.equals(two));
            }
        }catch (NullPointerException e){
            System.out.print("block6 - ");
            System.out.println("present null");
        }

        //block7
        int g = -3;
        if (g < 5 && g > -5){
            System.out.print("block7 - ");
            System.out.println("condition is true");
        }

        //block8
        int myVolume = 11;
        String output;
        if (myVolume < 11){
            output = "Is it on?";
        }else if (myVolume == 11){
            output = "It goes to 11";
        }else {
            output = "No way!";
        }
        System.out.print("block8 - ");
        System.out.println(output);
    }
}
