public class Main {
    public static void main(String[] args) {

        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS", 10.40, 8);
        runRace(ferrari);

        Car gasCar = Car.getCar("Gas powered car", "2000 White BMW 3 series");
        runRace(gasCar);

        Car electricCar = Car.getCar("Electric powered car", "2023 Gray Tesla Model Y");
        runRace(electricCar);

        Car hybridCar = Car.getCar("Hybrid car", "2014 White Toyota Prius Plug-In");
        runRace(hybridCar);

    }

    public static void runRace(Car car) {

        System.out.println("-".repeat(100));
        car.getDescription();
        car.startEngine();
        car.drive();
    }
}
