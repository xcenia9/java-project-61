package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {
    private static String[] getQuestionAndAnswer() {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
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
        String[][] questionAndAnswer = new String[Engine.countOfRounds][2];
        for (int i = 0; i < Engine.countOfRounds; i++) {
            questionAndAnswer[i] = getQuestionAndAnswer();
        }
        Engine.gameEngine(exercise, questionAndAnswer);
    }
}
