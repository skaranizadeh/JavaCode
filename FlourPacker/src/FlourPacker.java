public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int bigSpots = goal / 5;
        int smallSpots = goal % 5;

        if (bigCount >= bigSpots) {
            if (smallSpots > 0){
                return smallCount >= smallSpots;
            }else return true;
        }else {
            bigSpots = bigSpots - bigCount;
            smallSpots = (bigSpots * 5) + smallSpots;
            return smallCount >= smallSpots;
        }
    }

    public static void main(String[] args) {
        System.out.println(canPack(-3, 2, 12));
    }
}
