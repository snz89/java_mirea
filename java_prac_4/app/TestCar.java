package app;

import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.Vehicle;

public class TestCar {
    public static void main(String[] args) {
        Vehicle car1 = new Car("LADA", "A123BC", "White", 202, "Ilya", "INS12345");
        Vehicle car2 = new ElectricCar("Tesla Model 3", "E456FG", "Red", 2023, "Anton", "INS67890", 75);

        System.out.println(car1.vehicleType());
        System.out.println(car2.vehicleType());

        car1.setModel("Lada Granta");
        car2.setColor("Blue");

        System.out.println(car1);
        System.out.println(car2);
    }
}
