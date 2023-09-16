package com.theory63inheritance.gordeyvasilev;

public class Car2 {
    // A subclass inherits package-private elements of the superclass only if they are defined in the same package.
    String name = "Car2 test";

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("Name: " + name);
    }
}
