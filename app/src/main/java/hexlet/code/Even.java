package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void gameEven(Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        Cli cli = new Cli(scanner);
        cli.welcome();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int count = 0;
        for (int i = 1; i <= 3; i++) {
            int randomNumber = (int) (Math.random() * 100);
            System.out.println("Question: " + randomNumber);
            String answer = scanner.next();
            if (randomNumber % 2 == 0) {
                if (answer.equals("yes")) {
                    System.out.println("Correct!");
                    count++;
                } else {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\nLet's try again, " + cli.getName() + "!");
                    break;
                }
            } else {
                if (answer.equals("no")) {
                    System.out.println("Correct!");
                    count++;
                } else {
                    System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\nLet's try again, " + cli.getName() + "!");
                    break;
                }
            }
        }
        if (count == 3) {
            System.out.println("Congratulations! " + cli.getName() + "!");
        }
    }
}
