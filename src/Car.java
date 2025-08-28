public class Car {
    private String brand;
    private String model;
    private float currentFule;   // litres
    private boolean isStarted;
    private float average;       // km per litr

    // --- setters with chaining ---
    public Car setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public Car setCurrentFule(float currentFule) {
        this.currentFule = currentFule;
        return this;
    }

    public Car setAverage(float average) {
        this.average = average;
        return this;
    }

    // --- behaviors ---
    public Car startCar() {
        if (currentFule == 0) {
            System.out.println("Can't start car... please refuel the car");
        } else if (currentFule < 5) {
            System.out.println("Car is on Reserve mode. Can only travel: " + maxDistance() + " km");
            isStarted = true;
        } else {
            System.out.println("Car started ...... bruuuuuuu");
            isStarted = true;
        }
        return this;
    }

    public Car stopCar() {
        if (isStarted) {
            System.out.println("Car stopped");
            isStarted = false;
        }
        return this;
    }

    public Car reFule(float fule) {
        if (isStarted) {
            System.out.println("Stop the car to refuel!");
        } else {
            currentFule += fule;
            System.out.println("Car refueled, fuel now: " + currentFule + " litres");
        }
        return this;
    }

    public Car drive(int km) {
        if (isStarted) {
            float fuelNeeded = km / average;
            if (fuelNeeded <= currentFule) {
                currentFule -= fuelNeeded;
                System.out.println("Car drove " + km + " km. Fuel left: " + currentFule + " litres.");
            } else {
                float possibleDistance = currentFule * average;
                System.out.println("Not enough fuel! Car stopped after driving only " + possibleDistance + " km.");
                currentFule = 0;
                isStarted = false;
            }
        } else {
            System.out.println("Please start the car first!");
        }
        return this;
    }

    public float maxDistance() {
        return average * currentFule;
    }

    public Car checkFuel() {
        System.out.println("Fuel left: " + currentFule + " litres (" + maxDistance() + " km possible)");
        return this;
    }
}
