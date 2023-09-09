package com.gordeyvasilev.theory62staticandfinal;

public class Car {
    private int numOfCars;

    /**
     * Статические поля класса:
     * <p>
     * создаются при первом обращении к классу
     * создаются в единственном числе
     * существуют независимо от экземпляров класса
     * допускают обращение к ним до создания экземпляра класса.
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