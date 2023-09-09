import com.gordeyvasilev.Practice_5_10_2_Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;


public class Practice_5_10_2_MainTest {
    @Test
    @DisplayName("The intersection of lines exists")
    public void intersection() {
        String string = "1 2 2 1";
        InputStream stringStream = new ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice_5_10_2_Main.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        Assertions.assertEquals("(1;3)", printedOutput);
    }


    @Test
    @DisplayName("Straight identical")
    public void straightIdentical() {
        String string = "0 0 0 0";
        InputStream stringStream = new ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice_5_10_2_Main.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        Assertions.assertEquals("null", printedOutput);
    }


    @Test
    @DisplayName("No line intersections")
    public void noIntersections() {
        String string = "0 0 0 -3";
        InputStream stringStream = new ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice_5_10_2_Main.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        Assertions.assertEquals("null", printedOutput);
    }
}