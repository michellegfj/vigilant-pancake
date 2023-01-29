public class BreakContinue {
    public static void WindowPosSum(int[] a, int n) {
        int[] new_array;
        int len = a.length;
        new_array = new int[len];
        for (int i = 0; i < len; i++) {
            if (a[i] < 0) {
                new_array[i] = a[i];
                continue;
            }
            for (int j = i; j < len; j++) {
                if (j < i + 4)
                    new_array[i] += a[j];
            }
        }
        for (int b = 0; b < len; b++)
            a[b] = new_array[b];
    }
}
