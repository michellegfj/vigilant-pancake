import org.junit.Test;
import static org.junit.Assert.*;

import java.beans.Transient;

public class TestPalindrome {
    // You must use this palindrome, and not instantiate
    // new Palindromes, or the autograder might be upset.
    static Palindrome palindrome = new Palindrome();
    static CharacterComparator obo = new OffByOne();

    @Test
    public void testIsPalindrome() {
        // assertTrue(Palindrome.isPalindrome(Palindrome.wordToDeque("racecar")));
        // assertFalse(Palindrome.isPalindrome(Palindrome.wordToDeque("cat")));
        assertFalse(palindrome.isPalindrome("cat", obo));
        assertTrue(palindrome.isPalindrome("flake", obo));
    }

    @Test
    public void testWordToDeque() {
        Deque d = palindrome.wordToDeque("persiflage");
        String actual = "";
        for (int i = 0; i < "persiflage".length(); i++) {
            actual += d.removeFirst();
        }
        assertEquals("persiflage", actual);
    } // Uncomment this class once you've created your Palindrome class.
}
