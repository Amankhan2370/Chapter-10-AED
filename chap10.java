abstract class Vehicle {
    private String name;
    private int capacity;
    private double speed;

    public Vehicle(String name, int capacity, double speed) {
        this.name = name;
        this.capacity = capacity;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getSpeed() {
        return speed;
    }

    public abstract void move();

    public void displayInfo() {
        System.out.println("Vehicle Name: " + name);
        System.out.println("Capacity: " + capacity);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    private String fuelType;

    public Car(String name, int capacity, double speed, String fuelType) {
        super(name, capacity, speed);
        this.fuelType = fuelType;
    }

    @Override
    public void move() {
        System.out.println("The car drives on roads.");
    }

    public String getFuelType() {
        return fuelType;
    }
}

class Motorbike extends Vehicle {
    private boolean hasSideCar;

    public Motorbike(String name, int capacity, double speed, boolean hasSideCar) {
        super(name, capacity, speed);
        this.hasSideCar = hasSideCar;
    }

    @Override
    public void move() {
        System.out.println("The motorbike zooms on roads.");
    }

    public boolean hasSideCar() {
        return hasSideCar;
    }
}

class Aircraft extends Vehicle {
    private double altitudeLimit;

    public Aircraft(String name, int capacity, double speed, double altitudeLimit) {
        super(name, capacity, speed);
        this.altitudeLimit = altitudeLimit;
    }

    @Override
    public void move() {
        System.out.println("The aircraft flies in the sky.");
    }

    public double getAltitudeLimit() {
        return altitudeLimit;
    }
}

class Ship extends Vehicle {
    private String type;

    public Ship(String name, int capacity, double speed, String type) {
        super(name, capacity, speed);
        this.type = type;
    }

    @Override
    public void move() {
        System.out.println("The ship sails on water.");
    }

    public String getType() {
        return type;
    }
}

public class chap10 {
    public static void main(String[] args) {
        Car car = new Car("Toyota Corolla", 5, 180, "Petrol");
        Motorbike motorbike = new Motorbike("Harley Davidson", 2, 160, false);
        Aircraft aircraft = new Aircraft("Boeing 747", 416, 900, 10000);
        Ship ship = new Ship("Titanic", 2400, 40, "Cruise");

        System.out.println("Car Details:");
        car.displayInfo();
        car.move();
        System.out.println("Fuel Type: " + car.getFuelType());
        System.out.println();

        System.out.println("Motorbike Details:");
        motorbike.displayInfo();
        motorbike.move();
        System.out.println("Has Side Car: " + motorbike.hasSideCar());
        System.out.println();

        System.out.println("Aircraft Details:");
        aircraft.displayInfo();
        aircraft.move();
        System.out.println("Altitude Limit: " + aircraft.getAltitudeLimit() + " meters");
        System.out.println();

        System.out.println("Ship Details:");
        ship.displayInfo();
        ship.move();
        System.out.println("Type: " + ship.getType());
    }
}
