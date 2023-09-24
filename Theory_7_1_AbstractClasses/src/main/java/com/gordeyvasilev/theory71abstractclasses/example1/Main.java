package com.gordeyvasilev.theory71abstractclasses.example1;

public class Main {
    public static void main(String[] arg) {
        /**
         * This example describes the Animal class as an abstract superclass with an abstract move() method.
         * Then its subclass Reptiles is declared just like an abstract class, without any code.
         * And the successor of the Reptiles class is described - the Boa subclass (as a regular class in which the move() method is implemented).
         * In the Main class we create a link of type Animal, and initialize it with an object of the Boa subclass,
         * on which we then call the move() method.
         * <br>
         * Everything works correctly - dynamic polymorphism.
         */
        Animal animal = new Boa();
        animal.move();
    }
}