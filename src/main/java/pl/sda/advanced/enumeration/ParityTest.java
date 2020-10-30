package pl.sda.advanced.enumeration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParityTest {

    @Test
    void isZeroEven() {
        assertTrue(Parity.EVEN.match(0));
        assertFalse(Parity.ODD.match(0));
    }

    @Test
    void isOneOdd() {
        assertFalse(Parity.EVEN.match(1));
        assertTrue(Parity.ODD.match(1));
    }

    @Test
    void isTwoEven() {
        assertTrue(Parity.EVEN.match(2));
        assertFalse(Parity.ODD.match(2));
    }

    @Test
    void isThreeOdd() {
        assertFalse(Parity.EVEN.match(3));
        assertTrue(Parity.ODD.match(3));
    }

    @Test
    void isTenEven() {
        assertTrue(Parity.EVEN.match(10));
        assertFalse(Parity.ODD.match(10));
    }

    @Test
    void isEvenToStringAsE() {
        assertEquals("E", Parity.EVEN.toString());
    }

    @Test
    void isOddToStringAsO() {
        assertEquals("O", Parity.ODD.toString());
    }

    @Test
    void isCalculable() {
        assertTrue(Parity.EVEN.isCalculable());
        assertTrue(Parity.ODD.isCalculable());
    }

}
