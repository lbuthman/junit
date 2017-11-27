package lbuthman.exercise31;

import org.junit.Test;

import static org.junit.Assert.*;

public class KarvonenHeartRateTest {

    private int RESTING = 65;
    private int AGE = 22;

    @Test
    public void testCalculateTargetHR55() {
        double intensity = 55 / 100.0;
        int result = KarvonenHeartRate.calculateTargetHR(AGE, RESTING, intensity);
        assertEquals(138, result, 0);
    }

    @Test
    public void testCalculateTargetHR95() {
        double intensity = 95 / 100.0;
        int result = KarvonenHeartRate.calculateTargetHR(AGE, RESTING, intensity);
        assertEquals(191, result, 0);
    }
}
