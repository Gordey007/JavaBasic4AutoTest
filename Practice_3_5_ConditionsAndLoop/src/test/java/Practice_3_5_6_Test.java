import com.gordeyvasilev.Practice3_5_6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

class Practice_3_5_6_Test {
    @Test
    @DisplayName("Ok Case")
    void okCase() {
        String string = "1 3 3 7 0";
        InputStream stringStream = new ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice3_5_6.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        Assertions.assertEquals("2", printedOutput);
    }
}