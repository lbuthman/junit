package lbuthman.exercise38;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class EvenFilterTest {

    @Test
    public void testFilterEvenNumbers() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        String result = EvenFilter.filterEvenNumbers(numbers);
        assertEquals("2 4 6 ", result);
    }
}
