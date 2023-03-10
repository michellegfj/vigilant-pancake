import java.lang.reflect.Array;

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

    public static void testGet() {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.addFirst(0);
        ad.removeLast();      //0
        ad.addLast(2);
        ad.addLast(3);
        ad.addLast(4);
        ad.addLast(5);
        ad.addFirst(6);
        System.out.println(ad.get(0)); // 6
    }

    public static void main(String[] args) {
        // testAdd();
        // testExpand();
        // int tr = testRemoveFirst();
        testGet();
    }
}
