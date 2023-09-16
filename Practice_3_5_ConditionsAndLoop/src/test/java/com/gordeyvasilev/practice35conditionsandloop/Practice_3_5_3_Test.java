package com.gordeyvasilev.practice35conditionsandloop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;


class Practice_3_5_3_Test {
    @Test
    @DisplayName("Should be processed \"6\"")
    void six1() {
        String string = "4\n2\n14";
        InputStream stringStream = new ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice3_5_3.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        Assertions.assertEquals("6", printedOutput);
    }


    @Test
    void six2() {
        String string = "4\n2\n15";
        InputStream stringStream = new ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice3_5_3.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        Assertions.assertEquals("7", printedOutput);
    }


    @Test
    @DisplayName("Should be processed \"1\"")
    void one1() {
        String string = "2\n1\n1";
        InputStream stringStream = new ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice3_5_3.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        Assertions.assertEquals("1", printedOutput);
    }


    @Test
    void one2() {
        String string = "10\n12\n10";
        InputStream stringStream = new ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice3_5_3.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        Assertions.assertEquals("1", printedOutput);
    }

    @Test
    void one3() {
        String string = "1\n1\n1";
        InputStream stringStream = new ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice3_5_3.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        Assertions.assertEquals("1", printedOutput);
    }


    @Test
    @DisplayName("Should be processed \"Never\"")
    void never1() {
        String string = "3\n5\n7";
        InputStream stringStream = new ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice3_5_3.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        Assertions.assertEquals("Never", printedOutput);
    }

    @Test
    void never2() {
        String string = "3\n3\n7";
        InputStream stringStream = new ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice3_5_3.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        Assertions.assertEquals("Never", printedOutput);
    }
}