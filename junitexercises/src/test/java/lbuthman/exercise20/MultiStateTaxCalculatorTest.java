package lbuthman.exercise20;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiStateTaxCalculatorTest {

    @Test
    public void testGetCountyTaxRateEauClaire() {
        MultiStateTaxCalculator taxCalculator = new MultiStateTaxCalculator();
        double rate = taxCalculator.getCountyTaxRate("eau claire");
        assertEquals(0.05, rate, 0);
    }

    @Test
    public void testGetCountyTaxRateDunn() {
        MultiStateTaxCalculator taxCalculator = new MultiStateTaxCalculator();
        double rate = taxCalculator.getCountyTaxRate("dunn");
        assertEquals(0.04, rate, 0);
    }

    @Test
    public void testGetCountyTaxRateOther() {
        MultiStateTaxCalculator taxCalculator = new MultiStateTaxCalculator();
        double rate = taxCalculator.getCountyTaxRate("anything");
        assertEquals(0, rate, 0);
    }

    @Test
    public void testCalculateTax() {
        MultiStateTaxCalculator taxCalculator = new MultiStateTaxCalculator();
        taxCalculator.setAmount(10.0);
        double tax = taxCalculator.calculateTax(0.05);
        assertEquals(0.5, tax, 0);
    }

    @Test
    public void testCalculateTaxZero() {
        MultiStateTaxCalculator taxCalculator = new MultiStateTaxCalculator();
        taxCalculator.setAmount(10.0);
        double tax = taxCalculator.calculateTax(0);
        assertEquals(0, tax, 0);
    }
}
