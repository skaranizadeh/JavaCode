public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void getDescription() {
        System.out.println(description);
    }

    // factory method
    public static Car getCar(String type, String description){
        return switch(type.toUpperCase().charAt(0)) {
            case 'G' -> new GasPoweredCar(description);
            case 'E' -> new ElectricCar(description);
            case 'H' -> new HybridCar(description);
            default -> new Car(description);
        };

    }

    public void startEngine() {
        System.out.println("Car -> startEngine");
    }

    protected void runEngine() {
        System.out.println("Car -> runEngine");
    }

    public void drive() {
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
        runEngine();
    }
}

class GasPoweredCar  extends Car{

    private double avgKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    public GasPoweredCar(String description) {
        this(description, 15.40, 4);
    }


    @Override
    public void startEngine() {
        System.out.println("GasPoweredCar -> startEngine");
    }

    @Override
    protected void runEngine() {
        System.out.printf("GasPoweredCar -> runEngine," +
                " avg kilometer per gas liter is %.2f, " +
                "it has %d cylinders%n", avgKmPerLiter, cylinders);
    }

//    @Override
//    public void drive() {
//        System.out.println("GasPoweredCar -> driving, type is " + getClass().getSimpleName());
//        runEngine();
//    }
}

class ElectricCar extends Car {

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public ElectricCar(String description) {
        this(description, 500, 70);
    }

    @Override
    public void startEngine() {
        System.out.println("ElectricCar -> startEngine");
    }

    @Override
    protected void runEngine() {
        System.out.printf("ElectricCar -> switch battery on, Ready!" +
                " avg kilometer per charge is %.2f, " +
                "it has %dkw battery%n", avgKmPerCharge, batterySize);
    }

//    @Override
//    public void drive() {
//        System.out.println("ElectricCar -> drive, type is " + getClass().getSimpleName());
//        runEngine();
//    }
}

class HybridCar extends Car {

    private double avgKmPerLiter;
    private int batterySize;
    private int cylinder;

    public HybridCar(String description, double avgKmPerLiter, int batterySize, int cylinder) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinder = cylinder;
    }

    public HybridCar(String description) {
        this(description, 21.50, 10, 4);
    }

    @Override
    public void startEngine() {
        System.out.println("HybridCar -> startEngine and switch battery on");
    }

    @Override
    protected void runEngine() {
        System.out.printf("HybridCar -> runEngine," +
                " avg kilometer per gas liter is %.2f, " +
                "it has %dkw battery," +
                " it has %d cylinders%n", avgKmPerLiter, batterySize, cylinder);
    }

//    @Override
//    public void drive() {
//        System.out.println("HybridCar -> drive, type is " + getClass().getSimpleName());
//        runEngine();
//    }
}



