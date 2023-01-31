public class IsADemo {
    public static void main(String[] args) {
        DLList<String> someList = new DLList<>();
        // someList.addLast("elk");
        someList.addFirst("elk");
        someList.addLast("dwell");
        someList.addLast("on");
        someList.addLast("existential");
        someList.addLast("crises");
        someList.print();
    }
}
