import java.util.Random;

public class RandomTest {
    public static final Random random = new Random();

    public static int getIntervalRandom(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }

    public static int getRandom(int min, int max) {
        return random.nextInt(max - min) + min;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(getRandom(1, 10));
        }
    }
}
