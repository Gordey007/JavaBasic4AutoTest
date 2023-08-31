import com.gordeyvasilev.Practice3_5_4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

class Practice_3_5_4_Test {
    @Test
    @DisplayName("Should be processed \"220\"")
    void okCase() {
        String string = "1000\n5";
        InputStream stringStream = new ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice3_5_4.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        Assertions.assertEquals("220", printedOutput);
    }


    @Test
    @DisplayName("No friends")
    void noFriends() {
        String string = "1000\n-1";
        InputStream stringStream = new ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice3_5_4.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        Assertions.assertEquals("Кто здесь?!", printedOutput);
    }


    @Test
    @DisplayName("No money")
    void noMoney() {
        String string = "-1\n5";
        InputStream stringStream = new ByteArrayInputStream(string.getBytes());

        System.setIn(stringStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Practice3_5_4.main(new String[]{});

        String printedOutput = outputStream.toString().trim();

        Assertions.assertEquals("Еда не так плоха, чтобы за ее поедание доплачивали", printedOutput);
    }
}