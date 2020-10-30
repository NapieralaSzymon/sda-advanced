package pl.sda.advanced.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void divideFourByTwo() {
        assertEquals(2, calculator.divide(4, 2));
    }

    @Test
    void divideOneByZero() {
        try {
            calculator.divide(1, 0);
            fail();
        } catch (Exception exception) {
//            assertTrue(exception instanceof ArithmeticException);
//            assertTrue(exception instanceof IllegalArgumentException);
            assertTrue(exception instanceof ValidationException);
            assertEquals("Cholero nie dziel przez zero!", exception.getMessage());
        }
    }

}