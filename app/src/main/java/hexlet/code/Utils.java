package hexlet.code;

import java.util.Random;

public class Utils {
    private static final int DEFAULT_MIN = 0;
    private static final int DEFAULT_MAX = 100;

    public static int getRandomNumber() {
        return getRandomNumber(DEFAULT_MIN, DEFAULT_MAX);
    }

    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
