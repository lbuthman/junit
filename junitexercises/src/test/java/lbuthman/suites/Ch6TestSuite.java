package lbuthman.suites;

import lbuthman.exercise31.KarvonenHeartRateTest;
import lbuthman.exercise32.GuessTheNumberTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(value={KarvonenHeartRateTest.class, GuessTheNumberTest.class})
public class Ch6TestSuite {
}
