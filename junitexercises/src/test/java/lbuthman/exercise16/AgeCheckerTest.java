package lbuthman.exercise16;

import org.junit.Test;

import static org.junit.Assert.*;

public class AgeCheckerTest {

    @Test
    public void testCheckAgeFail() {
        AgeChecker ageChecker = new AgeChecker();
        String result = ageChecker.checkAge(15);
        assertSame("You are not old enough to legally drive.", result);
    }

    @Test
    public void testCheckAgeSuccess() {
        AgeChecker ageChecker = new AgeChecker();
        String result = ageChecker.checkAge(16);
        assertSame("You are old enough to legally drive.", result);
    }
}
