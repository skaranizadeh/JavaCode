public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int j = 0;
        for (int i = 1; i <= 1000 && j < 5; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " is dividable on both 3 and 5");
                sum += i;
                j++;
            }
        }
        System.out.println("The sum of the numbers dividable on both 3 and 5 is = " + sum);
    }
}
