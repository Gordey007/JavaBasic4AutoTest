package com.gordeyvasilev.theory67objectclass.equals;

public class Demo7 {
    public static void main(String[] args){
        Point point1 = new Point(5, -5);
        Point point2 = point1; // Copying a link
        Point point3 = new Point(5, -5); // Creating New Objects
        Point point4 = new Point(5, 5);

        System.out.println(point1.equals(point2));
        System.out.println(point1.equals(point3));
        System.out.println(point1.equals(point4));

        String str1 = "hello world";
        String str2 = "hello world";
        String str3 = "hello world3";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

    }
}
