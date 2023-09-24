package com.gordeyvasilev.theory73interfacesjava8.example1;

public interface FlyingMachine  {
    void blastOff();
    void landing();
    default void makeTravel() {
        blastOff();
        fly();
        landing();
    }
    default void fly() {
        System.out.println("Machine is flying!");
    }
}
