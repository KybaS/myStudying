package docs;

public class DemoSwitch {

    public void monthDays(int year, int numberOfMonth) {
        String monthName;
        switch (numberOfMonth) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Summer forever!!!";
                break;
        }

        int numDays = 0;
        switch (numberOfMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) &&
                        !(year % 100 == 0))
                        || (year % 400 == 0))
                    numDays = 29;
                else numDays = 28;
                break;
            default:
                System.out.println("invalid month");
                break;
        }
        System.out.println(monthName + " - " + numDays);
    }
}

