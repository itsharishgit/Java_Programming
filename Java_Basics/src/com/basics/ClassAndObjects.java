import utilityClass.Car;

public class ClassAndObjects {

    public static void main(String[] args) {

        // Class
        // Object
        // Reference variable

        // Class
        // Class is a blueprint of an object
        // Class is a template of an object

        // Object
        // Object is an instance of a class
        // Object is a real world entity

        // Reference variable
        // Reference variable is a name of an object
        // Reference variable is used to access the object

        // Creating an object
        Car car = new Car();

        // Reference variables ==> car

        // Accessing the object
        car.color = "Red";
        car.brand = "Toyota";
        car.price = 100000;
        car.year = 2022;

        // Accessing the methods
        // car.start();
        // car.stop();
        // car.accelerate();
        car.displayInfo();

        // create another object of the car
        Car bmw = new Car();

        bmw.brand = "BMW S";
        bmw.color = "Black";
        bmw.price = 45000000;
        bmw.year = 2025;

        bmw.displayInfo();

        // create another object of the car
        Car audi = new Car();

        audi.brand = "Audi S";
        audi.color = "White";
        audi.price = 45000000;
        audi.year = 2025;

        audi.displayInfo();

    }
}
