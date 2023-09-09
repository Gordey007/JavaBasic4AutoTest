package com.gordeyvasilev.theory56createobject;

public class Main {
    public static void main(String[] args) {

        // The null literal can be assigned to a variable of any reference type or cast to any reference type.
        String str1 = null;
        Car car1 = null;

        String str2 = (String) null;
        Car car2 = (Car) null;

        // The null literal cannot be used with other relational operators, such as < or >.
        System.out.println(null == null);
        System.out.println(car1 == null);
        System.out.println(car1 != car2);

        // When calling an instance method through a reference variable with the value null,
        // a runtime error will occur - NullPointerException!
        try {
            car1.getCarModel();
        } catch (NullPointerException e) {
            System.out.println("\nNULL\n");
            System.out.println(e.getMessage());
        }
    }
}