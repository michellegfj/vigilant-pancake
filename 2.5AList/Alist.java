public class Alist<Item> {
    private Item[] items;
    private int size;

    public Alist() {
        items = (Item[]) new Object[100];
        size = 0;
    }

    public void addLast(Item x) {
        if (size == items.length) {
            resize(size * 2); /** 2 is a random factor -- geometric rescaling */
        }
        items[size] = x;
        size++;
    }

    public Item getLast() {
        return items[size - 1];
    }

    public Item get(int i) {
        return items[i];
    }

    public int size() {
        return size;
    }

    public Item removeLast() {
        Item last = items[size - 1];
        items[size - 1] = null;
        size--;
        return last;
    }

    private void resize(int capacity) {
        Item[] a = (Item[]) new Object[capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

}