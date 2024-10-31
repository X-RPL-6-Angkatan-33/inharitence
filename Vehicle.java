import java.util.Scanner;;


class Vehicle {
    int numWheels;
    double price;

    public Vehicle(int numWheels, double price) {
        this.numWheels = numWheels;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


class Car extends Vehicle {
    boolean isElectric;
    int numDoors;

    public Car(int numWheels, double price, boolean isElectric, int numDoors) {
        super(numWheels, price);
        this.isElectric = isElectric;
        this.numDoors = 4;
    }

	public boolean isIsElectric() {
		return this.isElectric;
	}

	public void setIsElectric(boolean isElectric) {
		this.isElectric = isElectric;
	}

	public int getNumDoors() {
		return this.numDoors;
	}

	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}



}


class Convertible extends Car {
    String roofType;

    public Convertible(int numWheels, double price, String roofType, boolean IsElectric , int numDoors) {
        super(numWheels, price, IsElectric, numDoors);
        this.roofType = roofType;
    }

    public String getRoofType() {
        return roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }
}


class Bicycle extends Vehicle {
    String bikeType;

    public Bicycle(int numWheels, double price, String bikeType) {
        super(numWheels, price);
        this.bikeType = bikeType;
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }
}

class diskon {
    public static void main(String[] args) {

        Scanner Vehicle = new Scanner(System.in);
    
        Car car = new Car(4, 5000000, true, 9);

        Convertible convertible = new Convertible(4, 7000000, "rooftop", true, 9);


        Bicycle bicycle = new Bicycle(2, 500000, "sepedah Bike");

    
        if (car.getPrice() > 5000000) {
            System.out.println("Mobil " + car.getClass().getSimpleName() + " saat ini tidak ada diskon.");
        } else {
            System.out.println("Mobil " + car.getClass().getSimpleName() + " saat ini ada diskon.");
        }

        if (convertible.getPrice() > 7000000) {
            System.out.println("Mobil " + convertible.getClass().getSimpleName() + " saat ini tidak ada diskon.");
        } else {
            System.out.println("Mobil " + convertible.getClass().getSimpleName() + " saat ini ada diskon.");
        }

        if (bicycle.getPrice() > 500000) {
            System.out.println("Mobil " + bicycle.getClass().getSimpleName() + " saat ini tidak ada diskon.");
        } else {
            System.out.println("Mobil " + bicycle.getClass().getSimpleName() + " saat ini ada diskon.");
        }
    }
}