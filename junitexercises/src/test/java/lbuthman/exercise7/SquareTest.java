package lbuthman.exercise7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {

    @Test
    public void testCalculateAreaInFeet() {
        Square square = new Square(15, 20);
        double result = square.calculateAreaInFeet(square);
        assertEquals(300, result, 0);
    }

    @Test
    public void testCalculateAreaInMeters() {
        Square square = new Square(15, 20);
        double result = square.calculateAreaInMeters(square);
        assertEquals(27.871, result, .01);
    }
}
