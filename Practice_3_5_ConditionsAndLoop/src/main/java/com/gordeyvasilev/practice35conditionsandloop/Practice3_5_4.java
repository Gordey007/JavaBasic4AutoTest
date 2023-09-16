package com.gordeyvasilev.practice35conditionsandloop;

import java.util.Scanner;


public class Practice3_5_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a < 0)
            System.out.println("The food isn't so bad that you get paid to eat it.");
        else if (b <= 0)
            System.out.println("Who is there?!");
        else
            System.out.println((int) (a * 1.1 / b));
    }
}
