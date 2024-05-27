import com.husensei.NumberOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOperationsTest {

    @Test
    public void testPositive() {
        int result = NumberOperations.additionNumber(5, 10);
        Assertions.assertEquals(15, result);
    }

    @Test
    public void testNegative() {
        int result = NumberOperations.additionNumber(-5, -10);
        Assertions.assertEquals(-15, result);
    }

    @Test
    public void testZero() {
        int result = NumberOperations.additionNumber(0, 0);
        Assertions.assertEquals(0, result);
    }
}
