public class ArrayDeque<T> {
    private T[] items;
    private int size;
    private int nextFirst;
    private int nextLast;

    public ArrayDeque() {
        items = (T[]) new Object[8];
        size = 0;
        nextFirst = 1;
        nextLast = 2;
    }

    /** expand the size of items */
    private int expand(int NF) {
        T[] evolve = (T[]) new Object[2 * size];
        int befBeh = NF;
        int i = 0;
        evolve[i++] = items[befBeh++];
        while (befBeh != NF) {
            if (befBeh == size) {
                befBeh = 0;
                continue;
            }
            evolve[i++] = items[befBeh++];
        }
        items = evolve;
        return i;
    }

    public void addFirst(T item) {
        if (items[nextFirst] != null) {
            if (nextFirst == nextLast + 1) {
                int nextLast = expand(nextFirst - 1);
            } else {
                if (nextFirst == nextLast - 1) {
                    int nextLast = expand(nextFirst + 1);
                }
            }
            nextFirst = items.length - 1;
        }
        items[nextFirst] = item;
        if (nextFirst != 0) {
            nextFirst--;
        } else {
            nextFirst = items.length - 1;
        }
        size++;
        return;
    }

    public void addLast(T item) {
        if (items[nextLast] != null) {
            nextLast = expand(nextLast);
            nextFirst = items.length;
        }
        items[nextLast] = item;
        if (nextLast != items.length - 1) {
            nextLast++;
        } else {
            nextLast = 0;
        }
        size++;
        return;
    }

    public boolean isEmpty() {
        if (size != 0) {
            return false;
        }
        return true;
    }

    public int size() {
        return size;
    }

    public void printDeque() {
        int NF = nextFirst;
        if (NF == 0) {
            NF = items.length - 1;
        }
        System.out.print(items[NF]);
        NF--;
        while (NF != nextFirst) {
            if (items[NF] == null) {
                NF--;
                continue;
            }
            System.out.print(" ");
            System.out.print(items[NF]);
            NF--;
        }
        return;
    }

    public T removeFirst() {
        if (size == 0)
            return null;
        if (nextFirst == items.length - 1) {
            nextFirst = 0;
        } else {
            nextFirst++;
        }
        T rt = items[nextFirst];
        items[nextFirst] = null;
        return rt;
    }

    public T removeLast() {
        if (size == 0)
            return null;
        if (nextLast == 0) {
            nextLast = items.length - 1;
        }else {
            nextLast--;
        }
        T rt = items[nextLast];
        items[nextLast] = null;
        return rt;
    }

    public T get(int index) {
        return items[index];
    }

}
