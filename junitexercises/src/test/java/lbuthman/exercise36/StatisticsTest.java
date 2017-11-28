package lbuthman.exercise36;

import edu.emory.mathcs.backport.java.util.Arrays;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StatisticsTest {

    private List<Double> numbers = new ArrayList<>();

    public List<Double> getNumbers() {
        numbers.add(100.0);
        numbers.add(200.0);
        numbers.add(1000.0);
        numbers.add(300.0);
        return numbers;
    }

    @Test
    public void testCalculateAverage() {
        List<Double> doubles = getNumbers();
        double result = Statistics.calculateAverage(doubles);
        assertEquals(400, result, 0);
    }

    @Test
    public void testCalculateMinimum() {
        List<Double> doubles = getNumbers();
        double result = Statistics.calculateMinimum(doubles);
        assertEquals(100, result, 0);
    }

    @Test
    public void testCalculateMaximum() {
        List<Double> doubles = getNumbers();
        double result = Statistics.calculateMaximum(doubles);
        assertEquals(1000, result, 0);

    }

    @Test
    public void testCalculateStandardDeviation() {
        List<Double> doubles = getNumbers();
        double mean = Statistics.calculateAverage(doubles);
        double result = Statistics.calculateStandardDeviation(doubles, mean);
        assertEquals(353.55, result, .005);

    }
}
