public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        // 252 -> 4 , 257 -> 9, 0 -> 0, 5 -> 10, -10 -> -1
        if (number > 0 && number <= 9) {
            return number + number;
        }
        int first = 0;
        int last = 0;
        boolean flag = true;
        while (number > 0) {
            if (flag) {
                first = number % 10;
                flag = false;
            }
            last = number;
            number /= 10;
        }
        return first + last;

    }
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));

    }
}
