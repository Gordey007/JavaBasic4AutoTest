package com.gordeyvasilev.theory72interfaces.example3;

public class SomeClass implements Interface1, Interface2 {

    // it is impossible to create separate implementations for methods of the same name from different interfaces in a class
    // (you can specify only one implementation common to all these methods).
    @Override
    public String someMethod() {
        System.out.println("In interface2 = " + Interface2.someField );
        return "It Works";
    }
}
