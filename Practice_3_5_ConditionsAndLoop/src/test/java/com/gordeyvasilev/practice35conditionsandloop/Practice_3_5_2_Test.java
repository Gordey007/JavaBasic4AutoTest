package com.gordeyvasilev.practice35conditionsandloop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

class Practice_3_5_2_Test {
    @Test
    @DisplayName("Should be processed \"-1\"")
        // Redirect System.out to capture the output
    void negativeNumber() {
        String string = "-1";
        InputStream stringStream = new ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        // Call the main method
        Practice3_5_2.main(new String[]{});

        // Get the printed output
        String printedOutput = outputStream.toString().trim();

        Assertions.assertEquals("Seriously? What's so negative?", printedOutput);
    }


    @Test
    @DisplayName("Should print 'Looks like nobody's here'")
    void empty() {
        String string = "0";
        InputStream stringStream = new ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice3_5_2.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        Assertions.assertEquals("Ooh... Looks like nobody's here...", printedOutput);
    }


    @Test
    @DisplayName("Should print a greeting")
    void greeting() {
        String string = "2 Smith John";
        InputStream stringStream = new ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice3_5_2.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        Assertions.assertEquals("Dear, Smith\nDear, John", printedOutput);
    }
}