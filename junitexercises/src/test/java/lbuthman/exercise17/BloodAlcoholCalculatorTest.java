package lbuthman.exercise17;

import org.junit.Test;

import static org.junit.Assert.*;

public class BloodAlcoholCalculatorTest {

    @Test
    public void testCalculateBACGood() {
        BloodAlcoholCalculator bloodAlcoholCalculator = new BloodAlcoholCalculator();
        bloodAlcoholCalculator.setWeight(170);
        bloodAlcoholCalculator.setDrinks(1);
        bloodAlcoholCalculator.setHours(2);
        bloodAlcoholCalculator.setSex("m");
        bloodAlcoholCalculator.setBloodWater(bloodAlcoholCalculator.calculateBloodWater());
        double bac = bloodAlcoholCalculator.calculateBAC();
        assertTrue(bac < 0.08);
    }

    @Test
    public void testCalculateBACBad() {
        BloodAlcoholCalculator bloodAlcoholCalculator = new BloodAlcoholCalculator();
        bloodAlcoholCalculator.setWeight(170);
        bloodAlcoholCalculator.setDrinks(2);
        bloodAlcoholCalculator.setHours(1);
        bloodAlcoholCalculator.setSex("m");
        bloodAlcoholCalculator.setBloodWater(bloodAlcoholCalculator.calculateBloodWater());
        double bac = bloodAlcoholCalculator.calculateBAC();
        assertTrue(bac > 0.08);
    }
}
