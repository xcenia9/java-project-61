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

    public static void gameEven() {
        String exercise = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionAndAnswer = new String[Engine.getCountOfRounds()][2];
        for (int i = 0; i < Engine.getCountOfRounds(); i++) {
            questionAndAnswer[i] = getQuestionAndAnswer();
        }
        Engine.gameEngine(exercise, questionAndAnswer);
    }
}


