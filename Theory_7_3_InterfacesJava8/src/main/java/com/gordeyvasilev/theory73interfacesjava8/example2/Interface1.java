package com.gordeyvasilev.theory73interfacesjava8.example2;

public interface Interface1 {
    void method1(String str);
    default void log(String str) { // Одноименные методы по умолчанию в двух интерфейсах
        System.out.println("The default method. Logging: " + str);
    }
}
