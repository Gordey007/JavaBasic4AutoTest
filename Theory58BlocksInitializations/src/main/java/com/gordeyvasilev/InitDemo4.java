package com.gordeyvasilev;

public class InitDemo4 {
    // Fields with the final modifier are used to
    // describe immutable properties of a class or object (constant).
    private static final int ii = initSt();

    //...
    private static int initSt() {
        System.out.println("Init ii value");
        return 1000;
    }
    //...
    public static void main(String[] arg) {
        System.out.println("Main");
        System.out.println("int: " + ii);
    }
}