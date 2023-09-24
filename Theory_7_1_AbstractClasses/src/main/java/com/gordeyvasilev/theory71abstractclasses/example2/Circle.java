package com.gordeyvasilev.theory71abstractclasses.example2;

public class Circle extends GraphicObject {
    // При переопределении абстрактного метода нельзя менять доступ?
    @Override
    public void draw() {
        System.out.println("draw");
    }
}
