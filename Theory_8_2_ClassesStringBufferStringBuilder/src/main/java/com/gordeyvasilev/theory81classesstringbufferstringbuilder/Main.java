package com.gordeyvasilev.theory81classesstringbufferstringbuilder;

import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        /**
         * StringBuffer - thread safe and synchronized. This means it is better to use
         * in multithreaded applications, where an object can be accessed by multiple threads.
         * If you are developing a single-threaded application, then it is better to use the StringBuilder class.
         * It is not thread safe, but it is faster than StringBuffer.
         */

        // When creating a new StringBuffer object, the default constructor is called.
        // It automatically reserves 16 characters of memory (buffer capacity).

        // The equals() and hashCode() methods are not overridden for the StringBuffer and StringBuilder classes.
        // Based on this, it is impossible to compare the contents of two objects.

        StringBuilder sb1 = new StringBuilder("I like Java.");
        StringBuilder sb2 = new StringBuilder(sb1);
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.compareTo(sb2) == 0);

        // When calling methods of StringBuffer/StringBuilder objects, changes are made to the contents of the current object,
        // rather than creating a new object, as when working with String.
        StringBuilder str = new StringBuilder("Learning ");
        updateString(str);
        System.out.println(str);

        String str2 = new String("Learning ");
        updateString(str2);
        System.out.println(str2);

        StringJoiner joiner = new StringJoiner(":", "<<", ">>");
        String result = joiner.add("blanc").add("rouge").add("blanc").toString();
        System.out.println(result);


        char[] name = new char[] {'P','a','u','l'};
        String boy = new String(name);
        StringBuilder sd1_2 = new StringBuilder("String Builder");
        String str5 = new String(sd1_2);
        StringBuffer sb2_2 = new StringBuffer("String Buffer");
        String str6 = new String(sb2_2);
        String empName = null;
    }

    static void updateString(StringBuilder string) {
        string.append("java!");
    }

    static void updateString(String string){
        string += "java!";
    }
}