package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static String[] getQuestionAndAnswer() {
        char[] operators = {'+', '-', '*'};
        int a = Utils.getRandomNumber();
        int b = Utils.getRandomNumber();
        int randomOperator = Utils.getRandomNumber(0, operators.length - 1);
        char operator = operators[randomOperator];
        String question = (a + " " + operator + " " + b);
        int result = calculate(a, b, operator);

        String correctAnswer = "" + result;
        return new String[]{question, correctAnswer};
    }

    public static int calculate(int a, int b, char operator) {
        return  switch (operator) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            default -> 0;
        };
    }

    public static void gameCalc() {
        String exercise = "What is the result of the expression?";
        String[][] questionAndAnswer = new String[Engine.getCountOfRounds()][2];
        for (int i = 0; i < Engine.getCountOfRounds(); i++) {
            questionAndAnswer[i] = getQuestionAndAnswer();
        }
        Engine.gameEngine(exercise, questionAndAnswer);
    }
}
