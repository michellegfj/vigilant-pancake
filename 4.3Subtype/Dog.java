import java.util.Comparator;
import java.util.jar.Attributes.Name;

public class Dog implements Comparable<Dog> {
    public int weightInpounds;
    public static String binomen;

    /** One integer constructor for dogs */
    public Dog(String binomen0, int w) {
        weightInpounds = w;
        binomen = binomen0;
    }

    public void bark() {
        if (weightInpounds < 10) {
            System.out.println(this.binomen + " says: yip!");
        } else if (weightInpounds < 30) {
            System.out.println(this.binomen + " says: bark.");
        } else {
            System.out.println(this.binomen + " says: woooof!");
        }
    }

    public int compareTo(Dog uddaDog) {
        return this.weightInpounds - uddaDog.weightInpounds;
    }

    private static class NameComparator implements Comparator<Dog>{
        /* public interface Comparator{
            public int compare(Object o1. Object o2);
        } */
        
        public int compare(Dog a, Dog b) {
            return a.binomen.compareTo(b.binomen);
        }
    }

    public static Comparator<Dog> getNameComparator(){
        return new NameComparator();
    }
}

/**
 * public class Dog implements OurComparable {
 * public int weightInpounds;
 * public static String binomen;
 * 
 * public Dog(String binomen0, int w) {
 * weightInpounds = w;
 * binomen = binomen0;
 * }
 * 
 * public void bark() {
 * if (weightInpounds < 10) {
 * System.out.println(this.binomen + " says: yip!");
 * } else if (weightInpounds < 30) {
 * System.out.println(this.binomen + " says: bark.");
 * } else {
 * System.out.println(this.binomen + " says: woooof!");
 * }
 * }
 * 
 * public int compare_to(Object o) {
 * Dog uddaDog = (Dog) o;
 * return this.weightInpounds - uddaDog.weightInpounds;
 * }
 * }
 */
