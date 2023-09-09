package com.gordeyvasilev.theory62staticandfinal;

public class Car {
    private int numOfCars;

    /**
     * Static class fields:
     * <p>
     * are created the first time the class is accessed
     * are created in singular
     * exist independently of class instances
     * allow access to them before creating an instance of the class.
     */
    private static int numOfCars2;
    static int numOfCars2_1;
    static int numOfCars2_2;


    public Car() {
        numOfCars++;
        numOfCars2++;
    }

    public int getNumOfCars() {
        return numOfCars;
    }

    public static int getNumOfCars2() {
        return numOfCars2;
    }
}