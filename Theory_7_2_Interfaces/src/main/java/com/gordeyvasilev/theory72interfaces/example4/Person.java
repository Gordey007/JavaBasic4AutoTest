package com.gordeyvasilev.theory72interfaces.example4;

class Person implements Movable {

    String name;
    public Person(String name){
        this.name = name;
    }

    public void move() {   System.out.println("Person move");   }
}