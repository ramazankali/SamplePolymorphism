package vehicles;

import java.util.List;

public class Vehicle {
    private final String name="Vehicle";
    private VehicleType vehicleType;
    private String subVehicleType;

    private String make;
    private String model;
    private String productionYear;

    private int numberOfDoors;
    private int passengerCapacity;
    private int numberOfAxles;
    private double grossWeight;
    private double emptyWeight;
    private List<String> options;
    private String sacheNo;
    private String vin;

    /*------ Constructors        -----------------------------*/

    public Vehicle() {
    }

    public Vehicle(VehicleType vehicleType
            , String make
            , String model
            , String productionYear
            , String vin) {
        this.vehicleType = vehicleType;
        this.make = make;
        this.model = model;
        this.productionYear = productionYear;
        this.vin = vin;
    }

    public Vehicle(VehicleType vehicleType
            , String make
            , String model
            , String productionYear
            , String sacheNo
            , String vin) {
        this.vehicleType = vehicleType;
        this.make = make;
        this.model = model;
        this.productionYear = productionYear;
        this.sacheNo = sacheNo;
        this.vin = vin;
    }
    /*------ Getters & Setters   -----------------------------*/

    public String getName() {
        return name;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getSubVehicleType() {
        return subVehicleType;
    }

    public void setSubVehicleType(String subVehicleType) {
        this.subVehicleType = subVehicleType;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    public double getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(double grossWeight) {
        this.grossWeight = grossWeight;
    }

    public double getEmptyWeight() {
        return emptyWeight;
    }

    public void setEmptyWeight(double emptyWeight) {
        this.emptyWeight = emptyWeight;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public String getSacheNo() {
        return sacheNo;
    }

    public void setSacheNo(String sacheNo) {
        this.sacheNo = sacheNo;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
    /*------ Common Methods      -----------------------------*/

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", subVehicleType='" + subVehicleType + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", productionYear='" + productionYear + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                ", passengerCapacity=" + passengerCapacity +
                ", numberOfAxles=" + numberOfAxles +
                ", grossWeight=" + grossWeight +
                ", emptyWeight=" + emptyWeight +
                ", options=" + options +
                ", sacheNo='" + sacheNo + '\'' +
                ", vin='" + vin + '\'' +
                '}';
    }


}
