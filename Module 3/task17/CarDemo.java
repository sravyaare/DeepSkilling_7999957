class Car {

    String make;
    String model;
    int year;

    void displayDetails() {
        System.out.println("Make  : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
        System.out.println();
    }
}

public class CarDemo {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.make = "Hyundai";
        car1.model = "Creta";
        car1.year = 2023;

        Car car2 = new Car();
        car2.make = "Tata";
        car2.model = "Nexon";
        car2.year = 2024;

        System.out.println("Car 1 Details");
        car1.displayDetails();

        System.out.println("Car 2 Details");
        car2.displayDetails();
    }
}