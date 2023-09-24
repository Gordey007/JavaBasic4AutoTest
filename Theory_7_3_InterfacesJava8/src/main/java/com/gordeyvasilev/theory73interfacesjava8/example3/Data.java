package com.gordeyvasilev.theory73interfacesjava8.example3;

public interface Data {
    default void print(String str) {
        if ( !isNull(str) ) {
            System.out.println("Data. Prints lines: " + str);
        }
    }
    static boolean isNull(String str) {
        System.out.println("Static method null checking ");
        return str == null ? true : "".equals(str.trim()) ? true : false;
    }

    // Such methods belong to the interface and cannot be overridden in the class that implements the interface.
    static boolean isNull2(String str) {
        System.out.println("Static method null checking ");
        return str == null ? true : "".equals(str.trim()) ? true : false;
    }
}
