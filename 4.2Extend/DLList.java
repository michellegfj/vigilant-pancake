import java.io.ObjectStreamException;

import org.w3c.dom.Node;

public class DLList<Item> extends Object implements List61B<Item> {
    private int size;
    private IntNode sentinel;

    public class IntNode {
        public IntNode prev;
        public Item item;
        public IntNode next;

        public IntNode(IntNode p, Item x, IntNode n) {
            prev = p;
            item = x;
            next = n;
        }
    }

    public DLList() {
        Item sent = (Item) new Object();
        sentinel = new IntNode(null, sent, null);
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
        size = 0;
    }

    public DLList(Item x) {
        Item sent = (Item) new Object();
        sentinel = new IntNode(null, sent, null);
        IntNode p = new IntNode(sentinel, x, sentinel);
        sentinel.next = p;
        sentinel.prev = p;
        size = 1;
    }

    @Override
    public void addFirst(Item x) {
        IntNode p = new IntNode(sentinel, x, sentinel.next);
        sentinel.next.prev = p;
        sentinel.next = p;
        size++;
    }

    @Override
    public void addLast(Item x) {
        IntNode p = new IntNode(sentinel.prev, x, sentinel);
        sentinel.prev.next = p;
        sentinel.prev = p;
        size++;
    }

    @Override
    public Item removeLast() {
        Item removed = sentinel.prev.item;
        IntNode newLast = sentinel.prev.prev;
        newLast.next=sentinel;
        sentinel.prev=newLast;
        return removed;
    }

    @Override
    public Item get(int dex) {
        sentinel = sentinel.next;
        if (dex == 0) {
            return sentinel.item;
        }
        return get(dex - 1);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Item getFirst() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Item getLast() {
        return null;
    }

    @Override
    public void print() {
        for (IntNode p = sentinel.next; p != sentinel; p = p.next) {
            System.out.print(p.item + " ");
        }
    }
}