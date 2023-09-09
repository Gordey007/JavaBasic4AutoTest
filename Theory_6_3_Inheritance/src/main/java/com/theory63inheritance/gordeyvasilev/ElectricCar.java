package com.theory63inheritance.gordeyvasilev;

import com.theory63inheritance.other.Car;

public class ElectricCar extends Car {

    // In a subclass you can declare a field with the same name as in the superclass,
    // hiding it this way (highly not recommended).
    public String name = "test";

    // In the subclass, you can write a new instance method that will have the same signature,
    // same as one of the superclass instance methods, thus overriding it.

    // Always call the closest polymorphic method to the object, not the reference type.
    // @Override
    public void show() {
        System.out.println("Name ElectricCar: " + name);
    }

    // In a subclass you can write a new class method (static), which has the same signature,
    // same as one of the superclass methods, thus hiding it.
    // without static there will be an error

    // @Override // Error
    public static void show2() {
        System.out.println("Name2 ElectricCar: " + name2);
    }
}
