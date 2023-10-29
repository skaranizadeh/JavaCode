import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number or a character to quit: ");
            String input = scanner.nextLine();
            try {
                int number = Integer.parseInt(input);
                if (min == 0 && max == 0) {
                    min = number;
                    max = number;
                } else if (number < min) {
                    min = number;
                } else if (number > max) {
                    max = number;
                }
            } catch (NumberFormatException e) {
                break;
            }
        }
        System.out.println("The min is " + min + " the max is " + max);
    }
}
