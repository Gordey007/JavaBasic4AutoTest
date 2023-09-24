package com.gordeyvasilev.practice76abstractclassesandinterfaces;

class Point {
    private double x;
    private double y;

    public Point(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ')';
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}