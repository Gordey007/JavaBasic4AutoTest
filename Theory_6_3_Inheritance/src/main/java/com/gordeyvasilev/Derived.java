package com.gordeyvasilev;

public class Derived extends Base {
    private int c;
    Derived(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    // Derived(){
        // super(); // Error private
    // }
}
