package com.gordeyvasilev.practice68basicsofoop2java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;


public class Practice_6_8_2_Basics0fOOP2Java_MainTest {
    @Test
    @DisplayName("Ok case")
    public void ok() {
        String string = "2\n4,5\nJan";
        InputStream stringStream = new ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice_6_8_2_Basics0fOOP2Java_Main.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        Assertions.assertEquals("4 6.5 Jan2", printedOutput);
    }
}