package hexlet.code;
import java.util.Scanner;

public class Cli {
    private final String name;

    public Cli(Scanner scanner) {
        System.out.println("May I have your name?");
        this.name = scanner.next();
    }
    public String getName() {
        return name;
    }
    public void welcome() {
        System.out.println("Hello, " + name + "!");
    }
}
