package com.gordeyvasilev.theory74cloningobjects.cloningbyconstructor;

public class Main {
    public static void main(String[] args) {
        ClassA obj1 = new ClassA();
        //...
        ClassA obj2 = new ClassA(obj1);
    }
}