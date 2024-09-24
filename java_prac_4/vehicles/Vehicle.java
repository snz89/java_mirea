package vehicles;

abstract public class Vehicle {
    private String model;
    private String license;
    private String color;
    private int year;
    private String ownerName;
    private String insuranceNumber;
    protected String engineType;

    public Vehicle(String model, String license, String color, int year, String ownerName, String insuranceNumber) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
    }

    public abstract String vehicleType();

    //region геттеры
    public String getModel() {
        return this.model;
    }

    public String getLicense() {
        return this.license;
    }

    public String getColor() {
        return this.color;
    }

    public int getYear() {
        return this.year;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public String getInsuranceNumber() {
        return this.insuranceNumber;
    }

    public String getEngineType() {
        return this.engineType;
    }
    //endregion

    //region сеттеры
    public void setModel(String model) {
        this.model = model;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void InsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    //endregion
    
    public String toString() {
        return "model=" + model +
                ", license=" + license +
                ", color=" + color +
                ", year=" + year +
                ", ownerName=" + ownerName +
                ", insuranceNumber=" + insuranceNumber +
                ", engineType=" + engineType;
    }
}
