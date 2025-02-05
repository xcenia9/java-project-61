package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static String[][] getQuestionAndAnswer() {
        String[][] pair = new String[Engine.COUNT_OF_ROUNDS][2];
        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            char[] operators = {'+', '-', '*'};
            int a = Utils.getRandomNumber();
            int b = Utils.getRandomNumber();
            int randomOperator = Utils.getRandomNumber(0, operators.length - 1);
            char operator = operators[randomOperator];
            String question = (a + " " + operator + " " + b);
            int result = calculate(a, b, operator);
            String correctAnswer = Integer.toString(result);
            pair[i][0] = question;
            pair[i][1] = correctAnswer;
        }
        return pair;
    }

    public static int calculate(int a, int b, char operator) {
        return  switch (operator) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            default -> 0;
        };
    }

    public static void playCalc() {
        String exercise = "What is the result of the expression?";
        String[][] questionAndAnswerPairs = getQuestionAndAnswer();
        Engine.runGame(exercise, questionAndAnswerPairs);
    }
}
