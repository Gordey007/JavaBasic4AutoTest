package com.gordeyvasilev.theory62staticandfinal;

public class DemoStatic {
    public static int x;
    public static int y;
    public int y2;

    /**
     * Limitations for static methods:
     * <p>
     * - static methods can only call static methods directly
     * - static methods can directly access only static fields or their parameters
     * static methods cannot be accessed via this and super references
     * - static methods can be overloaded with non-static ones and vice versa.
     */
    public static int lengthVector() {
        // System.out.println(y2); // Error
        // lengthVector(3); // Error
        return (int) Math.sqrt(x * x + y * y);
    }

    public int lengthVector(int x) {
        // System.out.println(y2); // Error
        return (int) Math.sqrt(x * x + y * y);
    }
}
