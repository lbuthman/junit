package lbuthman.suites;

import lbuthman.exercise24.AnagramCheckerTest;
import lbuthman.exercise25.PasswordStrengthIndicatorTest;
import lbuthman.exercise26.CreditCardPayoffCalculatorTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(value = { AnagramCheckerTest.class, PasswordStrengthIndicatorTest.class,
        CreditCardPayoffCalculatorTest.class})
public class Ch5TestSuite {
}
