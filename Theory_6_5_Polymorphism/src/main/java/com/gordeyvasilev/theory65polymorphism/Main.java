package com.gordeyvasilev.theory65polymorphism;

public class Main {

    /**
     * Static (early) linking occurs at compile time. Which method will be executed based on the call expression
     * becomes known after compilation:
     * - used to allow calls to overloaded methods
     * - is based on the type of the reference variable, not the type of the object (calling static methods).
     * <br>
     * Dynamic (late) linking occurs during program execution. The compiler has no way to determine which version
     * of a method with the same name should be called:
     * - manifests itself by calling an overridden method of a subclass through a reference to the superclass
     * - is based on the object type, not the reference type.
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}