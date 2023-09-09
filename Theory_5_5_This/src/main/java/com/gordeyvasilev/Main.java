package com.gordeyvasilev;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.setFirstName("John");
        System.out.println(student.getFirstName());
        student.setFirstName2("John2");
        System.out.println(student.getFirstName());
    }
}