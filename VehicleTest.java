// Parent class
class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting...");
    }

    // Method Overloading (Same method name, different parameters)
    public void fuel(String fuelType) {
        System.out.println("Vehicle uses: " + fuelType);
    }

    public void fuel(String fuelType, int quantity) {
        System.out.println("Vehicle uses " + quantity + " liters of " + fuelType);
    }
}

// Child class
class Car extends Vehicle {
    @Override
    public void start() {
        super.start(); // calling parent method
        System.out.println("Car is starting with key ignition...");
    }

    // Additional Car-specific behavior
    public void openSunroof() {
        System.out.println("Sunroof is opening...");
    }
}

// Main class
public class VehicleTest {
    public static void main(String[] args) {
        // Create Car object
        Car myCar = new Car();

        // Method Overriding (Child version runs)
        myCar.start(); // Overridden version from Car

        // Method Overloading (Different parameters)
        myCar.fuel("Petrol");
        myCar.fuel("Petrol", 40);

        // Car-specific method
        myCar.openSunroof();
    }
}
