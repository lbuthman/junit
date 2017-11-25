package lbuthman.exercise26;

import org.junit.Test;

import static org.junit.Assert.*;

public class CreditCardPayoffCalculatorTest {

    @Test
    public void testCalculateMonthsUntilPaidOff() {
        double result = CreditCardPayoffCalculator.calculateMonthsUntilPaidOff(5000,
                0.12, 100);
        assertEquals(70, Math.ceil(result), 0);

    }
}
