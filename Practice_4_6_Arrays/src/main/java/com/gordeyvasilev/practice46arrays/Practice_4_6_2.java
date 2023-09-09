package com.gordeyvasilev.practice46arrays;

import java.util.Arrays;
import java.util.Scanner;


public class Practice_4_6_2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int size = Integer.parseInt(scanner.nextLine());

            if (size < 1)
                System.out.println("Array of zero size");
            else {
                String[] str = scanner.nextLine().split(" ");

                int[] arrInt = new int[size];
                for (int i = 0; i < size; i++)
                    arrInt[i] = Integer.parseInt(str[i]);

                Arrays.sort(arrInt);
                System.out.println(arrInt[arrInt.length - 1]);
            }
        }
    }
}
