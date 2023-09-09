package com.gordeyvasilev.theory57constructors;


public class Main {
    public static void main(String[] arg) {
        Car car = new Car();
        System.out.println(car.getModelCar2());
        System.out.println(car.getFlag());

        // Not a constructor.
        car.Car("Tesla");


        // The constructor refers to another constructor where there is a field record.
        Car2 car2 = new Car2();

        System.out.println("\n" + car2.getModel());
        System.out.println(car2.getBrand());
    }
}