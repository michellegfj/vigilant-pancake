package synthesizer;

// TODO: Make sure to make this class a part of the synthesizer package
// package <package name>;
import java.util.Iterator;

import javax.management.RuntimeErrorException;
import synthesizer.AbstractBoundedQueue;

//TODO: Make sure to make this class and all of its methods public
//TODO: Make sure to make this class extend AbstractBoundedQueue<t>
public class ArrayRingBuffer<T> extends AbstractBoundedQueue<T> {
    /* Index for the next dequeue or peek. */
    private int first; // index for the next dequeue or peek
    /* Index for the next enqueue. */
    private int last;
    /* Array for storing the buffer data. */
    private T[] rb;

    /**
     * Create a new ArrayRingBuffer with the given capacity.
     */
    public ArrayRingBuffer(int capacity) {
        // TODO: Create new array with capacity elements.
        // first, last, and fillCount should all be set to 0.
        // this.capacity should be set appropriately. Note that the local variable
        // here shadows the field we inherit from AbstractBoundedQueue, so
        // you'll need to use this.capacity to set the capacity.
        first = 0;
        last = 0;
        this.fillCount = 0;
        this.capacity = capacity;
        rb = (T[]) new Object[capacity];
    }

    /**
     * Adds x to the end of the ring buffer. If there is no room, then
     * throw new RuntimeException("Ring buffer overflow"). Exceptions
     * covered Monday.
     */
    public void enqueue(T x) {
        // TODO: Enqueue the item. Don't forget to increase fillCount and update last.
        if (fillCount >= capacity) {
            throw new RuntimeException("Ring Buffer OVerflow");
        }
        rb[last] = x;
        if (last < capacity - 1) {
            last++;
        } else {
            last = 0;
        }
        fillCount++;
        return;
    }

    /**
     * Dequeue oldest item in the ring buffer. If the buffer is empty, then
     * throw new RuntimeException("Ring buffer underflow"). Exceptions
     * covered Monday.
     */
    public T dequeue() {
        // TODO: Dequeue the first item. Don't forget to decrease fillCount and update
        if (rb == null) {
            throw new RuntimeException("Ring buffer underflow");
        }
        T returnItem = rb[first];
        /* rb[first] = null; */
        if (first == 0) {
            first = capacity - 1;
            while (rb[first] == null) {
                first--;
            }
        } else {
            first--;
        }
        fillCount--;
        return returnItem;

    }

    /**
     * Return oldest item, but don't remove it.
     */
    public T peek() {
        // TODO: Return the first item. None of your instance variables should change.
        return rb[first];
    }

    private class RingIterator implements Iterator<T>{
        private int ptr;

        public RingIterator() {
            ptr = first;
        }

        public boolean hasNext() {
            return (ptr != last);
        }

        public T next() {
            T returnValue = rb[ptr];
            ptr++;
            if (ptr == capacity) {
                ptr = 0;
            }
            return returnValue;
        }

    }

    @Override
    public Iterator<T> iterator() {
        return new RingIterator();
    }

    // TODO: When you get to part 5, implement the needed code to support iteration.
}
