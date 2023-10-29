public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket,  int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double area = width * height;
        double totalBuckets = area / areaPerBucket;
        totalBuckets = totalBuckets - (double)extraBuckets;
        if (area % areaPerBucket != 0)
            return (int)totalBuckets + 1;


        return (int) totalBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = width * height;
        double totalBuckets = area / areaPerBucket;
        if (area % areaPerBucket != 0)
            return (int)totalBuckets + 1;

        return (int) totalBuckets;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if ( area <= 0 || areaPerBucket <= 0 ) {
            return -1;
        }

        double totalBuckets = area / areaPerBucket;
        if (area % areaPerBucket != 0)
            return (int)totalBuckets + 1;
        return (int) areaPerBucket;
    }


    public static void main(String[] args) {
        System.out.println("first method output");
        System.out.println(getBucketCount(-3.4,2.1,1.5,2));
        System.out.println(getBucketCount(3.4,2.1,1.5,2));
        System.out.println(getBucketCount(2.75,3.25,2.5,1));
        System.out.println(getBucketCount(0.75,0.75,0.5,0));
        System.out.println(getBucketCount(7.32,6.45,2.22,10));

        System.out.println("second method output");
        System.out.println(getBucketCount(-3.4,2.1,1.5));
        System.out.println(getBucketCount(3.4,2.1,1.5));
        System.out.println(getBucketCount(7.25,4.3,2.35));

        System.out.println("Third method output");
        System.out.println(getBucketCount(3.4,1.5));
        System.out.println(getBucketCount(6.25, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));
    }
}
