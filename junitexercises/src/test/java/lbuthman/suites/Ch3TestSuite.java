package lbuthman.suites;

import lbuthman.exercise11.ConverterTest;
import lbuthman.exercise7.SquareTest;
import lbuthman.exercise8.PizzaPartyTest;
import lbuthman.exercise9.PaintCalculatorTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value=Suite.class)
@Suite.SuiteClasses(value={SquareTest.class, PizzaPartyTest.class,
        PaintCalculatorTest.class, ConverterTest.class})
public class Ch3TestSuite {
}
