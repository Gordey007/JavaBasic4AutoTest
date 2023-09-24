package com.gordeyvasilev.theory73interfacesjava8;

public class Main {
    public static void main(String[] args) {
        // Reasons for introducing static and default methods:
        //
        // - The longer the code is supported, the more the interface becomes overgrown with classes
        // (that is, the more classes implement this interface).
        // - Adding additional methods to the interface requires changes in all classes,
        // implementing this interface. Otherwise, working code will become inoperable.

        // Previously, we got out of some situations as follows: created
        // class with a basic implementation of interface methods (adapter class),
        // and then, by inheriting it and overriding the necessary methods, we implemented the interface.
        System.out.println("Hello world!");
    }
}