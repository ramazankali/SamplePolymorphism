package vehicles;

import java.util.List;

public class Car extends Vehicle{

    private final VehicleType vehicleType=VehicleType.CAR;
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

    public Car() {

    }

    public Car(VehicleType vehicleType
            , String make
            , String model
            , String productionYear
            , String vin) {

        this.make = make;
        this.model = model;
        this.productionYear = productionYear;
        this.vin = vin;
    }

    public Car(VehicleType vehicleType
            , String make
            , String model
            , String productionYear
            , String sacheNo
            , String vin) {

        this.make = make;
        this.model = model;
        this.productionYear = productionYear;
        this.sacheNo = sacheNo;
        this.vin = vin;
    }
    /*------ Getters & Setters   -----------------------------*/

    public VehicleType getVehicleType() {
        System.out.println(vehicleType);
        return vehicleType;
    }

    public String getSubVehicleType() {
        System.out.println(subVehicleType);
        return subVehicleType;
    }

    public void setSubVehicleType(String subVehicleType) {
        this.subVehicleType = subVehicleType;
    }

    public String getMake() {
        System.out.println(make);
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        System.out.println(model);
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProductionYear() {
        System.out.println(productionYear);
        return productionYear;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    public int getNumberOfDoors() {
        System.out.println(numberOfDoors);
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getPassengerCapacity() {
        System.out.println(passengerCapacity);
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getNumberOfAxles() {
        System.out.println(numberOfAxles);
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    public double getGrossWeight() {
        System.out.println(grossWeight);
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
