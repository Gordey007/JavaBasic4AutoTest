package com.gordeyvasilev.practice76abstractclassesandinterfaces;

abstract class Figure {

    public abstract double area();

    public abstract String pointsToString();

    public String toString() {
        return this.getClass().getSimpleName() + "[" + pointsToString() + "]";
    }
}
