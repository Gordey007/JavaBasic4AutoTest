package com.gordeyvasilev;

import java.util.Scanner;


public class Practice_4_6_3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int size = Integer.parseInt(scanner.nextLine());
            String[] str = scanner.nextLine().split(" ");

            int sum = 0;
            int tmp;

            for (int i = 0; i < size; i++) {
                tmp = Integer.parseInt(str[i]);
                if (tmp % 2 == 0)
                    sum += tmp;
            }

            System.out.println(sum);
        }
    }
}
