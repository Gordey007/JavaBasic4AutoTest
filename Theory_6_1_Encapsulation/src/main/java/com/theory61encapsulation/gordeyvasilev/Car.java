package com.theory61encapsulation.gordeyvasilev;

public class Car {
    /**
     * protected определяет, что доступ к члену класса возможен только в теле этого же класса, класса из того же пакета или
     * класса-наследника, даже если он находится в другом пакете (области видимости).
     */
    protected int speed;

    int speed1_2;

    public static int speedStatic;


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}