package com.gordeyvasilev.theory71abstractclasses.example1;

abstract class Reptiles extends Animal {
    /**
     * A reference to an abstract class can be initialized by an object of its subclass if it is not abstract.
     * Only methods of the abstract superclass can be called through this link.
     * An abstract class can extend another abstract class,
     * but it is not necessary to implement the abstract methods of its superclass.
     */

    @Override
    public void move2() {
        System.out.println("move2.1");
    }
}
