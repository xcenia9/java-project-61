package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;

    private static int[] generateProgression(int length, int start, int step) {
        int[] numbers = new int[length];
        numbers[0] = start;
        for (int i = 1; i < length; i++) {
            numbers[i] = numbers[i - 1] + step;
        }
        return numbers;
    }

    private static String[] getQuestionAndAnswer() {
        int randomLength = Utils.getRandomNumber(MIN_LENGTH, MAX_LENGTH);
        int step = Utils.getRandomNumber();
        int startNumber = Utils.getRandomNumber();

        int[] numbers = generateProgression(randomLength, startNumber, step);

        int randomIndex = Utils.getRandomNumber(0, randomLength - 1);
        String correctAnswer = String.valueOf(numbers[randomIndex]);
        numbers[randomIndex] = -1;
        String question = String.join(" ", java.util.Arrays.stream(numbers)
                .mapToObj(num -> num == -1 ? ".." : String.valueOf(num))
                .toArray(String[]::new));

        return new String[] {question.trim(), correctAnswer};
    }

    public static void playProgression() {
        String exercise = "What number is missing in the progression?";
        Engine.runGame(exercise, Progression::getQuestionAndAnswer);
    }
}
