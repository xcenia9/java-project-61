package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;

    private static String[] getQuestionAndAnswer() {
        int randomLength = Utils.getRandomNumber(MIN_LENGTH, MAX_LENGTH);
        int[] numbers = new int[randomLength];
        int diff = Utils.getRandomNumber();
        numbers[0] = Utils.getRandomNumber();
        for (int i = 1; i < randomLength; i++) {
            numbers[i] = numbers[i - 1] + diff;
        }
        int randomIndex = Utils.getRandomNumber(0, randomLength - 1);
        String correctAnswer = String.valueOf(numbers[randomIndex]);
        numbers[randomIndex] = -1;
        String question = String.join(" ", java.util.Arrays.stream(numbers)
                .mapToObj(num -> num == -1 ? ".." : String.valueOf(num))
                .toArray(String[]::new));

        return new String[] {question.trim(), correctAnswer};
    }

    public static void gameProgression() {
        String exercise = "What number is missing in the progression?";
        String[][] questionAndAnswer = new String[Engine.getCountOfRounds()][2];
        for (int i = 0; i < Engine.getCountOfRounds(); i++) {
            questionAndAnswer[i] = getQuestionAndAnswer();
        }
        Engine.gameEngine(exercise, questionAndAnswer);
    }
}
