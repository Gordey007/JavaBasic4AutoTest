package com.gordeyvasilev.theory64subclassingcapabilities;

public class BritishCat extends Cat {
    BritishCat() {
        // Note: You should not use any outputs or inputs in constructors,
        // we only use them here to demonstrate the order of calls.
        System.out.println("British constructor");
    }

    BritishCat(String name) {
        super(name);
        System.out.println("British constructor");
    }
}
