package com.other;

import static com.gordeyvasilev.Car.speedStatic;
import static com.other.Car2.speedStatic2;

public class Main2 {
    public static void main(String[] args) {

        Car2 fastCar2 = new Car2();

        //fastCar2.speed = 100; // Ошибка - Main и Car2 в разных пакетах.
        fastCar2.setSpeed2(100); // Доступ к полю через открытый метод
        System.out.println(fastCar2.getSpeed2());

        // Car2 наследник Car
        fastCar2.setSpeed(100);

        System.out.println(speedStatic);
        System.out.println(speedStatic2);
    }
}