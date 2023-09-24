package com.gordeyvasilev.practice76abstractclassesandinterfaces;

public class Triangle extends Figure {
    private final Point point1;
    private final Point point2;
    private final Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        super();
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public double area() {
        // Sabc = 1/2 |(x2 – x1)(y3 –y1) – (x3 – x1)(y2 – y1)|.
        return (double) 1 / 2 * Math.abs(
                (point2.getX() - point1.getX()) *
                        (point3.getY() - point1.getY()) -
                        (point3.getX() - point1.getX()) *
                                (point2.getY() - point1.getY())
        );
    }

    public String pointsToString() {
        return "(" + point1.getX() + "," + point1.getY() + ")" +
                "(" + point2.getX() + "," + point2.getY() + ")" +
                "(" + point3.getX() + "," + point3.getY() + ")";
    }
}