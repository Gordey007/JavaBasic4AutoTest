package com.theory63inheritance.gordeyvasilev;

public class Car2 {
    // Подкласс наследует package-private элементы суперкласса только в том случае, если они определены в одном пакете.
    String name = "Car2 test";

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("Name: " + name);
    }
}
