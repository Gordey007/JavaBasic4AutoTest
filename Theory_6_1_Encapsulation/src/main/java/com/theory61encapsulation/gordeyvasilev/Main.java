package com.theory61encapsulation.gordeyvasilev;

/**
 * К верхнему уровню относятся:
 * <p>
 * открытый (public)
 * пакетный (package-private).
 * К уровню членов относятся:
 * <p>
 * открытый (public)
 * закрытый (private)
 * защищенный (protected)
 * пакетный (package-private).
 */

import com.theory61encapsulation.other.Car2;

/**
 * package-private - неявный модификатор. действует когда модификатор не указан
 * */

public class Main {
    public static void main(String[] args) {
        Car fastCar = new Car();

        fastCar.speed1_2 = 3;
        System.out.println(fastCar.speed1_2);

        fastCar.speed = 100; // Доступ возможен, поскольку Main и Car2 находятся в одной зоне видимости
        System.out.println(fastCar.getSpeed());

        Car2 fastCar2 = new Car2();

        // fastCar2.speed2_2 = 0;

        //fastCar2.speed = 100; // Ошибка - Main и Car2 в разных пакетах.
        fastCar2.setSpeed2(100); // Доступ к полю через открытый метод
        System.out.println(fastCar2.getSpeed2());
    }
}