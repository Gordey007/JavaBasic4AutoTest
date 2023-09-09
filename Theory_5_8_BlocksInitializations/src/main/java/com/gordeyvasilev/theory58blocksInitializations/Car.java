package com.gordeyvasilev.theory58blocksInitializations;

public class Car {
    private static int numOfCars;

    //    Code duplication
    //public Car() {
    //    numOfCars++;
    //}
    //public Car(String model) {
    //    numOfCars++;
    //}

    // Dynamic initialization block
    // To avoid duplication, you should move the common code from the constructors to a dynamic block


    // Dynamic blocks are executed only when a class object is created. Therefore, dynamic blocks can
    // use to set the initial state of the object.
    {
        numOfCars++;
    }

    public Car() {
    }

    public Car(String model) {
    }

    /**
     * Garbage collection occurs only occasionally during program execution. It doesn't happen right away
     * after discovering objects that are no longer in use. Typically, to avoid performance degradation,
     * garbage collection is performed only if two conditions are met: there are objects to be deleted, and there are
     * the need to free up the memory they occupy.
     * */

    /**
     * Java provides the ability to define a finalizer method – finalize(),
     * which will be called before the object is permanently removed from memory. It allows you to make sure that the object
     * can be removed painlessly.
     *
     * To add a finalizer to a class, it is enough to override the finalize() method, inherited from the class
     *Object. The Java runtime will call this method before actually deleting the object.
     * The body of the finalize() method should provide actions that must be performed immediately before
     * deleting an object.
     * */

    /**
     * - the protected keyword prevents access to the method outside the class
     * - the method is called when the garbage collection system decides to free memory,
     * occupied by this object
     * - if the object is out of scope at this time, the method will not be called
     * (for example, if the program ends before garbage collection starts,
     * then the method will not be called).
     */
    protected void finalize() {

    }
}