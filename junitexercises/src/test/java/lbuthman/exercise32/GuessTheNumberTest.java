package lbuthman.exercise32;

import org.junit.Test;

import static org.junit.Assert.*;

public class GuessTheNumberTest {

    @Test
    public void testGetRandomNumber() {
        for (int i=1; i<100; i++) {
            int j = GuessTheNumber.getRandomNumber(10);
            assertTrue(j > 0 && j <= 10);
        }
    }
}
