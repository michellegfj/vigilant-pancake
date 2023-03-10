import static org.junit.Assert.*;

// import java.beans.Transient;

// import javax.swing.event.ListDataEvent;

import org.junit.Test;

public class IntListTest {

    /** specify the maximum time in milliseconds */
    // @Test(timeout = 1000)

    /**
     * Example test that verifies correctness of the IntList.of static
     * method. The main point of this is to convince you that
     * assertEquals knows how to handle IntLists just fine.
     */

    @Test
    public void testReverse() {
        IntList ordered1 = IntList.of(1, 2, 3, 4, 5);
        IntList ptr1 = IntList.of(1, 2, 3, 4, 5);
        IntList ordered2 = IntList.of(1);
        IntList ptr2 = IntList.of(1);
        IntList ordered3 = null;
        IntList ptr3 = null;

        IntList reversed1 = IntList.of(5, 4, 3, 2, 1);
        IntList reversed2 = IntList.of(1);
        IntList reversed3 = null;

        ordered1 = IntList.reverse(ordered1);
        ordered2 = IntList.reverse(ordered2);
        ordered3 = IntList.reverse(ordered3);

        assertEquals(reversed1, ordered1);
        assertEquals(reversed2, ordered2);
        assertEquals(reversed3, ordered3);

        assertNotEquals(ordered1, ptr1);
        // assertNotEquals(ordered2, ptr2);
        // assertNotEquals(ordered3, ptr3);
    }

    @Test
    public void testList() {
        IntList one = new IntList(1, null);
        IntList twoOne = new IntList(2, one);
        IntList threeTwoOne = new IntList(3, twoOne);

        IntList x = IntList.of(3, 2, 1);
        assertEquals(threeTwoOne, x);
    }

    @Test
    public void testdSquareList() {
        IntList L = IntList.of(1, 2, 3);
        IntList.dSquareList(L);
        assertEquals(IntList.of(1, 4, 9), L);
    }

    /**
     * Do not use the new keyword in your tests. You can create
     * lists using the handy IntList.of method.
     * <p>
     * Make sure to include test cases involving lists of various sizes
     * on both sides of the operation. That includes the empty list, which
     * can be instantiated, for example, with
     * IntList empty = IntList.of().
     * <p>
     * Keep in mind that dcatenate(A, B) is NOT required to leave A untouched.
     * Anything can happen to A.
     */

    @Test
    public void testSquareListRecursive() {
        IntList L = IntList.of(1, 2, 3);
        IntList res = IntList.squareListRecursive(L);
        assertEquals(IntList.of(1, 2, 3), L);
        assertEquals(IntList.of(1, 4, 9), res);
    }

    @Test
    public void testDcatenate() {
        IntList A = IntList.of(1, 2, 3);
        IntList B = IntList.of(4, 5, 6);
        IntList exp = IntList.of(1, 2, 3, 4, 5, 6);
        assertEquals(exp, IntList.dcatenate(A, B));
        assertEquals(IntList.of(1, 2, 3, 4, 5, 6), A);
    }

    @Test
    public void testCatenate() {
        IntList A = IntList.of(1, 2, 3);
        IntList B = IntList.of(4, 5, 6);
        IntList exp = IntList.of(1, 2, 3, 4, 5, 6);
        assertEquals(exp, IntList.catenate(A, B));
        assertEquals(IntList.of(1, 2, 3), A);
    }

    /**
     * If you're running this from the command line, you'll need
     * to add a main method. See ArithmeticTest.java for an
     * example.
     */

    /**
     * public static void main(String... args) {
     * jh61b.junit.TestRunner.runTests("all", IntListTest.class);
     * /** Change "all" to "failed" so that JUnit test file only shows results of
     * failed tests
     */

}
