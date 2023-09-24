package com.gordeyvasilev.theory72interfaces.example1;

public interface Shape {

    // An interface can only be declared with the public or package-private access modifier.
    // Identifier - any valid name.
    public double PI = Math.PI;
    double getSquare();

    default public void getSquare1_1() {
        System.out.println("getSquare1_1");
    }
}
