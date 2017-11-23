package lbuthman.exercise15;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordValidatorTest {

    @Test
    public void testCheckPasswordSuccess() {
        SecretPassword secretPassword = new SecretPassword("floatingCastle");
        String result = secretPassword.checkPassword("floatingCastle");
        assertSame(result, "You got it!");
    }

    @Test
    public void testCheckPasswordFail() {
        SecretPassword secretPassword = new SecretPassword("floatingCastle");
        String result = secretPassword.checkPassword("randomGuess");
        assertNotSame(result, "You got it!");
    }

    @Test
    public void testCheckPasswordFailMessage() {
        SecretPassword secretPassword = new SecretPassword("floatingCastle");
        String result = secretPassword.checkPassword("randomGuess");
        assertSame(result, "I don't know who you are.");
    }
}
