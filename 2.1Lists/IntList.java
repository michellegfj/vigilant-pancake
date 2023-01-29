/**
 * Declare Instantiate Assign an array
 * Iteration IntList Recursion
 */

public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /** Return the size of the list using ... recursion! */
    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    /** Return the size of the list using no recursion! */
    public int iterativeSize() {
        IntList p = this;
        int totalSize = 0;
        while (p != null) {
            totalSize++;
            p = p.rest;
        }
        return totalSize;
    }

    /** return the nth item in the list */
    public int get(int i) {
        if (i == 0){
            return first;}
        return rest.get(--i);
    }

    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);

        System.out.println(L.size());
        System.out.println(L.iterativeSize());

        int[] a = new int[] { 1, 2, 3, 4 };
        System.out.print(a[0] + " " + a[1]);
    }
}