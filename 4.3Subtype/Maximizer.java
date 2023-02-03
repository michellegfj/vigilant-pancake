public class Maximizer {
    public static OurComparable max(OurComparable[] items) {
        int maxDex = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].compare_to(items[maxDex]) > 0) {
                maxDex = i;
            }
        }
        return items[maxDex];
    }

    public static void main(String[] args) {
        Dog[] dogs = { new Dog("Elyse", 3), new Dog("Sture", 0), new Dog("Artemesios", 15) };
        Dog maxDog = (Dog) max(dogs);
        maxDog.bark();
    }

}
