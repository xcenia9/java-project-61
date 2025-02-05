package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    private static final int FIRST_ODD_NUMBER = 3;

    private static String[][] getQuestionAndAnswer() {
        String[][] pair = new String[Engine.COUNT_OF_ROUNDS][2];
        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            int number = Utils.getRandomNumber();
            String question = Integer.toString(number);
            String correctAnswer = isPrime(number) ? "yes" : "no";
            pair[i][0] = question;
            pair[i][1] = correctAnswer;
        }
        return pair;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = FIRST_ODD_NUMBER; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void playPrime() {
        String exercise = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionAndAnswerPairs = getQuestionAndAnswer();
        Engine.runGame(exercise, questionAndAnswerPairs);
    }

}
