class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {
    @Override
    void run() {
        System.out.println("Car is running smoothly");
    }
}

// Method Overriding means defining a method in a child class with the same
// name, return type, and parameters as in its parent class.
public class MethodOverloading {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle(); // Parent object
        myVehicle.run(); // Output: Vehicle is running

        Car myCar = new Car(); // Parent reference to child object (Polymorphism)
        myCar.run(); // Output: Car is running smoothly
    }
}
