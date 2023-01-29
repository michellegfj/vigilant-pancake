public class EnhanceForLoop {
    public static void main(String[] args) {
        String[] a = { "cat", " dog", " horse" };
        for (String s : a) {
            if (s.contains("d"))
                break;
            else
                System.out.println(s);
        }
    }
}
