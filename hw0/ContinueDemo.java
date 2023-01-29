public class ContinueDemo {
    public static void main(String[] args) {
        String[] a = { "cat", " dog", " horse" };
        for (int i = 0; i < a.length; i++) {
            if (a[i].contains("d"))
                break;
            else
                System.out.println(a[i]);
        }
    }
}
