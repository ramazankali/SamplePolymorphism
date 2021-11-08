package vehicles;

import java.util.List;

public class SUV extends Vehicle{

    private final VehicleType vehicleType=VehicleType.SUV;
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

    public SUV() {

    }

    public SUV(VehicleType vehicleType
            , String make
            , String model
            , String productionYear
            , String vin) {

        this.make = make;
        this.model = model;
        this.productionYear = productionYear;
        this.vin = vin;
    }

    public SUV(VehicleType vehicleType
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
        return vehicleType;
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

//    @Override
    public String toString() {
        return "Vehicle{" +
                ", vehicleType='" + (vehicleType==null? "":vehicleType) + '\'' +
                ", subVehicleType='" + (subVehicleType==null? "":subVehicleType) + '\'' +
                ", make='" + (make==null? "":make) + '\'' +
                ", model='" + (model==null? "":make) + '\'' +
                ", productionYear='" + (productionYear==null? "":productionYear) + '\'' +
                ", numberOfDoors=" + (numberOfDoors==0? "":numberOfDoors) +
                ", passengerCapacity=" + (passengerCapacity==0? "":passengerCapacity) +
                ", numberOfAxles=" + (numberOfAxles==0? "":numberOfAxles) +
                ", grossWeight=" + (grossWeight==0? "":grossWeight) +
                ", emptyWeight=" + (emptyWeight==0? "":emptyWeight) +
                ", options=" + (options==null? "":options) +
                ", sacheNo='" + (sacheNo==null? "":sacheNo) + '\'' +
                ", vin='" + (vin==null? "":vin) + '\'' +
                '}';
    }


}
