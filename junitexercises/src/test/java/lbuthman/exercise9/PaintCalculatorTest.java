package lbuthman.exercise9;

import org.junit.Test;
import static org.junit.Assert.*;

public class PaintCalculatorTest {

    @Test
    public void testCalculateGallons() {
        PaintCalculator paintCalculator = new PaintCalculator();
        paintCalculator.setLength(30);
        paintCalculator.setWidth(12);
        int gallons = paintCalculator.calculateGallons();
        assertEquals(2, gallons);
    }
}
