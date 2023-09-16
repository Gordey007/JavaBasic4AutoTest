package com.theory61encapsulation.gordeyvasilev;

public class Car {
    /**
     * protected specifies that a member of a class can only be accessed within the body of the same class, a class from the same package, or
     * a descendant class, even if it is in a different package (scope).
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