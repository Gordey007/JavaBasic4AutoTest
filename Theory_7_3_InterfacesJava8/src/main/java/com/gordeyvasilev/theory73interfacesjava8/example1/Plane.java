package com.gordeyvasilev.theory73interfacesjava8.example1;

public class Plane implements FlyingMachine  {
    @Override
    public void blastOff() {
        System.out.println("The plane is blasting off");
    }
    @Override
    public void landing() {
        System.out.println("The plane is landing");
    }
}