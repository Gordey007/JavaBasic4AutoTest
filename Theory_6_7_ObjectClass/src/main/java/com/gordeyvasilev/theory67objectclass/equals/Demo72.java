package com.gordeyvasilev.theory67objectclass.equals;

public class Demo72 {
    public static void main(String[] args) {
        /**
         * When overriding the equals() method, the conventions provided
         * by the Java language specification must be followed:
         * <br>
         * Reflexivity - if we take any reference value x that is not null,
         * then the result of calling x.equals(x) must be true.
         * <br>
         * Symmetry - if you take any reference values x and y that are not null,
         * then the result of calling x.equals(y) must be the same as calling y.equals(x).
         * <br>
         * Transitivity - if we take any reference values x, y, and z that are not null,
         * and the results of calling x.equals(y) and y.equals(z) are true,
         * then the result of calling x.equals(z) must also be true.
         * <br>
         * Consistency - if you take any reference values x and y that are not null,
         * then when x.equals(y) is called multiple times, the return value (true or false) must always be the same.
         * An exception would be the situation if there is no information about changes
         * in the objects used in the comparison
         * <br>
         * Comparison with null - if you take any reference value x that is not null,
         * then the result of calling x.equals(null) must be false.
         */

        Point2 point1 = new Point2(5, -5);
        Point2 point2 = point1;
        Point2 point3 = new Point2(5, -5);
        Point2 point4 = new Point2(5, 5);

        System.out.println(point1.equals(point2));
        System.out.println(point1.equals(point3));
        System.out.println(point1.equals(point4));

    }
}
