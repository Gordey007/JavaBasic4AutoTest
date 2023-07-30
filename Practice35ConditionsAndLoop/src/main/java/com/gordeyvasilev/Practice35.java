package com.gordeyvasilev;

import java.util.Scanner;
import java.util.Collections;
import java.util.List;

/**
 * Write a simple program that:
 * <ul>
 *   <li>Requests the number of strangers to meet, and their names separated by spaces.</li>
 *   <li>Outputs “Hello, (stranger's name)” for each stranger, line by line.</li>
 * </ul>
 * It is guaranteed that the number of strangers entered is an integer.
 * <br>
 * <br>
 * Special cases:
 * <ul>
 *   <li>If the number of strangers is zero, the program should output: “Oh... Looks like nobody's here...”.</li>
 *   <li>If the number of strangers is negative, the program should output: “Seriously? What's so negative?”.</li>
 * </ul>
 * @Task <a href="https://stepik.org/lesson/731261/step/2?unit=732798">#3.5</a>
 */
public class Practice35 {
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
