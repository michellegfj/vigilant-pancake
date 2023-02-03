public class HoFDemo {
    public static int do_twice(TenX f, int x) {
        return f.apply(f.apply(x));
    }

    public static void main(String[] args) {
        TenX tenx = new TenX();
        System.out.println(do_twice(tenx, 2));
    }
}
