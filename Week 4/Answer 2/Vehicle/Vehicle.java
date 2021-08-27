package Vehicle;

public class Vehicle {
    String model, fuelType;
    int noOfWheels;

    protected Vehicle(String model, String fuelType, int noOfWheels) {
        this.model = model;
        this.fuelType = fuelType;
        this.noOfWheels = noOfWheels;
    }

    protected void describe() {
        System.out.println("The model is " + model + ", it runs on " + fuelType + " and has " + noOfWheels + " wheels.");
    }
}
