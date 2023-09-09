import com.gordeyvasilev.VarArg;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VarArgTest {

    VarArg tstvarg = new VarArg();

    @Test
    public void emptyArgs() {
        Assertions.assertEquals("0", String.valueOf(tstvarg.calcSum()));
    }

    @Test
    public void oneArgs() {
        Assertions.assertEquals("3", String.valueOf(tstvarg.calcSum(3)));
    }

    @Test
    public void args() {
        Assertions.assertEquals("6", String.valueOf(tstvarg.calcSum(1, 2, 3)));
    }

    @Test
    public void typeArgs() {
        int a = 1, b = 2, c = 3;
        Assertions.assertEquals("6", String.valueOf(tstvarg.calcSum(a, b, c)));
    }

    @Test
    public void arrArgs() {
        int[] arr = {1, 2, 3};
        Assertions.assertEquals("6", String.valueOf(tstvarg.calcSum(arr)));
    }

    @Test
    public void strTypeArgs() {
        int a = 1, b = 2, c = 3;
        Assertions.assertEquals("Hi\n6", String.valueOf(tstvarg.calcSumStr("Hi", a, b, c)));
    }

    @Test
    public void strArrArgs() {
        int[] arr = {1, 2, 3};
        Assertions.assertEquals("Hi\n6", String.valueOf(tstvarg.calcSumStr("Hi", arr)));
    }
}