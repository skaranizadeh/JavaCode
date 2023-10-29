import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        long avg = 0;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            try {
                int number = Integer.parseInt(input);
                sum += number;
                counter++;
                avg = Math.round((double)sum / counter);
            } catch(NumberFormatException e) {
                break;
            }
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
