package lbuthman.exercise24;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramCheckerTest {

    @Test
    public void testIsAnagramTrue() {
        boolean result = AnagramChecker.isAnagram("note", "tone");
        assertTrue(result);
    }

    @Test
    public void testIsAnagramFalse() {
        boolean result = AnagramChecker.isAnagram("hello", "ello");
    }
}
