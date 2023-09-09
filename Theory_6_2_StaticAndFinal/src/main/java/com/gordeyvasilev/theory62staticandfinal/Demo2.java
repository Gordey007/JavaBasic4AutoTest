package com.gordeyvasilev.theory62staticandfinal;

import static com.gordeyvasilev.theory62staticandfinal.Car.numOfCars2_1;

public class Demo2 {
    public static void main(String[] arg) {
        Car сar1 = new Car();
        Car сar2 = new Car();
        Car сar3 = new Car();

        /**
         * Это произошло, потому что поле numOfCars является полем экземпляра. Каждый объект имеет свою копию этого
         * поля с начальным значением 0, которое принимает значение 1 в процессе создания объекта. В этом примере было
         * бы более правильным сделать поле numOfCars статическим. Тогда оно было бы общим для всех объектов.
         * */
        System.out.println(сar2.getNumOfCars()); // 1

        System.out.println(сar3.getNumOfCars2()); // 3

        System.out.println(numOfCars2_1);
        System.out.println(Car.numOfCars2_2);
    }
}
