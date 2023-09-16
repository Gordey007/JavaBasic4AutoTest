package com.theory61encapsulation.other;

import com.theory61encapsulation.gordeyvasilev.Car;

public class Car2 extends Car {
    /**
     * If the access level modifier is not specified, then the class or class member will be visible and accessible only in the body
     * the same class or a class from the same package. In this case, the package-private modifier is set by default.
     */
    static int speed2;

    protected int speed2_2;

    // default modifier + static can be used
    /**
     * The static modifier is used to create methods and variables (fields) that belong to a class rather than an object.
     * */

    /**
     * A field or method declared static in a class is common to all objects of that class
     * and are called a class field or a class method. In other words, they belong to the class, not to an instance of the class.
     */
    static int speedStatic2;


    public int getSpeed2() {
        return speed2;
    }

    public void setSpeed2(int speed) {
        this.speed2 = speed;
    }
}