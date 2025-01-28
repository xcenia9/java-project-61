package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    private static final int FIRST_ODD_NUMBER = 3;

    private static String[] getQuestionAndAnswer() {
        int number = Utils.getRandomNumber();
        String question = number + "";
        String correctAnswer = getTheCorrectAnswer(number);
        return new String[]{question, correctAnswer};
    }

    private static String getTheCorrectAnswer(int number) {
        if (number <= 1) {
            return "no";
        }
        if (number == 2) {
            return "yes";
        }
        if (number % 2 == 0) {
            return "no";
        }
        return isPrime(number) ? "yes" : "no";
    }

    private static boolean isPrime(int number) {
        for (int i = FIRST_ODD_NUMBER; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void gamePrime() {
        String exercise = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionAndAnswer = new String[Engine.getCountOfRounds()][2];
        for (int i = 0; i < Engine.getCountOfRounds(); i++) {
            questionAndAnswer[i] = getQuestionAndAnswer();
        }
        Engine.gameEngine(exercise, questionAndAnswer);
    }
}
