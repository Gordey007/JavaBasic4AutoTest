package com.gordeyvasilev.theory62staticandfinal;

/**
 * The CustomMath class has no instance fields. Methods receive data to work through their parameters, that is, the class
 * has no state. In this case, the methods are better described as static.
 */
public class CustomMath {
    /**
     * Static class fields:
     * <p>
     * are created the first time the class is accessed
     * are created in singular
     * exist independently of class instances
     * allow access to them before creating an instance of the class.
     */
    public static int percent;

    public static int add(int x, int y) {
        return x + y + percent;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }
}