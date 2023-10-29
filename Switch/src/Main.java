public class Main  {
    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day) {
            case 0 -> {yield "Sunday";}
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
        System.out.println(day + " stands for " + dayOfWeek);
    }

    public static void printWeekDay (int day) {
        String dayOfTheWeek;
        if (day == 0) {
            dayOfTheWeek = "Sunday";
        } else if (day == 1) dayOfTheWeek = "Monday";
        else if (day == 2) {
            dayOfTheWeek = "Tuesday";
        } else if (day == 3) {
            dayOfTheWeek = "Wednesday";
        } else if (day == 4) {
            dayOfTheWeek = "Thursday";
        } else if (day == 5) {
            dayOfTheWeek = "Friday";
        } else if (day == 6) {
            dayOfTheWeek = "Saturday";
        }else dayOfTheWeek = "Invalid Day";
        System.out.println(day + " stands for " + dayOfTheWeek);
    }
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            printDayOfWeek(i);
        }
        for (int i = 0; i < 7; i++) {
            printWeekDay(i);
        }
    }
}
