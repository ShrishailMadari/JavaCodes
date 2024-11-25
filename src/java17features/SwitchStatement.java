package java17features;

public class SwitchStatement {
    public static void main(String[] args) {
        switchBefore17();
        System.out.println();
        switchAfter17();
        System.out.println();
        String string = switchWithReturnType(26);
    }

    private static String  switchWithReturnType(Object value) {
        return switch (value) {
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s;
            case Double d -> "Double: " + d;
            case Boolean b -> "Boolean: " + b;
            default -> "Unknown type: " + value.getClass().getSimpleName(); };
    }

    private static void switchAfter17() {
        int day = 6;
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "invalid";
        };
        System.out.println(dayName);

    }

    private static void switchBefore17() {
        int day = 6;
        int month = 12;

        String dayName;
        switch (day){
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "invalid";

        }
        System.out.println(dayName);
        System.out.println();
        String monthName;
        switch (month){
            case 1:
                monthName = "Jan";
                break;
            case 2:
                monthName = "Feb";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "Apr";
                break;
            case 5:
                monthName = "Jan";
                break;
            case 6:
                monthName = "May";
                break;
            case 7:
                monthName = "June";
                break;
            case 8:
                monthName = "July";
                break;
            case 9:
                monthName = "Aug";
                break;
            case 10:
                monthName = "Oct";
                break;
            case 11:
                monthName = "Nov";
                break;
            case  12:
                monthName = "Dec";
                break;
            default:
                monthName = "Invalid MonthName";

        }
        System.out.println(monthName);

    }

}
