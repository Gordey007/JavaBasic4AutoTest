package com.gordeyvasilev.theory73interfacesjava8.example4;

// Functional interfaces in Java are interfaces that have only one abstract method.
// Along with such a method, an interface can have any number of default methods and static methods.
@FunctionalInterface
public interface ShapeService {
    double perimeter(double a, double b);
}
