/** Deque is an irregular acronym of Double-Ended Queue. */

public class LinkedListDeque<T> {
    private Node sentinel;
    private int size;

    public class Node {
        private Node prev;
        private T item;
        private Node next;

        public Node() {
            prev = null;
            item = null;
            next = null;
        }

        public Node(T item0) {
            prev = null;
            item = item0;
            next = null;
        }
    }

    public LinkedListDeque() {
        T trans = (T) new Object(); 
        //T[] transs=(T[]) new Object[6];
        sentinel = new Node(trans);
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
        size = 0;
    }

    public LinkedListDeque(T item0) {
        T trans = (T) new Object();
        sentinel = new Node(trans);
        sentinel.next = new Node(item0);
        sentinel.prev = sentinel.next;

        sentinel.next.next = sentinel;
        sentinel.next.prev = sentinel;
        size = 1;
    }

    /** Add an item of type T to the front of the deque */
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
    public boolean isEmpty() {
        if (size == 0)
            return true;
        else
            return false;
    }

    public int size() {
        return size;
    }

    /**
     * Print the items in the deque from first to last,
     * separated by a space
     */
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
    public T removeFirst() {
        if (size == 1) {
            return null;
        }
        Node evacuate = sentinel.next;
        T first = evacuate.item;
        Node new1 = sentinel.next.next;
        evacuate = new1;
        new1.prev = sentinel;
        return first;
    }

    public T removeLast() {
        if (size == 1) {
            return null;
        }
        Node evacuate = sentinel.prev;
        T last = evacuate.item;
        Node new1 = sentinel.prev.prev;
        evacuate = new1;
        new1.next = sentinel;
        return last;
    }

    /**
     * Gets the item at the given index,
     * where 0 is the front, and so forth.
     * Must not alter the deque.
     */
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
