package com.gordeyvasilev.theory64subclassingcapabilities.hidingfield;

public class Car extends Vehicle {
    protected int maxSpeed = 300;
    public void showSpeed() {
        System.out.println(super.maxSpeed);
        System.out.println(maxSpeed);
    }
}
