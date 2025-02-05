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

    private static String[][] getQuestionAndAnswer() {
        String[][] pair = new String[Engine.COUNT_OF_ROUNDS][2];

        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            int randomLength = Utils.getRandomNumber(MIN_LENGTH, MAX_LENGTH);
            int step = Utils.getRandomNumber();
            int startNumber = Utils.getRandomNumber();

            int[] numbers = generateProgression(randomLength, startNumber, step);

            int randomIndex = Utils.getRandomNumber(0, randomLength - 1);
            String correctAnswer = String.valueOf(numbers[randomIndex]);

            StringBuilder questionBuilder = new StringBuilder();
            for (int j = 0; j < numbers.length; j++) {
                if (j == randomIndex) {
                    questionBuilder.append(".. ");
                } else {
                    questionBuilder.append(numbers[j]).append(" ");
                }
            }
            String question = questionBuilder.toString();
            pair[i][0] = question;
            pair[i][1] = correctAnswer;
        }
        return pair;
    }

    public static void playProgression() {
        String exercise = "What number is missing in the progression?";
        String[][] questionAndAnswerPairs = getQuestionAndAnswer();
        Engine.runGame(exercise, questionAndAnswerPairs);
    }
}
