package oop;

public class Car {
    private String make;
    private String model;
    private int year;
    private double price;
    private boolean isRunning;
    // static variable - tracks how many cars I have made
    private static int carCount = 0;


    // static method to get carCount
    public static int getCarCount(){
        return carCount;
    }
    // constructor - defines how a car is being built
    public Car(String make, String model, int year, double price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        // default value
        this.isRunning = false;
        carCount ++;
    }

    // accessor methods - using Getters and Setters
    public String getMake(){
        return make;
    }

    // when using Setter, access the variable you want to update
    public void setMake (String make) {
        this.make = make;
    }

    public String getModel(){
        return model;
    }

    public void setModel (String model){
        this.model = model;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public boolean isRunning(){
        return isRunning;
    }

    public void start(){
        isRunning = true;
        System.out.println("You start the engine.");
    }

    public void stop(){
        isRunning = false;
        System.out.println("You stop the engine.");
    }

    public void drive(){
        System.out.println("You drive the " + model);
    }

    public void brake(){
        System.out.println("You brake the " + model);
    }
    public static void main(String[] args){
        Car car1 = new Car("Toyota", "Corolla", 2025, 25000.99);
        Car car2 = new Car("Honda", "Civic", 2024, 22000.99);

        System.out.println(car1.make + " " + car1.model);
        System.out.println(car2.make + " " + car2.model);

        ElectricCar ecar1 = new ElectricCar("Tesla", "Model S", 2024, 79999.99, 100);
        ecar1.drive();
        System.out.println("Battery Capacity: " + ecar1.getBatteryCapacity());

        System.out.println("Total Cars Created: " + Car.getCarCount());
    }
}

//future tip - public classes in separate file to avoid future conflicts + keep things clean
class ElectricCar extends Car {
    int batteryCapacity;

    public ElectricCar(String make, String model, int year, double price, int batteryCapacity){
        // Use super to call the constructor of the parent class
        super(make, model, year, price);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity(){
        return batteryCapacity;
    }
    // practicing polymorphism, and overriding methods from the Car class
    public void drive(){
        System.out.println("You are driving the silent electric car" + getModel());
    }
}

