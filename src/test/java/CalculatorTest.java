import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator obj = new Calculator();

    @Test
    public void factorialTruePositive()
    {
        assertEquals("Finding factorial of a number for True Positive", 120, obj.factorial(5));
        assertEquals("Finding factorial of a number for True Positive", 24, obj.factorial(4));

    }
}
