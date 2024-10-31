


class Vehicle {
    int numWheels;
    double price;

    public void print() {
    System.out.println("Vehicle");
    System.out.println("numWheels: " + numWheels);
    System.out.println("price: " + price);
    }
}

class Car extends Vehicle {
    private int numDoors;
    private boolean isElectric;

    public void print() {
    System.out.println("Car");
    System.out.println("numDoors: " + numDoors);
    System.out.println("isElectric: " + isElectric);
    }
}

class Convertible extends Car {

    Convertible(int par, int par1, String hardtop) {
    }
    private String roofType;

    public void print() {
    System.out.println("Convertible");
    System.out.println("roofType: " + roofType);
    }
}

class Bicycle extends Vehicle {
    private String bikeType;

    public void print() {
    System.out.println("Bicycle");
    System.out.println("bikeType: " + bikeType);
    }
}

class Driver {
    public void inputUser() {
    
    }

    public boolean isDiscounted(Vehicle vehicle) {

    return false;
    }
}

public class diskon {
    public static void main(String[] args) {
    Driver driver = new Driver();
    driver.inputUser();
    
    }
}


