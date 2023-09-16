package com.gordeyvasilev.practice35conditionsandloop;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Practice3_5_6 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] a = scanner.nextLine().split(" ");

            int avg = 0;
            for (String s : a) {
                avg = Integer.valueOf(s) + avg;
            }

            System.out.println(avg / a.length);
        }
    }
}
