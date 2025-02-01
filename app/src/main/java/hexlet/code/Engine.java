package hexlet.code;

import java.util.Scanner;
import java.util.function.Supplier;

public class Engine {
    private static final int COUNT_OF_ROUNDS = 3;

    public static void gameEngine(String exercise, Supplier<String[]> questionAndAnswerSupplier) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(exercise);

        for (int i = 0; i < COUNT_OF_ROUNDS; i++) {
            String[] questionAndAnswer = questionAndAnswerSupplier.get();
            String question = questionAndAnswer[0];
            String correctAnswer = questionAndAnswer[1];
            System.out.println("Question: " + question);
            String answer = sc.next();
            System.out.println("Your answer: " + answer);
            if (!answer.equals(correctAnswer)) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
            System.out.println("Correct!");
        }
            System.out.println("Congratulations, " + name + "!");
    }
    public static void runGame(String exercise, Supplier<String[]> questionAndAnswerSupplier) {
        gameEngine(exercise, questionAndAnswerSupplier);
    }
}
