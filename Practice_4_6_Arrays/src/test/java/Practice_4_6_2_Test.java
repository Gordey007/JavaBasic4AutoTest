import com.gordeyvasilev.Practice_4_6_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

class Practice_4_6_2_Test {
    @Test
    @DisplayName("Get max")
    void testGetMax() {
        String string = "4\n-2 0 10 5";
        InputStream stringStream = new ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice_4_6_2.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        Assertions.assertEquals("10", printedOutput);
    }


    @Test
    @DisplayName("Zero")
    void testZero() {
        String string = "0\n ";
        InputStream stringStream = new ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice_4_6_2.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        Assertions.assertEquals("Массив нулевого размера", printedOutput);
    }
}