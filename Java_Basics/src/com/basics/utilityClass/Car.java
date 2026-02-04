package utilityClass;

public class Car {
    // Attributes
    public String color;
    public String brand;
    public double price;
    public int year;

    // Methods
    public void start() {
        System.out.println("Car is started");
    }

    // Methods
    public void stop() {
        System.out.println("Car is stopped");
    }

    // Methods
    public void accelerate() {
        System.out.println("Car is accelerating");
    }

    // Methods
    public void displayInfo() {
        System.out.println("Car Information");
        System.out.println("-----------------");
        System.out.println("Color: " + color);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Year: " + year);
    }
}
