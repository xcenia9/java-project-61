package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("3 - Calc");
            System.out.println("4 - GCD");
            System.out.println("5 - Progression");
            System.out.println("0 - Exit");
            String choice = scanner.next();
            System.out.println("Your choice: " + choice);

            switch (choice) {
                case "1":
                    System.out.println("Welcome to the Brain Games!");
                    Cli.welcome();
                    break;
                case "2":
                    Even.gameEven();
                    break;
                case "3":
                    Calc.gameCalc();
                    break;
                case "4":
                    Gcd.gameGcd();
                    break;
                case "5":
                    Progression.gameProgression();
                    break;
                case "0":
                    break;
                default:
                    break;
            }

        scanner.close();
    }
}
