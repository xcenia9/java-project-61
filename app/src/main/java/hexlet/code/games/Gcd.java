package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    private static String[] getQuestionAndAnswer() {
        int a = Utils.getRandomNumber();
        int b = Utils.getRandomNumber();
        String question = (a + " " + b);
        while (b != 0) {
            int check = b;
            b = a % b;
            a = check;
        }
        String correctAnswer = Integer.toString(a);
        return new String[]{question, correctAnswer};
    }

    public static void playGcd() {
        String exercise = "Find the greatest common divisor of given numbers.";
        Engine.runGame(exercise, Gcd::getQuestionAndAnswer);
    }
}
