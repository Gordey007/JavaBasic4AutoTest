package com.gordeyvasilev.theory62staticandfinal;

import static com.gordeyvasilev.theory62staticandfinal.Car.numOfCars2_1;

public class Demo2 {
    public static void main(String[] arg) {
        Car сar1 = new Car();
        Car сar2 = new Car();
        Car сar3 = new Car();

        /**
         * This happened because the numOfCars field is an instance field. Each object has its own copy of this
         * fields with an initial value of 0, which takes the value 1 during object creation. In this example it was
         * it would be more correct to make the numOfCars field static. Then it would be common to all objects.
         * */
        System.out.println(сar2.getNumOfCars()); // 1

        System.out.println(сar3.getNumOfCars2()); // 3

        System.out.println(numOfCars2_1);
        System.out.println(Car.numOfCars2_2);
    }
}
