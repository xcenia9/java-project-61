package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    private static int checkingGcd(int a, int b) {
        while (b != 0) {
            int check = b;
            b = a % b;
            a = check;
        }
        return a;
    }

    private static String[][] getQuestionAndAnswer() {
        String[][] pair = new String[Engine.COUNT_OF_ROUNDS][2];
        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            int a = Utils.getRandomNumber();
            int b = Utils.getRandomNumber();
            String question = (a + " " + b);
            String correctAnswer = Integer.toString(checkingGcd(a, b));
            pair[i][0] = question;
            pair[i][1] = correctAnswer;
        }
        return pair;
    }

    public static void playGcd() {
        String exercise = "Find the greatest common divisor of given numbers.";
        String[][] questionAndAnswerPairs = getQuestionAndAnswer();
        Engine.runGame(exercise, questionAndAnswerPairs);
    }
}
