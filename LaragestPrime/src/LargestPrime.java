import java.util.ArrayList;
import java.util.List;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        //List<Integer> primeList = new ArrayList<>();
        if (number < 0 ) {
            return -1;
        }
        int maxPrime = -1;
        for (int i = number; i >= 2; i--) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0){
                    count++;
                }
            }
            if (count == 2) {
                maxPrime = i;
                //primeList.add(maxPrime);
                for(int k = 1; k < number/2; k++) {
                    if (maxPrime * k == number) {
                        //System.out.println("first: " + primeList);
                        return maxPrime;
                    }
                }
            }
        }
        //System.out.println("second: " + primeList);
        return maxPrime;
    }

    public static void main(String[] args) {

        System.out.println(getLargestPrime(-1));
    }
}
