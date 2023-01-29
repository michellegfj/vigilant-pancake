public class WindowPosSumLauncher {
    public static void main(String[] args) {
        int[] a = { 1, 2, -3, 4, 5, 4 };
        int n = 3;
        BreakContinue.WindowPosSum(a, n);
        for (int ia : a) {
            System.out.print(ia);
            System.out.print(" ");
        }
    }
}
