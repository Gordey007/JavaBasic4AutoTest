// Package
package com.gordeyvasilev.theory52classesandobjects;

// Public - modifier defining class accessibility level, Car - class name
public class Car {
    private String model; // Field
    private int maxSpeed; // Field
    private int year; // Field

    // A constructor is a special method for creating objects,
    // covered later in this module.
    public Car(String model, int year, int maxSpeed) {
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    // Method
    public int getMaxSpeed() {
        return maxSpeed;
    }
}