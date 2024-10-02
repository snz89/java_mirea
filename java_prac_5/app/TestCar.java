package app;

import vehicles.*;

public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car("LADA", "A123BC", "White", 2020, "Ilya", "INS12345");
        ElectricCar car2 = new ElectricCar("Tesla Model 3", "E456FG", "Red", 2023, "Anton", "INS67890", 75);

        System.out.println("Car1 Year: " + car1.getYear());
        System.out.println("Car1 Owner: " + car2.getOwnerName());
        System.out.println("Car2 Insurance Number: " + car2.getInsuranceNumber());

        car1.setYear(2021);
        car2.setOwnerName("Aleksey");
        car2.setInsuranceNumber("INS73878");

        System.out.println("Car2 Battery: " + car2.getBatteryCapacity());

        System.out.println(car1);
        System.out.println(car2);
    }
}