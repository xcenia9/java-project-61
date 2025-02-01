package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    private static final int FIRST_ODD_NUMBER = 3;

    private static String[] getQuestionAndAnswer() {
        int number = Utils.getRandomNumber();
        String question = Integer.toString(number); // Формируем вопрос
        String correctAnswer = isPrime(number) ? "yes" : "no"; // Определяем правильный ответ
        return new String[]{question, correctAnswer};
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
        Engine.runGame(exercise, Prime::getQuestionAndAnswer);
    }

}
