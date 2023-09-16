package com.theory61encapsulation.gordeyvasilev;

/**
 * The top level includes:
 * <p>
 * open (public)
 * package (package-private).
 * Member level includes:
 * <p>
 * open (public)
 * closed (private)
 * protected
 * package (package-private).
 */

import com.theory61encapsulation.other.Car2;

/**
 * package-private - implicit modifier. valid when modifier is not specified
 */

public class Main {
    public static void main(String[] args) {
        Car fastCar = new Car();

        fastCar.speed1_2 = 3;
        System.out.println(fastCar.speed1_2);

        fastCar.speed = 100; // Access is possible because Main and Car2 are in the same line of sight
        System.out.println(fastCar.getSpeed());

        Car2 fastCar2 = new Car2();

        // fastCar2.speed2_2 = 0;

        //fastCar2.speed = 100; // Error - Main and Car2 are in different packages.
        fastCar2.setSpeed2(100); // Accessing a field via a public method
        System.out.println(fastCar2.getSpeed2());
    }
}