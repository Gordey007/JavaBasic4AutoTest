package com.gordeyvasilev.theory72interfaces.example1;

public class Demo1 {
    public static void main(String[] args) {
        // In the Demo1 class, a link to the Shape interface is created,
        // and it is initialized with an object of the Circle class (this is a polymorphic use of interfaces).
        Shape object = new Circle(7.01);
        System.out.print("Square: " + object.getSquare());

        System.out.print("Square: " + object);

        object.getSquare1_1();
    }
}
