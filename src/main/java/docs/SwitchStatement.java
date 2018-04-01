package docs;

import java.util.ArrayList;

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
            while (count < 10) {
                count++;
                System.out.println("count: " + count);
            }
        }
        {
            int count1 = 0;
            do {
                System.out.println("count1 is: " + count1);
                count1++;
            } while (count1 < 10);
        }
        {
            for (int i = 1; i < 10; i++) {
                System.out.println("for = " + i);
            }
        }
        {
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            for (int item : numbers) {
                System.out.println("item is: " + item);
            }
        }
        {
            ArrayList<String> names = new ArrayList<>();
            names.add("Jack");
            names.add("Anna");
            names.add("Jon");
            names.add("Arnold");
            for (String name : names) {
                System.out.println("Name: " + name);
            }
        }
        {
            int[] arrayOfDigits = {4, 3, 70, 15,
                    101, 1, 34, 56, 44, 777, 0};
            int searchFor = 777;
            int i;
            boolean foundIt = false;
            for (i = 0; i < arrayOfDigits.length; i++) {
                if (arrayOfDigits[i] == searchFor) {
                    foundIt = true;
                    break;
                }
            }
            if (foundIt) {
                System.out.println("Found " + searchFor + " at index " + i);
            } else {
                System.out.println(searchFor + " not in the array");
            }
        }
        {
            //labeled "search" for break
            int[][] arrayOfInts = {
                    {1, 3, 5, 7, 9},
                    {2, 4, 6, 8, 10},
                    {0, 11, 48, 777}
            };
            int searchIt = 48;

            int i;
            int j = 0;
            boolean foundInt = false;

            search:
            for (i = 0; i < arrayOfInts.length; i++) {
                for (j = 0; j < arrayOfInts[i].length; j++) {
                    if (arrayOfInts[i][j] == searchIt) {
                        foundInt = true;
                        break search;
                    }
                }
            }
            if (foundInt) {
                System.out.println("found " + searchIt + " at " + i + ", " + j);
            } else {
                System.out.println(searchIt + " is absent in this array");
            }
        }
        {
            //continue Statement
            String searchMe = "my own text " + "for test t's chars";
            int max = searchMe.length();
            int numTs = 0;

            for (int i = 0; i < max; i++) {
                if (searchMe.charAt(i) != 't') {
                    continue;
                }
                numTs++;
            }
            System.out.println("found " + numTs + " t's in the string");
        }
        {
            //DO WHILE STATEMENT evaluates its expression at the bottom of the loop instead of the top
            int num = 1;
            do {
                System.out.println("result = " + num);
                num++;
            } while (num < 5);
        }
        {
            //infinite loop using the for statement
//            for (int i=3; i>2; i++){
//                System.out.println(i);
//            }
        }
        {
            // infinite loop using the while statement
//            int count = 5;
//            while (count > 4){
//                System.out.println(count);
//            }
        }
        {
            int sum = -3;
            if (sum >= 0)
                if (sum == 0)
                    System.out.println("first string");
                else System.out.println("second string");

            System.out.println("third string");
        }
        {
            int sum = -3;
            if (sum >= 0) {
                if (sum == 0) {
                    System.out.println("first string");
                } else System.out.println("second string");
            }
            System.out.println("third string");

        }
    }
}

