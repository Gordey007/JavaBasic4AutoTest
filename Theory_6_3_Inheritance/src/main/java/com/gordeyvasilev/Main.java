package com.gordeyvasilev;

/**
 * Наследование — это свойство, позволяющее создать новый класс на основе существующего с частичным или полным
 * заимствованием характеристик. Это позволяет упорядочить классы в иерархии, которая представляет
 * отношения типа <b>is-a</b>
 */

import com.other.Car;

/**
 * В противовес наследованию существует другой вид отношений между классами – композиция, когда один класс включает
 * в себя объекты других классов. Таким образом описываются сложные объекты. Такое отношение определяется
 * как <b>has-a</b> (имеет в своем составе).
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Wheels");
        System.out.println("car.show();");
        car.show();

        Car.show2();

        ElectricCar electricCar = new ElectricCar();
        electricCar.setName("Lightning"); // Вызов унаследованного метода
        electricCar.show();

        System.out.println(electricCar.name2);


        ElectricCar2 electricCar2 = new ElectricCar2();
        System.out.println(electricCar2.name);


        Derived obj = new Derived(1, 2, 3);
    }
}