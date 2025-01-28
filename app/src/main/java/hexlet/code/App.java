package hexlet.code;

import hexlet.code.games.Prime;
import hexlet.code.games.Gcd;
import hexlet.code.games.Even;
import hexlet.code.games.Progression;
import hexlet.code.games.Calc;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        displayMenu();
        String choice = scanner.next();
        System.out.println("Your choice: " + choice);
        playerChoice(choice);
        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
    }

    public static void playerChoice(String choice) {
        switch (choice) {
            case "1":
                Cli.greeting();
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
            case "6":
                Prime.gamePrime();
                break;
            case "0":
                break;
            default:
                System.out.println("There is no such menu item.");
                break;
        }
    }
}
