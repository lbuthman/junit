package lbuthman.suites;

import lbuthman.exercise36.StatisticsTest;
import lbuthman.exercise38.EvenFilterTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(value={StatisticsTest.class, EvenFilterTest.class})
public class Ch7TestSuite {
}
