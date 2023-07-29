package com.gordeyvasilev;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Practice27Test {
    @Test
    @DisplayName("Should print one minute in h:mm:ss format")
        // Redirect System.out to capture the output
    void oneMin() {
        String string = "60";
        InputStream stringStream = new java.io.ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        // Call the main method
        Practice27.main(new String[]{});

        // Get the printed output
        String printedOutput = outputStream.toString().trim();

        // Assert that the output is "Hello world!"
        assertEquals("0:01:00", printedOutput);
    }


    @Test
    @DisplayName("Should print 62 seconds in h:mm:ss format")
    void sixty2Sec() {
        String string = "62";
        InputStream stringStream = new java.io.ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice27.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        assertEquals("0:01:02", printedOutput);
    }


    @Test
    @DisplayName("Should print 62 seconds in h:mm:ss format")
    void leetSec() {
        String string = "1337";
        InputStream stringStream = new java.io.ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice27.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        assertEquals("0:22:17", printedOutput);
    }


    @Test
    @DisplayName("Should print 49020 seconds in h:mm:ss format")
    void moreThan10h() {
        String string = "49020";
        InputStream stringStream = new java.io.ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice27.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        assertEquals("13:37:00", printedOutput);
    }


    @Test
    @DisplayName("Should print 0 seconds in h:mm:ss format")
    void all2Zero() {
        String string = "000";
        InputStream stringStream = new java.io.ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice27.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        assertEquals("0:00:00", printedOutput);
    }


    @Test
    @DisplayName("Should print 86401 seconds in h:mm:ss format")
    void moreThanDay() {
        String string = "86401";
        InputStream stringStream = new java.io.ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice27.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        assertEquals("0:00:01", printedOutput);
    }
}