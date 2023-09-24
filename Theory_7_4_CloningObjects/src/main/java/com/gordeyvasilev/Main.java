package com.gordeyvasilev;

public class Main {
    public static void main(String[] args) {

        /**
         * Object cloning is a way to create an exact copy of an object.
         * There are four ways to do this in Java, which are defined by the following:
         * - The class whose objects need to be cloned must define a constructor,
         * which accepts an object of this class – a copy constructor.
         * - The class whose objects need to be cloned can define a static method in its body,
         * which will return an instance of its class - a factory method.
         * - The class whose objects need to be cloned can use a serialization mechanism.
         * - The class whose objects need to be cloned must override the clone() method of the Object class
         * and implement the Cloneable interface.
         *
         * The most convenient and flexible way of cloning is the serialization mechanism - it is already implemented in Java
         * and the user does not need to define it himself, and the safest is the factory method.
         *
         * Although there are different cloning methods, they use one of two types of this process:
         * Shallow cloning - already implemented by Java itself.
         * Deep cloning - must be implemented by the developer.
         */
        System.out.println("Hello world!");
    }
}