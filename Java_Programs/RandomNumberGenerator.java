import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();

        int randomInteger=random.nextInt(5000);
        System.out.println(randomInteger);

        double randomDouble = random.nextDouble();
        System.out.println(randomDouble);
    }
}
