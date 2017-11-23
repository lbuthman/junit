package lbuthman.exercise14;

import org.junit.Test;
import static org.junit.Assert.*;

public class TaxCalculatorTest {

    @Test
    public void testWisconsinTax() {
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.setSubtotal(10.00);
        taxCalculator.setState("WI");
        double tax = taxCalculator.calculateTax();
        assertEquals(0.55, tax, 0);
    }

    @Test
    public void testGenericTax() {
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.setSubtotal(10.00);
        taxCalculator.setState("OK");
        double tax = taxCalculator.calculateTax();
        assertEquals(0, tax, 0);
    }
}
