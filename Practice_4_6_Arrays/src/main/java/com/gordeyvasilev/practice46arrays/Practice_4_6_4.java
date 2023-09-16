package com.gordeyvasilev.practice46arrays;

import java.util.Arrays;
import java.util.Scanner;


public class Practice_4_6_4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int size = Integer.parseInt(scanner.nextLine());
            String[] str = scanner.nextLine().split(" ");

            Boolean[] res = new Boolean[size];
            res[0] = false;
            res[1] = false;

            for (int i = 2; i < size; i++)
                res[i] = Integer.parseInt(str[i]) == Integer.parseInt(str[i - 1]) + Integer.parseInt(str[i - 2]);

            System.out.println(Arrays.toString(res));
        }
    }
}
