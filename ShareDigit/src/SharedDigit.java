public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {
        if ((a < 11 || a > 100) || (b < 11 || b > 100)) {
            return false;
        }
        // (12, 23) -> true, (9, 99) -> false, (15, 55) -> true
        int digitA = 0;
        int digitB = 0;
        while (a > 0) {
            digitA = a % 10;
            int bi = b;
            while (bi > 0) {
                digitB = bi %10;
                bi /= 10;
                if (digitA == digitB) {
                    return true;
                }
            }
            a /= 10;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,13));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
    }
}
