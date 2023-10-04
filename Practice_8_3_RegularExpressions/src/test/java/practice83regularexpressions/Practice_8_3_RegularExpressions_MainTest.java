package practice83regularexpressions;

import com.gordeyvasilev.practice83regularexpressions.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;


public class Practice_8_3_RegularExpressions_MainTest {
    @Test
    @DisplayName("Positive Case")
    public void positiveCase() {
        String string = "4\ngo with the FLOW";
        InputStream stringStream = new ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Main.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        Assertions.assertEquals("[go, with, the, FLOW]", printedOutput);
    }
}
