import java.util.ArrayList;
import java.util.Objects;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int gcf = 0;
        for (int i = 1; i <= first; i++) {
            if(first % i == 0) {
                for (int j = 1; j <= second; j++) {
                    if (second % i == 0) {
                        if (i == j) {
                            if(gcf < i) {
                                gcf = i;
                                break;
                            }
                        }
                    }
                }
            }
        }
        return gcf;
    }


    public static int getGreatestCommonDivisor1(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        ArrayList<Integer> firstArray = new ArrayList<>();
        ArrayList<Integer> secondArray = new ArrayList<>();
        for (int i = 1; i <= first/2; i++) {
            if (first % i == 0) {
                firstArray.add(i);
            }
        }
        firstArray.add(first);
        for (int i = 1; i <= second/2; i++) {
            if (second % i == 0) {
                secondArray.add(i);
            }
        }
        secondArray.add(second);
        int gcf = 0;
        for (int i = 0; i < firstArray.size(); i++) {
            for (int j = 0; j < secondArray.size(); j++) {
                if(Objects.equals(firstArray.get(i), secondArray.get(j))) {
                    if (firstArray.get(i) > gcf) {
                        gcf = firstArray.get(i);
                    }
                }
            }
        }
    return gcf;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor1(25, 15));
        System.out.println(getGreatestCommonDivisor(25, 15));

        System.out.println(getGreatestCommonDivisor1(12, 30));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor1(9, 18));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor1(81, 153));
        System.out.println(getGreatestCommonDivisor(81, 153));
        System.out.println(getGreatestCommonDivisor(10, 1010));

    }

}
