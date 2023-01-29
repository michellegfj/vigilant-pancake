public class Dog {
    public int weightInpounds;
    public static String binomen = "Canis familiaris";

    /** One integer constructor for dogs */
    public Dog(int w) {
        weightInpounds = w;
    }

    public void makeNoise() {
        if (weightInpounds < 10) {
            System.out.println("yip!");
        } else if (weightInpounds < 30) {
            System.out.println("bark.");
        } else {
            System.out.println("woooof!");
        }
    }

    public static Dog maxDog(Dog d1, Dog d2) {
        if (d1.weightInpounds > d2.weightInpounds)
            return d1;
        else
            return d2;
    }

    public Dog maxDog(Dog d2) {
        if (weightInpounds > d2.weightInpounds)
            return this;
        else
            return d2;
    }
}
