package lbuthman.exercise18;

import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureConverterTest {

    @Test
    public void testFreezingCtoF() {
        double f = TemperatureConverter.celsiusToFahrenheit(0);
        assertEquals(32, f, 0);
    }

    @Test
    public void testFreezingFtoC() {
        double c = TemperatureConverter.fahrenheitToCelsius(32);
        assertEquals(0, c, 0);
    }

    @Test
    public void testBoilCtoF() {
        double f = TemperatureConverter.celsiusToFahrenheit(100);
        assertEquals(212, f, 0);
    }

    @Test
    public void testBoilFtoC() {
        double c = TemperatureConverter.fahrenheitToCelsius(212);
        assertEquals(100, c, 0);
    }

}
