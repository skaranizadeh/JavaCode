public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(65, 0));
        System.out.println(getDurationString(3945));
    }
    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            return getDurationString(seconds / 60, seconds % 60);
        }
        return "Invalid input ( seconds should be greater or equal to 0";

    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && (seconds >= 0 && seconds <= 59))
            return String.format("%dh %dm %ds", minutes / 60, minutes % 60, seconds);
        return "Invalid input ( minutes should be greater than or equal to 0, seconds should be greater than or equal to 59";
    }
}
