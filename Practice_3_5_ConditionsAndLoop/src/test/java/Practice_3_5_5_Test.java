import com.gordeyvasilev.Practice3_5_5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.*;

class Practice_3_5_5_Test {
    @Test
    @DisplayName("Ok Case")
    void okCase() throws IOException {
        String string = "1 3 3 7 0";
        InputStream stringStream = new ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice3_5_5.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        Assertions.assertEquals("7", printedOutput);
    }
}