package com.theory63inheritance.gordeyvasilev;

/**
 * Inheritance is a property that allows you to create a new class based on an existing one with partial or complete
 * borrowing characteristics. This allows you to arrange classes in a hierarchy that represents
 * relations of type <b>is-a</b>
 */

import com.theory63inheritance.other.Car;

/**
 * As opposed to inheritance, there is another type of relationship between classes - composition, when one class includes
 * includes objects of other classes. This is how complex objects are described. This attitude is determined
 * as <b>has-a</b> (has in its composition).
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Wheels");
        System.out.println("car.show();");
        car.show();

        Car.show2();

        ElectricCar electricCar = new ElectricCar();
        electricCar.setName("Lightning"); // Call an inherited method
        electricCar.show();

        System.out.println(electricCar.name2);


        ElectricCar2 electricCar2 = new ElectricCar2();
        System.out.println(electricCar2.name);


        Derived obj = new Derived(1, 2, 3);
    }
}