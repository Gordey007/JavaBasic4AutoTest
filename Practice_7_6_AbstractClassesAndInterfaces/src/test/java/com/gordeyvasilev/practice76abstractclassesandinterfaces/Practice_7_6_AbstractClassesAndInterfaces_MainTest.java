package com.gordeyvasilev.practice76abstractclassesandinterfaces;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.javatuples.Triplet;


public class Practice_7_6_AbstractClassesAndInterfaces_MainTest {
    @Test
    @DisplayName("Check areas")
    public void checkAreas() {
        Triangle tr = new Triangle(new Point(0, 0), new Point(3, 0), new Point(0, 4));

        Quadrilateral qu = new Quadrilateral (
                new Point(1, 0),
                new Point(2, 1),
                new Point(1, 2),
                new Point(0, 1)
        );

        Circle ci = new Circle(new Point(1, 1), 3);

        Triplet<Double, Double, Double> areas = new Triplet<>(tr.area(), qu.area(), ci.area());

        Assertions.assertEquals(new Triplet<>(6.0, 2.0, 28.274333882308138), areas);
    }


    @Test
    @DisplayName("Check toString")
    public void check2String() {
        Triangle tr = new Triangle(new Point(0, 0), new Point(3, 0), new Point(0, 4));

        Quadrilateral qu = new Quadrilateral (
                new Point(1, 0),
                new Point(2, 1),
                new Point(1, 2),
                new Point(0, 1)
        );

        Circle ci = new Circle(new Point(1, 1), 3);

        Triplet<String, String, String> strings = new Triplet<>(
                tr.pointsToString(),
                qu.pointsToString(),
                ci.pointsToString()
        );

        Assertions.assertEquals(new Triplet<>(
                "(0.0,0.0)(3.0,0.0)(0.0,4.0)",
                "(1.0,0.0)(2.0,1.0)(1.0,2.0)(0.0,1.0)",
                "(1.0,1.0)"), strings);
    }
}
