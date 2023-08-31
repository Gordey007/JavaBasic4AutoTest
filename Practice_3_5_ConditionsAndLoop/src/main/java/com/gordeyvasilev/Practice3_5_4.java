package com.gordeyvasilev;

import java.util.Scanner;


public class Practice3_5_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a < 0)
            System.out.println("Еда не так плоха, чтобы за ее поедание доплачивали");
        else if (b <= 0)
            System.out.println("Кто здесь?!");
        else
            System.out.println((int) (a * 1.1 / b));
    }
}
