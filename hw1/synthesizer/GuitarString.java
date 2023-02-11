// TODO: Make sure to make this class a part of the synthesizer package
//package <package name>;
package synthesizer;

import synthesizer.BoundedQueue;
import synthesizer.ArrayRingBuffer;
import java.lang.Math;

//Make sure this class is public
public class GuitarString extends ArrayRingBuffer<Double> {
    /**
     * Constants. Do not change. In case you're curious, the keyword final means
     * the values cannot be changed at runtime. We'll discuss this and other topics
     * in lecture on Friday.
     */
    private static final int SR = 44100; // Sampling Rate
    private static final double DECAY = .996; // energy decay factor

    /* Buffer for storing sound data. */
    private BoundedQueue<Double> buffer;

    /* Create a guitar string of the given frequency. */
    public GuitarString(double frequency) {
        // TODO: Create a buffer with capacity = SR / frequency. You'll need to
        // cast the result of this divsion operation into an int. For better
        // accuracy, use the Math.round() function before casting.
        // Your buffer should be initially filled with zeros.
        super((int) Math.round(SR / frequency));
        int cap = (int) Math.round(SR / frequency);
        buffer = new ArrayRingBuffer<>(cap);
    }

    /* Pluck the guitar string by replacing the buffer with white noise. */
    public void pluck() {
        // TODO: Dequeue everything in the buffer, and replace it with random numbers
        // between -0.5 and 0.5. You can get such a number by using:
        double r = Math.random() - 0.5; // Math.random() is between >= 0 and <1
        while (!buffer.isFull()) {
            buffer.enqueue(r);
            r = Math.random() - 0.5;
        }
        fillCount = capacity;
        return;
        // Make sure that your random numbers are different from each other.
    }

    /*
     * Advance the simulation one time step by performing one iteration of
     * the Karplus-Strong algorithm.
     */
    public void tic() {
        // TODO: Dequeue the front sample and enqueue a new sample that is
        // the average of the two multiplied by the DECAY factor.
        // Do not call StdAudio.play().
        Double front = buffer.dequeue();
        front = ((front + buffer.peek()) / 2) * DECAY;
        buffer.enqueue(front);
        // String a = buffer.toString();
        return;
    }

    /* Return the double at the front of the buffer. */
    public double sample() {
        // TODO: Return the correct thing.
        return buffer.peek();
    }
}
