package com.gordeyvasilev;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;


public class Practice3_5_5 {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(Stream.of(
                    scanner.nextLine().split(" ")
            ).max(Comparator.comparing(String::valueOf)).get());

            // For Java 7
//            System.out.println(Collections.max(Arrays.asList(
//                    scanner.nextLine().split(" ")
//            )));

            // additionally
//            String[] a = scanner.nextLine().split(" ");
//            System.out.println(Collections.min(Arrays.asList(a).subList(0, a.length - 1)));
        }
    }


}