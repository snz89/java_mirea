package vehicles;

public class Car {
    private String ownerName;
    private String insuranceNumber;
    protected String engineType;

    public Car() {}

    // Геттеры
    public String getOwnerName() {
        return ownerName;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public String getEngineType() {
        return engineType;
    }

    // Сеттеры
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
