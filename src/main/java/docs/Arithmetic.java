package docs;

public class Arithmetic {
    public static void main(String[]args){

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int original_result = result;

        result = result - 2;
        System.out.println(original_result + " - 2 = " + result);
        original_result = result;

        result = result * 20;
        System.out.println(original_result + " * 20 = " + result);
        original_result = result;

        result = result / 2;
        System.out.println(original_result + " / 2 = " + result);
        original_result = result;

        result = result % 4;
        System.out.println(original_result + " % 4 = " + result);

        {
            //prefix/postfix unary increment operator
            int i = 3;
            i++;
            // prints 4
            System.out.println(i);
            ++i;

            // prints 5
            System.out.println(i);

            // prints 6
            System.out.println(++i);

            // prints 6
            System.out.println(i++);

            // prints 7
            System.out.println(i);
        }
        {
            //comparison operators
            int value1 = 2;
            int value2 = 2;
            if(value1 == value2)
                System.out.println("value1 == value2");
            if(value1 != value2)
                System.out.println("value1 != value2");
            if(value1 > value2)
                System.out.println("value1 > value2");
            if(value1 < value2)
                System.out.println("value1 < value2");
            if(value1 <= value2)
                System.out.println("value1 <= value2");
        }
        {
            //?: operator
            int value1 = 1;
            int value2 = 2;
            int results;
            boolean someCondition = false;
            results = someCondition ? value1 : value2;

            System.out.println(results);
        }
    }
}
