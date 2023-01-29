public class DogLauncher {
    public static void main(String[] args) {
        Dog d = new Dog(15);
        // d.weightInpounds=51;
        // d.makeNoise();

        Dog d2 = new Dog(100);
        // Dog bigger = Dog.maxDog(d, d2);
        Dog bigger = d.maxDog(d2);
        bigger.makeNoise();

        System.out.println(Dog.binomen);
        System.out.println(d.binomen);

    }
}
