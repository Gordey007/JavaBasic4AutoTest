package com.gordeyvasilev.practice35conditionsandloop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;


class Practice_3_5_8_Test {
    @Test
    @DisplayName("Two roots")
    void twoRoots1() {
        String string = "1\n-3\n-4";
        InputStream stringStream = new ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice3_5_8.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        Assertions.assertEquals("-1,0 4,0", printedOutput);
    }


    @Test
    void twoRoots2() {
        String string = "1\n25\n100";
        InputStream stringStream = new ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice3_5_8.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        Assertions.assertEquals("-20,0 -5,0", printedOutput);
    }


    @Test
    void twoRoots3() {
        String string = "1\n5\n0";
        InputStream stringStream = new ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice3_5_8.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        Assertions.assertEquals("-5,0 0,0", printedOutput);
    }


    @Test
    void twoRoots4() {
        String string = "1\n-3\n2";
        InputStream stringStream = new ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice3_5_8.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        Assertions.assertEquals("1,0 2,0", printedOutput);
    }


    @Test
    void twoRoots5() {
        String string = "5 -9 -2";
        InputStream stringStream = new ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice3_5_8.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        Assertions.assertEquals("-0,2 2,0", printedOutput);
    }


    @Test
    @DisplayName("One root")
    void oneRoot1() {
        String string = "1\n-2\n1";
        InputStream stringStream = new ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice3_5_8.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        Assertions.assertEquals("1,0", printedOutput);
    }


    @Test
    @DisplayName("Without roots")
    void withoutRoots() {
        String string = "5\n2\n3";
        InputStream stringStream = new ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice3_5_8.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        Assertions.assertEquals("without roots", printedOutput);
    }
}