import org.junit.Test;
import static org.junit.Assert.*;

import java.beans.Transient;

public class TestOffByOne {

    // You must use this CharacterComparator and not instantiate
    // new ones, or the autograder might be upset.

     CharacterComparator offByOne = new OffByOne();

    @Test
    public void testEqualChars() {
        char x = 'x';
        char y = 'y';
        char z = 'z';
        assertTrue(offByOne.equalChars(x, y));
        assertFalse(offByOne.equalChars(x, z));
    }

    // Your tests go here.
    /*
     * Uncomment this class once you've created your CharacterComparator interface
     * and OffByOne class.
     **/
}
