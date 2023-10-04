package com.gordeyvasilev.practice83regularexpressions;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String[] str = scanner.nextLine().split(" ");

        System.out.println(Arrays.toString(str));
    }
}