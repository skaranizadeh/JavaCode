public class Main {
    public static boolean isPalindrome(int number) {
        if (number == 0) {
            return false;
        }
        int startNumber = number;
        int reverse = 0;
        int lastDigit = 0;

        while (number != 0) {
            lastDigit = number % 10;
            number = number / 10;
            reverse *= 10;
            reverse += lastDigit;

        }
        if (reverse == startNumber) {
            return true;
        }else
            return false;
    }
    public static void main(String[] args) {
        int number = 123321;
        System.out.println("Is " + number + " a Palindrome: " + isPalindrome(number));
    }

}
