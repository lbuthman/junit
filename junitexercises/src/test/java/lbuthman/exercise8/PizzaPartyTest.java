package lbuthman.exercise8;

import org.junit.Test;
import static org.junit.Assert.*;

public class PizzaPartyTest {

    @Test
    public void testCalculateTotalSlices() {
        PizzaCalculator pizzaCalculator = new PizzaCalculator();
        pizzaCalculator.setPizzas(2);
        int totalSlices = pizzaCalculator.calculateTotalSlices();
        assertEquals(16, totalSlices, 0);
    }

    @Test
    public void testCalculateSlicesPerPerson() {
        PizzaCalculator pizzaCalculator = new PizzaCalculator();
        pizzaCalculator.setPeople(8);
        pizzaCalculator.setPizzas(2);
        int slicesPerPerson = pizzaCalculator.calculateSlicesPerPerson();
        assertEquals(2, slicesPerPerson);
    }
}
