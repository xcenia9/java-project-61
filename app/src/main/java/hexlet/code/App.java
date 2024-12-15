package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Exit");
            String choice = scanner.next();
            System.out.println("Your choice: " + choice);

            switch (choice) {
                case "1":
                    System.out.println("Welcome to the Brain Games!");
                    Cli cli = new Cli(scanner);
                    cli.welcome();
                    break;
                case "2":
                    Even.gameEven(scanner);
                    break;
                default:
                    break;
            }

        scanner.close();
    }
}
