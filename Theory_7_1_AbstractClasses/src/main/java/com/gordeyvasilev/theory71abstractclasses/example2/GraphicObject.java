package com.gordeyvasilev.theory71abstractclasses.example2;

public abstract class GraphicObject {
    public abstract void draw();
    // private abstract void draw2();

    public void moveTo(int x, int y) {
        System.out.println("MoveTo");
    }
}