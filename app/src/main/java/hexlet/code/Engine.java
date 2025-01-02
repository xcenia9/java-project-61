package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static int countOfRounds = 3;

    public static void gameEngine(String exercise, String[][] questionAndAnswer) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(exercise);

        int count = 0;
        for (int i = 0; i < countOfRounds; i++) {
            String question = questionAndAnswer[i][0];
            String correctAnswer = questionAndAnswer[i][1];
            System.out.println("Question: " + question);
            String answer = sc.next();
            System.out.println("Your answer: " + answer);
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        if (count == countOfRounds) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}