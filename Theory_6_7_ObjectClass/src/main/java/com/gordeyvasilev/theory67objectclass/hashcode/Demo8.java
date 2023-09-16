package com.gordeyvasilev.theory67objectclass.hashcode;

import com.gordeyvasilev.theory67objectclass.equals.Point;

public class Demo8 {
    public static void main(String[] arg) {
        Point point1 = new Point(5, -5);
        // This way we get two references to one object
        Point point2 = point1;
        // The object is identical to the first two, but the hash code will be different
        Point point3 = new Point(5, -5);
        Point point4 = new Point(5, 5);

        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());
        System.out.println(point3.hashCode());
        System.out.println(point4.hashCode());

        String str1 = "hello world";
        String str2 = "hello world";
        String str3 = "hello world2";

        System.out.println();

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
    }
}
