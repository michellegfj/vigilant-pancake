public class ArrayDeque<T> {
    private T[] items;
    private int size;
    private int nextFirst;
    private int nextLast;
    private int start;

    public ArrayDeque() {
        items = (T[]) new Object[8];
        size = 0;
        nextFirst = 1;
        nextLast = 2;
        start = 1;
    }

    /** expand the size of items */
    private int expand(int nf) {
        T[] evolve = (T[]) new Object[2 * size];
        int befBeh = nf;
        int i = 0;
        evolve[i++] = items[befBeh++];
        while (befBeh != nf) {
            if (befBeh == size) {
                befBeh = 0;
                continue;
            }
            evolve[i++] = items[befBeh++];
        }
        items = evolve;
        return i;
    }

    // private int shrink(int nf) {
    // T[] evolve = (T[]) new Object[size / 2];
    // int befBeh = nf;
    // int i = 0;
    // evolve[i++] = items[befBeh++];
    // while (befBeh != nf) {
    // if (befBeh == size) {
    // befBeh = 0;
    // continue;
    // } else if (items[befBeh] == null) {
    // befBeh++;
    // continue;
    // }
    // evolve[i++] = items[befBeh++];
    // }
    // items = evolve;
    // return i;
    // }

    public void addFirst(T item) {
        if (items[nextFirst] != null) {
            nextLast = expand(nextLast);
            nextFirst = items.length - 1;
        }
        items[nextFirst] = item;
        if (size == 0) {
            start = nextFirst;
        }
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
            nextFirst = items.length - 1;
        }
        items[nextLast] = item;
        if (size == 0) {
            start = nextLast;
        }
        if (nextLast != items.length - 1) {
            nextLast++;
        } else {
            nextLast = 0;
        }
        size++;
        return;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public int size() {
        return size;
    }

    public void printDeque() {
        int nf = nextFirst;
        if (nf == 0) {
            nf = items.length - 1;
        }
        System.out.print(items[nf]);
        nf--;
        while (nf != nextFirst) {
            if (items[nf] == null) {
                nf--;
                continue;
            }
            System.out.print(" ");
            System.out.print(items[nf]);
            nf--;
        }
        return;
    }

    public T removeFirst() {
        if (size == 0) {
            return null;
        }
        if (nextFirst == items.length - 1) {
            nextFirst = 0;
        } else {
            nextFirst++;
        }
        T rt = items[nextFirst];
        items[nextFirst] = null;
        // size--;
        // if (size < items.length / 2 && size > 15) {
        // nextLast = shrink(nextFirst);
        // nextFirst = 0;
        // }
        return rt;
    }

    public T removeLast() {
        if (size == 0) {
            return null;
        }
        if (nextLast == 0) {
            nextLast = items.length - 1;
        } else {
            nextLast--;
        }
        T rt = items[nextLast];
        items[nextLast] = null;
        size--;
        // if (size < items.length / 2 && size > 15) {
        // nextLast = shrink(nextFirst);
        // nextFirst = 0;
        // }
        return rt;
    }

    public T get(int index) {
        int realDex = index + start;
        if (realDex < items.length) {
            return items[realDex];
        } else {
            realDex -= items.length;
            return items[realDex];
        }
    }

}
