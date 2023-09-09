package com.theory63inheritance.gordeyvasilev;

import com.theory63inheritance.other.Car;

public class ElectricCar extends Car {

    // В подклассе можно объявить поле с тем же именем, что и в суперклассе,
    // скрывая его таким образом (настоятельно не рекомендуется).
    public String name = "test";

    // В подклассе можно написать новый метод экземпляра, который будет иметь ту же сигнатуру,
    // что и один из методов экземпляра суперкласса, таким образом переопределяя его.

    // Всегда вызывается ближайший полиморфный метод к объекту, а не к типу ссылки.
    // @Override
    public void show() {
        System.out.println("Name ElectricCar: " + name);
    }

    // В подклассе можно написать новый метод класса (статический), который имеет туже сигнатуру,
    // что и один из методов суперкласса, таким образом скрывая его.
    // без static будет ошибка

    // @Override // Error
    public static void show2() {
        System.out.println("Name2 ElectricCar: " + name2);
    }
}
