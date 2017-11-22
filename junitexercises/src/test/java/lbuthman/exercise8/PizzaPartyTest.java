package lbuthman.exercise8;

import org.junit.Test;
import static org.junit.Assert.*;

public class PizzaPartyTest {

    @Test
    public void testCalculateTotalSlices() {
        PizzaCalculator pizzaCalculator = new PizzaCalculator();
        double totalSlices = pizzaCalculator.calculateTotalSlices(2);
        assertEquals(16, totalSlices, 0);
    }
}
