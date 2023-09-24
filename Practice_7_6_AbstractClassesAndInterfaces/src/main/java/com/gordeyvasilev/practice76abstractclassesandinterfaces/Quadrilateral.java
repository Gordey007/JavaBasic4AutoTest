package com.gordeyvasilev.practice76abstractclassesandinterfaces;

public class Quadrilateral extends Figure {
    private final Point point1;
    private final Point point2;
    private Point point3;
    private Point point4;

    public Quadrilateral(Point point1, Point point2, Point point3, Point point4) {
        super();

        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }

    public double area() {

        return 0.5 * Math.abs((point1.getX() - point3.getX()) * (point2.getY() - point3.getY()) - (point2.getX() - point3.getX()) * (point1.getY() - point3.getY()))
                + 0.5 * Math.abs((point1.getX() - point3.getX()) * (point4.getY() - point3.getY()) - (point4.getX() - point3.getX()) * (point1.getY() - point3.getY()));
    }

    public String pointsToString() {
        return "(" + point1.getX() + "," + point1.getY() + ")" +
                "(" + point2.getX() + "," + point2.getY() + ")" +
                "(" + point3.getX() + "," + point3.getY() + ")" +
                "(" + point4.getX() + "," + point4.getY() + ")";
    }
}
