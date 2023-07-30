package com.gordeyvasilev;

public class Car {
    private static int numOfCars;

    //    Code duplication
    //public Car() {
    //    numOfCars++;
    //}
    //public Car(String model) {
    //    numOfCars++;
    //}

    // Dynamic initialization block
    {
        numOfCars++;
    }

    public Car() {}

    public Car(String model) {}
}