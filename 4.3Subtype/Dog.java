public class Dog implements OurComparable {
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

    public int compare_to(Object o) {
        Dog uddaDog = (Dog) o;
        return this.weightInpounds - uddaDog.weightInpounds;
    }

}
