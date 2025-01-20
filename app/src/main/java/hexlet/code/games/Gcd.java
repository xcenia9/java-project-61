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
        String correctAnswer = a + "";
        return new String[]{question, correctAnswer};
    }

    public static void gameGcd() {
        String exercise = "Find the greatest common divisor of given numbers.";
        String[][] questionAndAnswer = new String[Engine.getCountOfRounds()][2];
        for (int i = 0; i < Engine.getCountOfRounds(); i++) {
            questionAndAnswer[i] = getQuestionAndAnswer();
        }
        Engine.gameEngine(exercise, questionAndAnswer);
    }
}
