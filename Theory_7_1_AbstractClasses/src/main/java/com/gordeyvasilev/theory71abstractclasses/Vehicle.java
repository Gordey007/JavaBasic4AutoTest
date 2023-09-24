package com.gordeyvasilev.theory71abstractclasses;

// Abstract classes cannot be used to create instances, but they can be superclasses.
// We can say that this is a class that defines a generic form used by all its subclasses,
// that is, such a class defines the general nature of the behavior.

// There is a concept of "degree of abstraction", which can be high (abstract class) or low.
abstract class Vehicle {
    // public static final String type; // Error
    public static final String type = "vehicle";
    protected void move() {
        System.out.println("Vehicle move");
    }

    // If a class includes abstract methods, then it must be declared as abstract.
    protected abstract void move2();

    // If the abstract class is a superclass,
    // then the subclass must provide implementation of all abstract methods of its parent class.

    // If a subclass does not provide implementation of all abstract methods of its parent class,
    // then it must also be declared abstract.
    /**
     * <code>
     *  abstract class Animal {
     *      public abstract void move();
     *  }
     *
     *  abstract class Reptiles extends Animal {}
     * </code>
     */
}
