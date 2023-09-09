package com.gordeyvasilev.practice35conditionsandloop;

import java.util.Scanner;
import java.util.Collections;
import java.util.List;


public class Practice3_5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String names = scanner.nextLine();

        List<String> l = switch (List.of(names.split(" ")).get(0)) {
            case "0" -> {
                System.out.println("Ooh... Looks like nobody's here...");
                yield Collections.emptyList();
            }
            case "-1" -> {
                System.out.println("Seriously? What's so negative?");
                yield Collections.emptyList();
            }
            default -> List.of(names.split(" "));
        };

        if (!l.isEmpty())
            for (int i = 1; i < l.size(); i++)
                System.out.printf("Dear, %s\n", l.get(i));
    }
}
