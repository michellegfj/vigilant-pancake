/** Deque is an irregular acronym of Double-Ended Queue. */

public class LinkedListDeque<T> implements Deque<T> {
    private Node sentinel;
    private int size;

    private class Node {
        private Node prev;
        private T item;
        private Node next;

        public Node(T item0) {
            prev = null;
            item = item0;
            next = null;
        }
    }

    public LinkedListDeque() {
        T trans = (T) new Object();
        // T[] transs=(T[]) new Object[6];
        sentinel = new Node(trans);
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
        size = 0;
    }

    private LinkedListDeque(T item0) {
        T trans = (T) new Object();
        sentinel = new Node(trans);
        sentinel.next = new Node(item0);
        sentinel.prev = sentinel.next;

        sentinel.next.next = sentinel;
        sentinel.next.prev = sentinel;
        size = 1;
    }

    private LinkedListDeque(Node node) {
        T trans = (T) new Object();
        sentinel = new Node(trans);
        sentinel.next = node;
        Node ptr = node;
        while (ptr != null) {
            ptr = ptr.next;
        }
        ptr = sentinel;
        sentinel.prev = ptr;
        node.prev = sentinel;
    }

    /** Add an item of type T to the front of the deque */
    @Override
    public void addFirst(T item) {
        if (size == 0) {
            sentinel.next = new Node(item);
            sentinel.prev = sentinel.next;

            sentinel.next.next = sentinel;
            sentinel.next.prev = sentinel;
            size = 1;
            return;
        }
        Node newNode = new Node(item);
        Node trans = sentinel.next;
        sentinel.next = newNode;
        trans.prev = newNode;

        newNode.prev = sentinel;
        newNode.next = trans;

        size++;
        return;
    }

    @Override
    public void addLast(T item) {
        if (size == 0) {
            sentinel.prev = new Node(item);
            sentinel.next = sentinel.prev;

            sentinel.prev.next = sentinel;
            sentinel.prev.prev = sentinel;
            size = 1;
            return;
        }
        Node newNode = new Node(item);
        Node trans = sentinel.prev;
        sentinel.prev = newNode;
        newNode.next = sentinel;
        newNode.prev = trans;
        trans.next = newNode;
        size++;
        return;
    }

    /** Return true if deque is empty, false otherwise. */
    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public int size() {
        return size;
    }

    /**
     * Print the items in the deque from first to last,
     * separated by a space
     */
    @Override
    public void printDeque() {
        Node ptr = sentinel.next;
        while (ptr != sentinel) {
            System.out.print(ptr.item);
            ptr = ptr.next;
            if (ptr != sentinel) {
                System.out.println(" ");
            }
        }
        return;
    }

    /**
     * Removes and returns the item at the front of the deque.
     * If no such item exists, returns null.
     */
    @Override
    public T removeFirst() {
        if (size == 0) {
            return null;
        }
        // if (size == 1) {
        // T first = sentinel.next.item;
        // sentinel.next = null;
        // sentinel.prev = null;
        // size--;
        // return first;
        // }
        T first = sentinel.next.item;
        Node new1 = sentinel.next.next;
        sentinel.next = new1;
        new1.prev = sentinel;
        size--;
        return first;
    }

    @Override
    public T removeLast() {
        if (size == 0) {
            return null;
        }

        T last = sentinel.prev.item;
        Node new1 = sentinel.prev.prev;
        sentinel.prev = new1;
        new1.next = sentinel;
        size--;
        return last;
    }

    /**
     * Gets the item at the given index,
     * where 0 is the front, and so forth.
     * Must not alter the deque.
     */
    @Override
    public T get(int index) {
        Node ptr = sentinel.next;
        int i = 0;
        while (i < index) {
            if (ptr == sentinel) {
                System.out.println("Error! The index is out of boundary.");
                return null;
            }
            ptr = ptr.next;
            i++;
        }
        return ptr.item;
    }

    public T getRecursive(int index) {
        if (index == 0) {
            return sentinel.next.item;
        }
        sentinel = sentinel.next;
        return getRecursive(index - 1);
    }

}
