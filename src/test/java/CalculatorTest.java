import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();


    @Test
    public void sqrtTruePositive()
    {
        assertEquals("Finding square root of a number for True Positive", 2, calculator.sqrt(4), DELTA);
        assertEquals("Finding square root of a number for True Positive", 10, calculator.sqrt(100), DELTA);

    }

    @Test
    public void sqrtFalsePositive()
    {
        assertNotEquals("Finding square root of a number for False Positive", 4, calculator.sqrt(25), DELTA);
        assertNotEquals("Finding square root of a number for False Positive", 100, calculator.sqrt(4), DELTA);
    }

    @Test
    public void factorialTruePositive()
    {
        assertEquals("Finding factorial of a number for True Positive", 120, calculator.factorial(5), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 24, calculator.factorial(4), DELTA);

    }

    @Test
    public void factorialFalsePositive()
    {
        assertNotEquals("Finding factorial of a number for False Positive", 120, calculator.factorial(3), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 100, calculator.factorial(4), DELTA);
    }


    @Test
    public void naturallogTruePositive()
    {
        assertEquals("Finding natural log of a number for True Positive", 0, calculator.naturallog(1), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 2.30, calculator.naturallog(10), DELTA);

    }

    @Test
    public void naturallogFalsePositive()
    {
        assertNotEquals("Finding natural log of a number for False Positive", 120, calculator.naturallog(1), DELTA);
        assertNotEquals("Finding natural log of a number for False Positive", 4, calculator.naturallog(100), DELTA);
    }

    @Test
    public void powerTruePositive()
    {
        assertEquals("Finding power of a number for True Positive", 25, calculator.power(5, 2), DELTA);
        assertEquals("Finding power of a number for True Positive", 256, calculator.power(4, 4), DELTA);

    }

    @Test
    public void powerFalsePositive()
    {
        assertNotEquals("Finding power of a number for False Positive", 10, calculator.power(3, 2), DELTA);
        assertNotEquals("Finding power of a number for False Positive", 25, calculator.power(4,2), DELTA);
    }

//    @Test
//    public void multiplicationTruePositive(){
//        assertEquals("Finding multiplication of two number for True Positive", 15, calculator.multiplication(5,3), DELTA);
//        assertEquals("Finding multiplication of two number for True Positive", 24, calculator.multiplication(6,4), DELTA);
//    }
//
//    @Test
//    public void multiplicationFalsePositive(){
//        assertNotEquals("Finding multiplication of two number for False Positive", 120, calculator.multiplication(5,8), DELTA);
//        assertNotEquals("Finding multiplication of two number for False Positive", 80, calculator.multiplication(4,10), DELTA);
//    }
//
//    @Test
//    public void squareTruePositive(){
//        assertEquals("Finding sqaure for True Positive", 16, calculator.square(4), DELTA);
//        assertEquals("Finding sqaure for True Positive", 1, calculator.square(1), DELTA);
//    }
//
//    @Test
//    public void squareFalsePositive(){
//        assertNotEquals("Finding square for False Positive", 10, calculator.square(3), DELTA);
//        assertNotEquals("Finding square for False Positive", 20, calculator.square(4), DELTA);
//
//    }
//
//    @Test
//    public void cuberootTruePositive(){
//        assertEquals("Finding cuberoot for True Positive", 5, calculator.cuberoot(125), DELTA);
//        assertEquals("Finding cuberoot for True Positive", -5, calculator.cuberoot(-125), DELTA);
//    }
//
//    @Test
//    public void cuberootFalsePositive(){
//        assertNotEquals("Finding cuberoot for False Positive", 11, calculator.cuberoot(121), DELTA);
//        assertNotEquals("Finding cuberoot for False Positive", 3, calculator.cuberoot(8), DELTA);
//
//    }
//
//
//    @Test
//    public void subTruePositive(){
//        assertEquals("Finding subtraction of two number for True Positive", 2, calculator.sub(5,3), DELTA);
//        assertEquals("Finding subtraction of two number for True Positive", -2, calculator.sub(6,8), DELTA);
//    }
//
//    @Test
//    public void subFalsePositive(){
//        assertNotEquals("Finding subtraction of two number for False Positive", 3, calculator.sub(5,8), DELTA);
//        assertNotEquals("Finding subtraction of two number for False Positive", -1, calculator.sub(5,4), DELTA);
//    }

}
