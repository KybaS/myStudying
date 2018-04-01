package docs;

public class SwitchStatement {
    public static void main(String[] args) {
        int number = 1;
        String day;
        switch (number) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            default:
                day = "Rest day";
                break;
        }
        System.out.println("day = " + day);

        {
            int rating = 47;
            char grade;

            if (rating >= 90) {
                grade = 'A';
            } else if (rating >= 80) {
                grade = 'B';
            } else if (rating >= 50) {
                grade = 'C';
            } else if (rating >= 30) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println("grade = " + grade);
        }
        {
            int rate = 2;
            if (rate == 0) {
                System.out.println(rate + " wrong digital");
            } else if (rate == 1) {
                System.out.println(rate + " == 1");
            } else if (rate == 2) {
                System.out.println(rate + " == 2");
            } else {
                System.out.println(rate + " test");
            }
        }
        {
            int count = 0;
            while (count < 10){
                count++;
                System.out.println("count: " + count);
            }
        }
        {
            int count1 = 0;
            do {
                System.out.println("count1 is: " + count1);
                count1++;
            }while (count1 < 10);
        }
        {
            for (int i = 1; i < 10; i++){
                System.out.println("for = " + i);
            }
        }
        {
            int[]numbers = {1,2,3,4,5,6,7,8,9};
            for (int item:numbers){
                System.out.println("item is: " + item);
            }
        }
    }
}

