import com.gordeyvasilev.Practice_4_6_3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

class Practice_4_6_3_Test {
    @Test
    @DisplayName("Only even")
    void onlyEven() {
        String string = "4\n1 3 3 7";
        InputStream stringStream = new ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice_4_6_3.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        Assertions.assertEquals("0", printedOutput);
    }


    @Test
    @DisplayName("Odd")
    void odd() {
        String string = "5\n23 25 27 29 30";
        InputStream stringStream = new ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice_4_6_3.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        Assertions.assertEquals("30", printedOutput);
    }
}