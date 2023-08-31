package com.gordeyvasilev;

import java.util.Scanner;


public class Practice3_5_3 {
    public static void main(String[] args) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int h = scanner.nextInt();

            if (a >= h)
                System.out.println(1);
            else if (a <= b)
                System.out.println("Never");
            else if (h == 0)
                System.out.println(0);
            else {
                int cnt = 0;
                int i = a;
                do {
                    cnt++;
                    i = i + a - b;
                } while (i < h);

                System.out.println(cnt + 1);
            }
        } finally {
            assert scanner != null;
            scanner.close();
        }
    }
}
