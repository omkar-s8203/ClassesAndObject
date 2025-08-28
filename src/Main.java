//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("jay shri ganesha!!!");
        Car car = new Car();

        car.setBrand("BMW");
        car.setModel("X1");
        car.setCurrentFule(0);

        car.startCar();
        car.reFule(6);
        car.startCar();
        car.drive(5);

    }
}