package synthesizer;

import org.junit.Test;
import static org.junit.Assert.*;
import synthesizer.ArrayRingBuffer;

/**
 * Tests the ArrayRingBuffer class.
 * 
 * @author Josh Hug
 */

public class TestArrayRingBuffer {
    @Test
    public void someTest() {
        ArrayRingBuffer<Double> arb = new ArrayRingBuffer<>(6);
        arb.enqueue(1.1);
        arb.enqueue(2.2);
        arb.enqueue(3.3);
        arb.enqueue(4.4);
        arb.enqueue(5.5);
        arb.enqueue(6.6);
        arb.enqueue(7.7);
        double first1 = arb.dequeue();
        double second = arb.dequeue();
    }

    /** Calls tests for ArrayRingBuffer. */
    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(TestArrayRingBuffer.class);
    }
}
