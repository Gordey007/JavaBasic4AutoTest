package com.gordeyvasilev.theory64subclassingcapabilities;

public class Cat {
    Cat() {
        // Note: You should not use any outputs or inputs in constructors,
        // we only use them here to demonstrate the order of calls.
        System.out.println("Cat constructor");
    }

    Cat(String name) {
        System.out.println("Cat constructor – name " + name);
    }
}
