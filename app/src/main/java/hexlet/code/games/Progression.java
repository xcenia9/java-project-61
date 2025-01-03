package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Random;

public class Progression {
    private static String[] getQuestionAndAnswer() {
        Random random = new Random();
        int randomLength;
        randomLength = random.nextInt(6) + 5;
        int[] numbers = new int[randomLength];
        int diff = (int) (Math.random() * 10) + 1;
        numbers[0] = (int) (Math.random() * 100);
        for (int i = 1; i < randomLength; i++) {
            numbers[i] = numbers[i - 1] + diff;
        }
        int randomIndex = random.nextInt(randomLength);
        int randomNumber = numbers[randomIndex];
        String correctAnswer = randomNumber + "";

        int[] arrayPartOne = Arrays.copyOfRange(numbers, 0, randomIndex);
        int[] arrayPartTwo = Arrays.copyOfRange(numbers, randomIndex + 1, randomLength);
        String arrayToString = Arrays.toString(arrayPartOne) + " .. " + Arrays.toString(arrayPartTwo);
        String question = arrayToString.replace("[", "").replace("]", "").replace(",", "");
        return new String[] {question, correctAnswer};
    }

    public static void gameProgression() {
        String exercise = "What number is missing in the progression?";
        String[][] questionAndAnswer = new String[Engine.countOfRounds][2];
        for (int i = 0; i < Engine.countOfRounds; i++) {
            questionAndAnswer[i] = getQuestionAndAnswer();
        }
        Engine.gameEngine(exercise, questionAndAnswer);
    }
}
