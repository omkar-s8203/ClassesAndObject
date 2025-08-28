public class Car {
String brand;
String model;
int currentFule;
boolean isStarted;
float speed;
float average;

public void  setBrand(String brand) {
    this.brand = brand;
}

public void setModel(String model){
    this.model = model;
}

public void setCurrentFule(int currentFule){
    this.currentFule = currentFule;
}

public float average(float average){
    this.average=average;
    return average;
}

public float maxDistance(){
    return average*this.currentFule;
}

public void startCar(){
    if(currentFule==0){
        System.out.println("can't start car... please refule the car");
    } else if (currentFule < 5) {
        System.out.println("Car is on Reserve mode only travel: "+maxDistance()+" Km");
    } else {
        System.out.println("car started ...... bruuuuuuu");
        isStarted=true;
    }
}

public void drive(int km){
    if(isStarted){
        System.out.println("car has in drive mode!! bruuuu bruuu ");
        System.out.println("car had "+currentFule+" liters, and can run for "+maxDistance()+" Km");
    }else {
        System.out.println("please start the car!!!!");
    }
}


public void stopCar(){
    if(isStarted){
        System.out.println("car stopped");
        isStarted=false;
    }
}

public void reFule(int fule){
    if(isStarted){
        System.out.println("stop the car to refule the car");
    }else {
        currentFule+=fule;
    }
}

}



/*
* Car Class
Attributes (data members):
String brand
String model
int fuelLevel (in percentage, 0–100)
boolean isStarted

Methods (behaviors):
startCar() → if fuel > 0, start the car, else show “Cannot start, fuel empty.”
stopCar() → stop the car.
drive(int km) → reduce fuel based on distance (e.g., 1 km consumes 2 fuel units). If fuel is not enough, show “Car stopped, fuel empty.”
refuel(int amount) → increase fuel level but not more than 100.
checkFuel() → display current fuel level.*/