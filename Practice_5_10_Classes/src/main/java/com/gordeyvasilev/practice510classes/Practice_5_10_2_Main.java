package com.gordeyvasilev.practice510classes;

import java.util.Scanner;

public class Practice_5_10_2_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int k2 = scanner.nextInt();
        int b2 = scanner.nextInt();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        Practice_5_10_2_Line line1 = new Practice_5_10_2_Line(k1, b1);
        Practice_5_10_2_Line line2 = new Practice_5_10_2_Line(k2, b2);

        System.out.println(line1.intersection(line2));
    }
}