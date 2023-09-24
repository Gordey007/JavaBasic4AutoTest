package com.gordeyvasilev.theory72interfaces.example4;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

class Test {

    public static void main(String[] args){
        Person person = new Person("person");
        Vehicle vehicle = new Vehicle();
        List<Movable> movable = new ArrayList<>();

        movable.add(person);
        movable.add(vehicle);

    }

    void walk(@NotNull Person movable) {
        movable.move();
    }

    void walk(@NotNull Vehicle movable) {
        movable.move();
    }

    void walk(@NotNull Movable movable) {
        movable.move();
    }
}
