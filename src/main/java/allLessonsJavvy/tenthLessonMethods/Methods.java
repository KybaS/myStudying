package allLessonsJavvy.tenthLessonMethods;

public class Methods {

    {
        System.out.println("initialization block, it is always called before any constructor");
    }

    {
        System.out.println("second initialization block");
    }

    public Methods(String test){
        System.out.println(test + " constructor!");
    }

        //block0
        void doubleIt(int number){
            System.out.print(number * 2);
        }

        //block1
        int doublE(int num){
            int result = num * 2;
            return result;
        }
        int myNum = doublE(30);

        //block2
        int sumUp(int... numb){
        int result = 0;
        for (int n : numb){
            result += n;
        }
        return result;
        }

        //block3
        int addFive(int number){
            return number + 5;
        }

        void process(int[] numbers) {
            for (int n : numbers) {
                n = addFive(n);
                System.out.print(n + ", ");
            }
        }

        //block4
        void addSix(int number){
                number +=6;
        System.out.print(number);
       }

       //block5
         static double calkTime(double distance, double speed){
            return distance / speed;
         }

         //block6
        String reverse(String a){
             String result = "";
             int l = a.length();
             for (int i = 0; i < l; i++){
                 result = a.charAt(i) + result;
             }
             return result;
        }
}
