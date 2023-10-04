package com.gordeyvasilev.practice83regularexpressions;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Arrays.toString(scanner.nextLine().split("[,.;:?!\\s]+")));
    }
}