package com.gordeyvasilev;

import java.util.Scanner;


public class Practice3_5_8 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();

            double d = b * b - 4 * a * c;

            if (d > 0) {
                double x1, x2;
                x1 = (-b - Math.sqrt(d)) / (2 * a);
                x2 = (-b + Math.sqrt(d)) / (2 * a);
                if (x1 < x2)
                    System.out.printf("%.1f %.1f", x1, x2);
                else
                    System.out.printf("%.1f %.1f", x2, x1);
            } else if (d == 0) {
                double x;
                x = -b / (2 * a);
                System.out.printf("%.1f", x);
            } else System.out.println("without roots");
        }
    }
}
