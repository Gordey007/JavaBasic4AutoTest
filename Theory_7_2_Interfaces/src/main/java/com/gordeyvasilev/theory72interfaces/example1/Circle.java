package com.gordeyvasilev.theory72interfaces.example1;

public class Circle implements Shape2 {
    double radius;

    Circle(double x) {
        radius = x;
    }

    public double getSquare() {
        return PI * radius * radius;
    }

    @Override
    public void getSquare4() {
        Shape2.getSquare3();
        Shape2.super.getSquare4();
    }
}
