import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.printf("Enter new #%d: ", count);
            try {
                String input = sc.nextLine();
                int d = Integer.parseInt(input);
                sum += d;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }
        } while(count <= 5);
        System.out.println("Sum is: " + sum);
    }

}
