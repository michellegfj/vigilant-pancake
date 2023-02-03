import java.util.Comparator;

public class DogLauncher {

    public static void main(String[] args) {
        Dog d1 = new Dog("Elyse", 3);
        Dog d2 = new Dog("Sture", 0);
        Dog d3 = new Dog("Artemesios", 15);
        Dog[] dogs = { d1, d2, d3 };
        // Dog[] dogs = { new Dog("Elyse", 3), new Dog("Sture", 0), new
        // Dog("Artemesios", 15) };
        
        Dog maxDog = (Dog) Maximizer.max(dogs);
        maxDog.bark();

        Comparator<Dog> nc = Dog.getNameComparator();
        if (nc.compare(d1, d3) > 0) { // If d1 comes later than d3 in alphabetic order
            d1.bark();
        } else {
            d3.bark();
        }
    }
}
