/** Cat and Noise
 * Standard Output:
 * Nyan!Cream
 * Nyan!Tubbs
 * nyan!Cream
 * nyan!Tubbs
 */

public class CatNoise {
    public String name;
    public static String noise;

    public CatNoise(String name, String noise) {
        this.name = name;
        this.noise=noise;
    }

    public void play() {
        System.out.println(noise + name);
    }

    public static void anger() {
        noise = noise.toUpperCase();
    }

    public static void calm() {
        noise = noise.toLowerCase();
    }

    public static void main(String[] args){
        CatNoise a=new CatNoise("Cream","Meow!");
        CatNoise b=new CatNoise("Tubbs","Nyan!");
        a.play();
        b.play();
        CatNoise.anger();
        a.calm();
        a.play();
        b.play();
    }
}
