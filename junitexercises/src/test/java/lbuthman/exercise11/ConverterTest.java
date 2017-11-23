package lbuthman.exercise11;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void testConvertEuroToUSD() {
        Converter converter = new Converter();
        double usd = converter.convertEuroToUSD(81);
        assertEquals(95.70, usd, .01);
    }
}
