import org.junit.Test;
import static org.junit.Assert.*;

public class TestOffByN {

    // You must use this CharacterComparator and not instantiate
    // new ones, or the autograder might be upset. 
    CharacterComparator offBy5 = new OffByN(5);

    @Test
    public void testOffByN() {
        char x = 'a';
        char y = 'f';
        char z = 't';
        assertTrue(offBy5.equalChars(x, y));
        assertFalse(offBy5.equalChars(x, z));
    }
}
