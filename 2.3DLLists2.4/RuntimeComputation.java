import java.util.Scanner;

import java.util.Scanner;

public class RuntimeComputation {
    public static int askUser(String[] args) {
        System.out.print("What index do you want?  5443");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void main(String[] args) {
        int[] x = new int[] { 100, 101, 102, 103 };
        int indexOfInterest = askUser(args);
        int k = x[indexOfInterest];
        System.out.println(k);
    }

}
