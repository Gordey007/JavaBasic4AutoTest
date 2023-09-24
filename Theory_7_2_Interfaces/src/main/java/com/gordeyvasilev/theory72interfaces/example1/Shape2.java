package com.gordeyvasilev.theory72interfaces.example1;

public interface Shape2 extends Shape{
    // All interface methods (that are not declared as default or static) are implicitly public and abstract.
    static public void getSquare3() {
        System.out.println("getSquare3");
    }

    default public void getSquare4() {
        System.out.println("getSquare4");
    }
}
