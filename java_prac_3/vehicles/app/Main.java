package vehicles.app;

import vehicles.Car;
import vehicles.ElectricCar;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setOwnerName("Илья");
        car.setInsuranceNumber("Т596РТ");
        car.setEngineType("Gasoline");

        System.out.println("Car Owner: " + car.getOwnerName());
        System.out.println("Car Insurance: " + car.getInsuranceNumber());
        System.out.println("Car Engine Type: " + car.getEngineType());

        ElectricCar electricCar = new ElectricCar();
        electricCar.setOwnerName("Максим");
        electricCar.setInsuranceNumber("Р909НР");
        electricCar.setBatteryCapacity(200);

        System.out.println("Electric Car Owner: " + electricCar.getOwnerName());
        System.out.println("Electric Car Insurance: " + electricCar.getInsuranceNumber());
        System.out.println("Electric Car Engine Type: " + electricCar.getEngineType());
        System.out.println("Electric Car Battery Capacity: " + electricCar.getBatteryCapacity());
    }
}
