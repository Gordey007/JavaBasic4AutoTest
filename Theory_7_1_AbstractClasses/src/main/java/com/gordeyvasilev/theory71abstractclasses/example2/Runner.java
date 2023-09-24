package com.gordeyvasilev.theory71abstractclasses.example2;

public class Runner {
    public static void main(String[] args) {
        GraphicObject mng;
        // mng = new GraphicObject(); // Can't create an object!

        // Abstract methods and other elements of an abstract class can be defined with any visibility,
        // except private. It makes no sense to make abstract methods private, since no one can implement them.
        mng = new Circle();
        mng.draw();
        mng.moveTo(10, 10);
    }
}