package com.gordeyvasilev.theory73interfacesjava8.example2;

public class Class1 implements Interface1, Interface2 { //Compile error if log method is not overridden
    @Override
    public void method2() { // The example implements only abstract methods
        // ...
    }
    @Override
    public void method1(String str) {
        // ...
    }

    @Override
    public void log(String str) {
        // Interface1.super.log(str);
        System.out.println("Class1. Logging : " + str);
    }
}
