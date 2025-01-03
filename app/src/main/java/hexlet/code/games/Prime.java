package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static String[] getQuestionAndAnswer() {
        int number = (int) (Math.random() * 100);
        String question = number + "";
        String correctAnswer;

        if (number <= 1) {
            correctAnswer = "no";
        } else if (number == 2) {
            correctAnswer = "yes";
        } else if (number % 2 == 0) {
            correctAnswer = "no";
        } else {
            correctAnswer = "yes";

            for (int i = 3; i <= Math.sqrt(number); i += 2) {
                if (number % i == 0) {
                    correctAnswer = "no";

                    break;
                }
            }
        }
        return new String[]{question, correctAnswer};
    }

    public static void gamePrime() {
        String exercise = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionAndAnswer = new String[Engine.countOfRounds][2];
        for (int i = 0; i < Engine.countOfRounds; i++) {
            questionAndAnswer[i] = getQuestionAndAnswer();
        }
        Engine.gameEngine(exercise, questionAndAnswer);
    }
}
