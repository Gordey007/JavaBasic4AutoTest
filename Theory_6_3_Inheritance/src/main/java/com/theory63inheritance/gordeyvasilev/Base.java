package com.theory63inheritance.gordeyvasilev;

public class Base {
    private int a, b;
    int a2, b2;
    // The subclass constructor can call the superclass constructor using the super keyword
    /**
     * Typically, calling a superclass constructor in the body of a subclass constructor is used to initialize private
     * superclass fields. Such fields have not passed into the scope of the subclass, but are its characteristics,
     * which need to be initialized when creating a subclass object.
     * */

    /**
     * The super keyword is a predefined reference to a superclass object in the body of a subclass.
     * This keyword can be used in subclass constructors to explicitly call superclass constructors.
     * The main purpose is to initialize private fields of the superclass.
     */
    Base(int a, int b) {
        this.a = a;
        this.b = b;
    }

    private Base() {

    }
}
