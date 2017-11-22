package lbuthman.suites;

import lbuthman.exercise7.SquareTest;
import lbuthman.exercise8.PizzaPartyTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value=Suite.class)
@Suite.SuiteClasses(value={SquareTest.class, PizzaPartyTest.class})
public class Ch3TestSuite {
}
