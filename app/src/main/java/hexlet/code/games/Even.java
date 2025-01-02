package hexlet.code.games;

import java.util.Scanner;

public class Even {
    public static void gameEven() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int count = 0;
        for (int i = 1; i <= 3; i++) {
            int randomNumber = (int) (Math.random() * 100);
            System.out.println("Question: " + randomNumber);
            String answer = sc.next();
            if (randomNumber % 2 == 0) {
                if (answer.equals("yes")) {
                    System.out.println("Correct!");
                    count++;
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'yes'.");
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
            } else {
                if (answer.equals("no")) {
                    System.out.println("Correct!");
                    count++;
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
