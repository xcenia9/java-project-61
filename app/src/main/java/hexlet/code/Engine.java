package hexlet.code;

import java.util.Scanner;
import java.util.function.Supplier;

public class Engine {
    private static final int COUNT_OF_ROUNDS = 3;

    public static void gameEngine(String exercise, String[][] questionAndAnswer) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(exercise);

        int count = 0;
        for (int i = 0; i < COUNT_OF_ROUNDS; i++) {
            String question = questionAndAnswer[i][0];
            String correctAnswer = questionAndAnswer[i][1];
            System.out.println("Question: " + question);
            String answer = sc.next();
            System.out.println("Your answer: " + answer);
            if (!answer.equals(correctAnswer)) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
            System.out.println("Correct!");
            count++;
        }
        if (count == COUNT_OF_ROUNDS) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
    public static void runGame(String exercise, Supplier<String[]> questionAndAnswerSupplier) {
        String[][] questionAndAnswer = new String[COUNT_OF_ROUNDS][2];
        for (int i = 0; i < COUNT_OF_ROUNDS; i++) {
            questionAndAnswer[i] = questionAndAnswerSupplier.get();
        }
        gameEngine(exercise, questionAndAnswer);
    }
}
