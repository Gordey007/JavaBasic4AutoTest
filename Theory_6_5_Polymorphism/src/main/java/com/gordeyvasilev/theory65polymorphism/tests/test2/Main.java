package com.gordeyvasilev.theory65polymorphism.tests.test2;

public class Main {
    public static void main(String[] args) {
        A a = new B();
        // When calling the method in this case, the late binding mechanism will be used. Therefore,
        // the method will be called not based on the type of the reference variable, but on a specific object,
        // that is, the method of class B will be called.
        System.out.println(a.version +
                // Fields in Java are not polymorphic, so there will be a reference to the field based on the type
                // of the reference variable.
                a.testMethod());
    }
}