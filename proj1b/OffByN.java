public class OffByN implements CharacterComparator {
    private int gap;

    public OffByN(int N) {
        gap = N;
    }

    public int getGap() {
        return gap;
    }

    @Override
    public boolean equalChars(char x, char y) {
        return (x == y + gap || x == y - gap);
    }

}
