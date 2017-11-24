package lbuthman.exercise19;

import org.junit.Test;

import static org.junit.Assert.*;

public class BMICalculatorTest {

    @Test
    public void testCalculateBMINormal() {
        BMICalculator bmiCalculator = new BMICalculator();
        bmiCalculator.setFeet(5);
        bmiCalculator.setInches(7);
        bmiCalculator.setWeight(150);
        double bmi = bmiCalculator.calculateBmi();
        assertTrue(bmi < 25 && bmi > 18.5);
    }

    @Test
    public void testCalculateBMIUnderweight() {
        BMICalculator bmiCalculator = new BMICalculator();
        bmiCalculator.setFeet(5);
        bmiCalculator.setInches(7);
        bmiCalculator.setWeight(110);
        double bmi = bmiCalculator.calculateBmi();
        assertTrue(bmi < 18.5);
    }

    @Test
    public void testCalculateBMIOverweight() {
        BMICalculator bmiCalculator = new BMICalculator();
        bmiCalculator.setFeet(5);
        bmiCalculator.setInches(7);
        bmiCalculator.setWeight(170);
        double bmi = bmiCalculator.calculateBmi();
        assertTrue(bmi > 25);
    }

    @Test
    public void testCalculateBMINormalResult() {
        BMICalculator bmiCalculator = new BMICalculator();
        bmiCalculator.setFeet(5);
        bmiCalculator.setInches(7);
        bmiCalculator.setWeight(150);
        double bmi = bmiCalculator.calculateBmi();
        String result = bmiCalculator.getBmiResult(bmi);
        assertEquals("Normal", result);
    }

    @Test
    public void testCalculateBMIUnderweightResult() {
        BMICalculator bmiCalculator = new BMICalculator();
        bmiCalculator.setFeet(5);
        bmiCalculator.setInches(7);
        bmiCalculator.setWeight(110);
        double bmi = bmiCalculator.calculateBmi();
        String result = bmiCalculator.getBmiResult(bmi);
        assertTrue(result.contains("Underweight"));
    }

    @Test
    public void testCalculateBMIOverweightResult() {
        BMICalculator bmiCalculator = new BMICalculator();
        bmiCalculator.setFeet(5);
        bmiCalculator.setInches(7);
        bmiCalculator.setWeight(170);
        double bmi = bmiCalculator.calculateBmi();
        String result = bmiCalculator.getBmiResult(bmi);
        assertTrue(result.contains("Overweight"));
    }
}
