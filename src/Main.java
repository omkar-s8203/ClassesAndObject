public class Main {
    public static void main(String[] args) {
        System.out.println("🚗 Car Simulation Started 🚗");
        System.out.println("============================");

        Car car = new Car()
                .setBrand("BMW")
                .setModel("X1")
                .setCurrentFule(0)     // no fuel initially
                .setAverage(15);       // 15 km/l mileage

        // 1. Try starting with no fuel
        car.startCar();

        // 2. Refuel 10 litres
        car.reFule(10);

        // 3. Start the car
        car.startCar();

        // 4. Drive 50 km
        car.drive(50);

        // 5. Check remaining distance possible
        System.out.println("Car can still travel up to: " + car.maxDistance() + " km");

        // 6. Drive another 120 km (will run out of fuel)
        car.drive(120);

        // 7. Stop the car
        car.stopCar();

        // 8. Refuel again
        car.reFule(20);

        // 9. Restart and drive
        car.startCar().drive(200).stopCar();

        System.out.println("============================");
        System.out.println("🚗 Car Simulation Ended 🚗");
    }
}
