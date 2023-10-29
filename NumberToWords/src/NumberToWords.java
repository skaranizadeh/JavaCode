public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        if (number == 0) System.out.println("Zero");
        int count = getDigitCount(number);
        number = reverse(number);
        int zero = count - getDigitCount(number);

        while (number > 0) {
            int digit = 0;
            digit =  number % 10;
//            System.out.println(switch (digit) {
//                case 0 -> "Zero ";
//                case 1 -> "One ";
//                case 2 -> "Two ";
//                case 3 -> "Three ";
//                case 4 -> "Four ";
//                case 5 -> "Five ";
//                case 6 -> "Six ";
//                case 7 -> "Seven ";
//                case 8 -> "Eight ";
//                case 9 -> "Nine ";
//                default -> "Invalid Value";
//            });
            switch (digit) {
                case (0):
                    System.out.println("Zero");
                    break;
                case (1):
                    System.out.println("One");
                    break;
                case (2):
                    System.out.println("Two");
                    break;
                case (3):
                    System.out.println("Three");
                    break;
                case (4):
                    System.out.println("Four");
                    break;
                case (5):
                    System.out.println("Five");
                    break;
                case (6):
                    System.out.println("Six");
                    break;
                case (7):
                    System.out.println("Seven");
                    break;
                case (8):
                    System.out.println("Eight");
                    break;
                case (9):
                    System.out.println("Nine");
                    break;
            }
            number /= 10;
        }
        if (zero != 0) {
            for (int i = 0; i <zero; i++ ) {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number) {
        int digit = 0;
        int reverseNumber = 0;
        while (number != 0) {
            reverseNumber *= 10;
            digit = number % 10;
            reverseNumber += digit;
            number /= 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        if (number == 0) return 1;
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

        System.out.println("the reverse of " + -121 + " is " + reverse(-121));
        System.out.println("the reverse of " + 1212 + " is " + reverse(1212));
        System.out.println("the reverse of " + 1234 + " is " + reverse(1234));
        System.out.println("the reverse of " + 100 + " is " + reverse(100));

        System.out.println("________________");
        numberToWords(123);
        System.out.println("________________");
        numberToWords(1010);
        System.out.println("________________");
        numberToWords(1000);
        System.out.println("________________");
        numberToWords(-12);
        System.out.println("________________");
        numberToWords(0);
        System.out.println("________________");
        numberToWords(10);

    }
}
