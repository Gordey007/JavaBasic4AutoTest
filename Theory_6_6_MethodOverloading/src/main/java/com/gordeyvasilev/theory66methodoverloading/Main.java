package com.gordeyvasilev.theory66methodoverloading;

public class Main {
    static void doJob(byte b) {  System.out.println("byte");  }
    static void doJob(Byte b) {  System.out.println("Byte");  }


    static void doJob2(byte b) {  System.out.println("byte");  }
    static void doJob2(int i) {  System.out.println("int");  }
    static void doJob2(double d) {  System.out.println("double");  }


    static void doJob3(int i) {  System.out.println("int");  }
    static void doJob3(Double d) {  System.out.println("Double");  }


    static void doJob4(String s) {
        System.out.println("String");
    }
    static void doJob4(String s1, String s2) {
        System.out.println("String, String");
    }
    static void doJob4(String s1, String... str) {
        System.out.println("String, String...");
    }


    static void doJob5(String... ss) {
        System.out.println("String...");
    }
    static void doJob5(String s1, String s2) {
        System.out.println("String, String");
    }
    static void doJob5(String s1, String... str) {
        System.out.println("String, String...");
    }


    public static void main(String[] args) {
        byte b = 5;
        Byte bb = b;
//        doJob(b);
//        doJob(bb);
//
//        System.out.println();

        // Since the arguments are primitive data types, the compiler will first perform a wide cast and check
        // the result to match the parameters. The closest existing type for short → int, for long → double.
//        short s = 10;
//        long x = s;
//        double dd = s;
//        doJob2(s);
//        doJob2(x);
//        doJob2(dd);
//
//        System.out.println();

        // The compiler unboxes the argument of type Byte into a primitive type byte, and then uses a wide cast
        // to find a method with a parameter type of int.
//        byte b3 = 5;
//        Byte bb3 = b;
//        doJob3(b3);
//        doJob3(bb3);
//
//        System.out.println();

        // Since variable arity methods are the last ones to be checked for eligibility,
        // this method will only be executed on the third call when the method has three arguments.
//        doJob4("hi");
//        doJob4("hi", "hi");
//        doJob4("hi", "hi", "hi");
//
//        System.out.println();

        // If you call a method with one argument,
        // then you get uncertainty - two of the described methods (the first and third) are suitable.
        // Or, if called with three arguments,
        // then there will also be uncertainty - two of the described methods (the first and third) are suitable.
//         doJob5("hi"); // Error
//         doJob5("hi", "hi", "hi"); // Error
    }
}