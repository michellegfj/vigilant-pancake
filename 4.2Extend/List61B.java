/* Dynamic implementiation works for overriding, not overloading. */

public interface List61B<Item> {
    public void addFirst(Item x);

    public void addLast(Item x);

    public Item getFirst();

    public Item getLast();

    public Item removeLast();

    public int size();

    public Item get(int dex);

    // public void insert(Item x, int position);

    default public void print() {
        for (int i = 0; i < size(); i++) {
            System.out.print(get(i) + " ");
        }
        System.out.println();
    }
}