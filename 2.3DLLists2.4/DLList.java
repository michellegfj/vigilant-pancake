import java.security.cert.X509CRL; 

public class DLList {
    private int size;
    private IntNode sentinel;

    public class IntNode {
        public IntNode prev;
        public int item;
        public IntNode next;

        public IntNode(IntNode p, int x, IntNode n) {
            prev = p;
            item = x;
            next = n;
        }
    }

    public DLList() {
        sentinel = new IntNode(null, 63, null);
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
        size = 0;
    }

    public DLList(int x) {
        sentinel = new IntNode(null, 63, null);
        IntNode p = new IntNode(sentinel, x, sentinel);
        sentinel.next = p;
        sentinel.prev = p;
        size = 1;
    }

    public void addFirst(int x) {
        IntNode p = new IntNode(sentinel, x, sentinel.next);
        sentinel.next.prev = p;
        sentinel.next = p;
        size++;
    }

    public void addLast(int x) {
        IntNode p = new IntNode(sentinel.prev, x, sentinel);
        sentinel.prev.next = p;
        sentinel.prev = p;
        size++;
    }

    public void rmvLast() {
    }

    public static void main(String[] args) {
        DLList ind = new DLList(63);
        ind.addLast(46);
        ind.addFirst(70);
    }
}