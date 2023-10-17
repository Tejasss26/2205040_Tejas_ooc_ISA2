package tejas;

class Vehicle {
    String brand;
    String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    void displayCarInfo() {
        displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class Motorcycle extends Vehicle {
    boolean hasFairing;

    public Motorcycle(String brand, String model, boolean hasFairing) {
        super(brand, model);
        this.hasFairing = hasFairing;
    }

    void displayMotorcycleInfo() {
        displayInfo();
        System.out.println("Has Fairing: " + hasFairing);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 4);
        Motorcycle myMotorcycle = new Motorcycle("Honda", "CBR1000RR", true);

        System.out.println("Car Information:");
        myCar.displayCarInfo();

        System.out.println("\nMotorcycle Information:");
        myMotorcycle.displayMotorcycleInfo();
    }
}
