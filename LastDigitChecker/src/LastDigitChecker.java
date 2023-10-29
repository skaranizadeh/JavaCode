public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (!isValid(a) || !isValid(b) || !isValid(c) ) {
            return false;
        }
        // (41, 22, 71) -> true, (23, 32, 42) -> true, (9, 99, 999) -> false
        a %= 10;
        b %= 10;
        c %= 10;
        if (a == b) {
            return true;
        }else if (a == c) {
            return true;
        }else if (b == c) {
            return true;
        }else
            return false;
    }

    public static boolean isValid(int a) {
        if (a >= 10 && a <= 1000)
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(31, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

}
