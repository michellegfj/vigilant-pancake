public class DLList<BleepBlorp> {
    private int size;
    private IntNode sentinel;

    public class IntNode {
        public IntNode prev;
        public BleepBlorp item;
        public IntNode next;

        public IntNode(IntNode p, BleepBlorp x, IntNode n) {
            prev = p;
            item = x;
            next = n;
        }
    }

    public DLList() {
        sentinel = new IntNode(null, BleepBlorp, null);
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
        size = 0;
    }

    public DLList(BleepBlorp x) {
        BleepBlorp y = new <Integer> 63;
        sentinel = new IntNode(null, y, null);
        IntNode p = new IntNode(sentinel, x, sentinel);
        sentinel.next = p;
        sentinel.prev = p;
        size = 1;
    }

    public void addFirst(BleepBlorp x) {
        IntNode p = new IntNode(sentinel, x, sentinel.next);
        sentinel.next.prev = p;
        sentinel.next = p;
        size++;
    }

    public void addLast(BleepBlorp x) {
        IntNode p = new IntNode(sentinel.prev, x, sentinel);
        sentinel.prev.next = p;
        sentinel.prev = p;
        size++;
    }

    public void rmvLast() {
    }

    public static void main(String[] args) {
        DLList<String> ind = new DLList<>("hello");
        ind.addLast("world");
        ind.addFirst(70);
    }
}