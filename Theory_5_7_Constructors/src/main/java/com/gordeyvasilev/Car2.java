package com.gordeyvasilev;

public class Car2 {
    private String model;
    private String brand;
    public Car2() {
        // Ошибка компиляции - вызов другого конструктора должен быть первым
        // System.out.println("Init");
        // this("Camry", "Toyota");

        this("Camry", "Toyota");
        System.out.println("Init");
    }

    public Car2(String model) {
        this(model, "Toyota");
    }

    public Car2(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }
}