public class TestDeque {
    public static void testAdd() {
        // LinkedListDeque raw = new LinkedListDeque<Character>('s');
        // LinkedListDeque expected = new LinkedListDeque<Character>();
        // raw.addFirst('a');

        ArrayDeque ori = new ArrayDeque<Integer>();
        ori.addFirst(1);
        ori.addFirst(0);
    }

    /** 6 7 0 1 2 3 4 5 */
    public static void testExpand() {
        ArrayDeque ori = new ArrayDeque<Integer>();
        ori.addFirst(1);
        ori.addFirst(0);
        ori.addFirst(7);
        ori.addFirst(6);
        ori.addLast(2);
        ori.addLast(3);
        ori.addLast(4);
        ori.addLast(5);
        ori.addLast(888);
    }

    public static int testRemoveFirst() {
        ArrayDeque<Integer> lld = new ArrayDeque<>();
        lld.addFirst(2);
        return lld.removeLast();
    }

    public static void main(String[] args) {
        // testAdd();
        // testExpand();
        int tr = testRemoveFirst();
    }
}
