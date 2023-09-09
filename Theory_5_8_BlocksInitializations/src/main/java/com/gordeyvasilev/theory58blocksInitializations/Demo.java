package com.gordeyvasilev.theory58blocksInitializations;

public class Demo {
    // Error
    // Inal-field cannot get default value
    // final byte b1;

    // Not error
    // Mandatory initialization of the final field occurs
    final byte b2;

    {
        b2 = 10;
    }

    // Not error
    // Static fields of the class are available from the dynamic block
    static int i;

    {
        i = 5;
    }

    // Error
    // Non-static class fields are not available from a static block
    // int i;
    // static {
    //     i = 5;
    // }

    // Class instance field
    private int a = 5;
    // Class field
    private static int b = 100;

    // dynamic initialization blocks, which can be an alternative to class constructors for initializing fields
    // instance. They are simply described in the body of the class, outside any other blocks.


    // The Java compiler inserts dynamic initialization block code into each constructor (at the beginning of its body)
    // in the order of their description in the class body.
    {
        a = -5;
        System.out.println("Dynamic initialization section");
    }

    public Demo() {
        a = 10;
        b = 10;
        System.out.println("Constructor");
    }

    static {
        b = -5;
        System.out.println("Static initialization section");
    }

    public static void main(String[] arg) {
        System.out.println("Main");
        Demo obj = new Demo();
        System.out.println("a=" + obj.a + " b=" + b);
    }
}