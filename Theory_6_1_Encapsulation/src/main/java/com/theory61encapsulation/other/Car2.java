package com.theory61encapsulation.other;

import com.theory61encapsulation.gordeyvasilev.Car;

public class Car2 extends Car {
    /**
     * Если модификатор уровня доступа не указан, то класс или член класса будут видимыми и доступными только в теле
     * этого же класса или класса из того же пакета. В таком случае по умолчанию устанавливается модификатор package-private.
     */
    static int speed2;

    protected int speed2_2;

    // дефолтный модификатор + статик можно использовать
    /**
     * Модификатор static применяется для создания методов и переменных (полей), принадлежащих классу, а не объекту.
     * */

    /**
     * Поле или метод, объявленные в классе как static, являются общими для всех объектов этого класса
     * и называются полем класса или методом класса. Другими словами, они принадлежат классу, а не экземпляру класса.
     */
    static int speedStatic2;


    public int getSpeed2() {
        return speed2;
    }

    public void setSpeed2(int speed) {
        this.speed2 = speed;
    }
}