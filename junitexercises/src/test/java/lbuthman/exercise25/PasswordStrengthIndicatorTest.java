package lbuthman.exercise25;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordStrengthIndicatorTest {

    @Test
    public void testHasDigitsTrue() {
        boolean result = PasswordStrengthIndicator.hasDigits("eight8");
        assertTrue(result);
    }

    @Test
    public void testHasDigitsFalse() {
        boolean result = PasswordStrengthIndicator.hasDigits("eights");
        assertTrue(!result);
    }

    @Test
    public void testHasLettersTrue() {
        boolean result = PasswordStrengthIndicator.hasLetters("123a");
        assertTrue(result);
    }

    @Test
    public void testHasLettersFalse() {
        boolean result = PasswordStrengthIndicator.hasLetters("1234");
        assertTrue(!result);
    }

    @Test
    public void testHasEightLettersTrue() {
        boolean result = PasswordStrengthIndicator.hasEightCharacters("12345678");
        assertTrue(result);
    }

    @Test
    public void testHasEightLettersFalse() {
        boolean result = PasswordStrengthIndicator.hasEightCharacters("1234567");
        assertTrue(!result);
    }

    @Test
    public void testHasSpecialCharactersTrue() {
        boolean result = PasswordStrengthIndicator.hasSpecialCharacter("abc123!");
        assertTrue(result);
    }

    @Test
    public void testHasSpecialCharactersFalse() {
        boolean result = PasswordStrengthIndicator.hasSpecialCharacter("abc123");
        assertTrue(!result);
    }

    @Test
    public void testPasswordValidatorVeryWeak() {
        int result = PasswordStrengthIndicator.passwordValidator("12345");
        assertEquals(1, result, 0);
    }

    @Test
    public void testPasswordValidatorWeak() {
        int result = PasswordStrengthIndicator.passwordValidator("abcdef");
        assertEquals(2, result, 0);
    }

    @Test
    public void testPasswordValidatorStillWeak() {
        int result = PasswordStrengthIndicator.passwordValidator("abc123");
        assertEquals(3, result, 0);
    }

    @Test
    public void testPasswordValidatorStrong() {
        int result = PasswordStrengthIndicator.passwordValidator("abc123xyz");
        assertEquals(4, result, 0);
    }

    @Test
    public void testPasswordValidatorVeryStrong() {
        int result = PasswordStrengthIndicator.passwordValidator("1337h@xor!");
        assertEquals(5, result, 0);
    }
}
