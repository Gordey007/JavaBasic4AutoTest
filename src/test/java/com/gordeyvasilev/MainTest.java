package com.gordeyvasilev;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    @DisplayName("Should print 'Hello world!' to the console")
        // Redirect System.out to capture the output
    void mainMethodPrintsHelloWorld() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        // Call the main method
        Main.main(new String[]{});

        // Get the printed output
        String printedOutput = outputStream.toString().trim();

        // Assert that the output is "Hello world!"
        assertEquals("Hello world!", printedOutput);
    }
}