package synthesizer;
import java.util.Iterator;

import synthesizer.BoundedQueue;

public abstract class AbstractBoundedQueue<T> implements BoundedQueue<T> {
    protected int fillCount;
    protected int capacity;

    @Override
    public int capacity() {
        return capacity;
    }

    @Override
    public int fillCount() {
        return fillCount;
    }

}

/*
 * methods and fields
 * field is just another word for instance variable
 */