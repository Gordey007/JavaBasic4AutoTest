package com.theory63inheritance.other;

public class Car {
    private String name = "test1";
    public static String name2 = "test2";
    String name3 = "test3";

    public void setName(String name) {
        this.name = name;
    }

    // Всегда вызывается ближайший полиморфный метод к объекту, а не к типу ссылки.
    // т.е. ElectricCar.show()
    public void show() {
        System.out.println("Name: " + name);
    }

    public static void show2() {
        System.out.println("Name2: " + name2);
    }
}
