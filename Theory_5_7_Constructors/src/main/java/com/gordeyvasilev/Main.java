package com.gordeyvasilev;


public class Main {
    public static void main(String[] arg) {
        Car car = new Car();
        System.out.println(car.getModelCar2());
        System.out.println(car.getFlag());

        // не конструктор
        car.Car("Tesla");


        // Контруктор ссылается на др. конструктор, где есть запись полей
        Car2 car2 = new Car2();

        System.out.println("\n"+ car2.getModel());
        System.out.println(car2.getBrand());
    }
}