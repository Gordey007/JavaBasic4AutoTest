import com.gordeyvasilev.Student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    Student student = new Student();

    @Test
    public void setFirstName() {
        student.setFirstName("John");
        Assertions.assertEquals("John", student.getFirstName());
    }

    @Test
    public void setFirstName2() {
        student.setFirstName2("John2");
        Assertions.assertEquals("John2", student.getFirstName());
    }
}
