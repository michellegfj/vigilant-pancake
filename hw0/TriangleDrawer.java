// TriangleDrawer

public class TriangleDrawer {
    public static void drawTriangle(int N) {
        int per_line = 0;
        int line = 1;
        while (line <= N) {
            while (per_line < line) {
                System.out.print("*");
                per_line++;
            }
            System.out.println();
            per_line = 0;
            line++;
        }
    }

    public static void main(String[] args) {
        drawTriangle(5);
    }
}