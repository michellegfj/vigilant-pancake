public class AList<Item> implements List61B<Item>S {
    private Item[] items;
    private int size;

    public AList() {
        items = (Item[]) new Object[100];
        size = 0;
    }

    @Override
    public void addLast(Item x) {
        if (size == items.length) {
            resize(size * 2); /** 2 is a random factor -- geometric rescaling */
        }
        items[size] = x;
        size++;
    }

    @Override
    public Item getFirst(){
        return items[0];
    }

    @Override
    public Item getLast() {
        return items[size - 1];
    }

    @Override
    public Item get(int i) {
        return items[i];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addFirst(Item x){
        return;
    }

    @Override
    public void addLast(Item x){
        return;
    }

    @Override
    public Item removeLast() {
        Item last = items[size - 1];
        items[size - 1] = null;
        size--;
        return last;
    }

    @Override
    private void resize(int capacity) {
        Item[] a = (Item[]) new Object[capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

}