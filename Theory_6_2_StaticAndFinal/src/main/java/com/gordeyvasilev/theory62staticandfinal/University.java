package com.gordeyvasilev.theory62staticandfinal;

public class University {
    public static void main(String[] args) {
        JavaCourse courses[] = {new JavaCourse(), new JavaCourse()};
        courses[0].courseName = "MegaCourse";

        for (JavaCourse c : courses) {
            c = new JavaCourse();
        }

        for (JavaCourse c : courses) {
            System.out.print(c.courseName);
        }
    }
}