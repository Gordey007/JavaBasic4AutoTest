package com.gordeyvasilev.practice46arrays;

import com.gordeyvasilev.practice46arrays.Practice_4_6_4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

class Practice_4_6_4_Test {
    @Test
    @DisplayName("Ok case")
    void onlyEven() {
        String string = "8\n1 -1 0 4 6 10 15 27";
        InputStream stringStream = new ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice_4_6_4.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        Assertions.assertEquals("[false, false, true, false, false, true, false, false]", printedOutput);
    }
}