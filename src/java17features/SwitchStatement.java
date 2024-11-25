package java17features;

public class SwitchStatement {
    public static void main(String[] args) {
        switchBefore17();
        System.out.println();
        switchAfter17();
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

    }

}
