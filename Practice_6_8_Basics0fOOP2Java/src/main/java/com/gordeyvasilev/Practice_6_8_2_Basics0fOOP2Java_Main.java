package com.gordeyvasilev;

import java.util.Scanner;

public class Practice_6_8_2_Basics0fOOP2Java_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        double b = sc.nextDouble();
        String s = sc.next();

        System.out.println(
                Practice_6_8_2_Action.sum(a, a) + " " +
                Practice_6_8_2_Action.sum(a, b) + " " +
                Practice_6_8_2_Action.sum(s, a)
        );
    }
}