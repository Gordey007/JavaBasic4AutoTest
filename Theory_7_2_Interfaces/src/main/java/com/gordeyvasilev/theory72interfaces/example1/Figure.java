package com.gordeyvasilev.theory72interfaces.example1;

// Partial implementation of interface methods. If a class extends an interface but does not fully implement its methods,
// then such a class must be declared as abstract.
public abstract class Figure implements Shape {
    double radius = 1.0;
    double radius2;

    public double getSquare2() {
        return PI * radius * radius;
    }

    public void getSquare3() {};
}
