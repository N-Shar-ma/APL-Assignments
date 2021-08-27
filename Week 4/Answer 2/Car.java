import Vehicle.Vehicle;

public class Car extends Vehicle{
    
    public Car(String model, String fuelType) {
        super(model, fuelType, 4);
    }

    public void describe() {
        System.out.println("This is a car.");
        super.describe();
    }
}
