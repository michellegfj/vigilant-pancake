public class TestDeque {
    public static void testAddFirst() {
        LinkedListDeque raw = new LinkedListDeque<Character>('s');
        LinkedListDeque expected = new LinkedListDeque<Character>();
        raw.addFirst('a');

    }

    public static void main(String[] args) {
        testAddFirst();
    }
}
