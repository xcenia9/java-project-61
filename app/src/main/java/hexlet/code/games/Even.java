package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Even {
    public static boolean parityCheck(int randomNumber) {
        return randomNumber % 2 == 0;
    }

    private static String[][] getQuestionAndAnswer() {
        String[][] pair = new String[Engine.COUNT_OF_ROUNDS][2];
        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            int randomNumber = Utils.getRandomNumber();
            String question = Integer.toString(randomNumber);
            String correctAnswer = parityCheck(randomNumber) ? "yes" : "no";
            pair[i][0] = question;
            pair[i][1] = correctAnswer;
        }
        return pair;
    }

    public static void playEven() {
        String exercise = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionAndAnswerPairs = getQuestionAndAnswer();
        Engine.runGame(exercise, questionAndAnswerPairs);
    }
}


