package com.theory61encapsulation.other;

import static com.theory61encapsulation.gordeyvasilev.Car.speedStatic;
import static com.theory61encapsulation.other.Car2.speedStatic2;

public class Main2 {
    public static void main(String[] args) {

        Car2 fastCar2 = new Car2();

        //fastCar2.speed = 100; // Error - Main and Car2 are in different packages.
        fastCar2.setSpeed2(100); // Accessing a field via a public method
        System.out.println(fastCar2.getSpeed2());

        // Car2 successor to Car
        fastCar2.setSpeed(100);

        System.out.println(speedStatic);
        System.out.println(speedStatic2);
    }
}