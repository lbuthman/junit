package lbuthman.suites;

import lbuthman.exercise14.TaxCalculatorTest;
import lbuthman.exercise15.PasswordValidatorTest;
import lbuthman.exercise16.AgeCheckerTest;
import lbuthman.exercise17.BloodAlcoholCalculatorTest;
import lbuthman.exercise18.TemperatureConverterTest;
import lbuthman.exercise19.BMICalculatorTest;
import lbuthman.exercise20.MultiStateTaxCalculatorTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(value={TaxCalculatorTest.class, PasswordValidatorTest.class,
        AgeCheckerTest.class, BloodAlcoholCalculatorTest.class, TemperatureConverterTest.class,
        BMICalculatorTest.class, MultiStateTaxCalculatorTest.class})
public class Ch4TestSuite {
}
