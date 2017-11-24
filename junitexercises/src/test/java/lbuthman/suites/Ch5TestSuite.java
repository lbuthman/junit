package lbuthman.suites;

import lbuthman.exercise24.AnagramCheckerTest;
import lbuthman.exercise25.PasswordStrengthIndicatorTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(value = { AnagramCheckerTest.class, PasswordStrengthIndicatorTest.class})
public class Ch5TestSuite {
}
