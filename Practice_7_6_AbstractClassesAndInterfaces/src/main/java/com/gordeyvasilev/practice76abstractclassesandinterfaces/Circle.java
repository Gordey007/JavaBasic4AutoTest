package com.gordeyvasilev.practice76abstractclassesandinterfaces;

public class Circle extends Figure {

    private final Point point1;
    private final int i;

    public Circle(Point point1, int i) {
        super();

        this.point1 = point1;
        this.i = i;
    }

    public double area() {
        return Math.PI * Math.pow(i, 2);
    }

    public String pointsToString() {
        return "(" + point1.getX() + "," + point1.getY() + ")";
    }
}
