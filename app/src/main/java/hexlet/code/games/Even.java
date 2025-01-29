package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Even {
    public static boolean parityCheck(int randomNumber) {
        return randomNumber % 2 == 0;
    }

    private static String[] getQuestionAndAnswer() {
        int randomNumber = Utils.getRandomNumber();
        String question = randomNumber + "";
        String correctAnswer = parityCheck(randomNumber) ? "yes" : "no";
        return new String[]{question, correctAnswer};
    }

    public static void playEven() {
        String exercise = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.runGame(exercise, Even::getQuestionAndAnswer);
    }
}


