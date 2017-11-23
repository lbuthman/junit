package lbuthman.suites;

import lbuthman.exercise14.TaxCalculatorTest;
import lbuthman.exercise15.PasswordValidatorTest;
import lbuthman.exercise16.AgeCheckerTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(value={TaxCalculatorTest.class, PasswordValidatorTest.class,
        AgeCheckerTest.class})
public class Ch4TestSuite {
}
