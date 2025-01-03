package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static String[] getQuestionAndAnswer() {
        String[] operators = {"+", "-", "*"};
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        int randomOperator = (int) (Math.random() * operators.length);
        String operator = operators[randomOperator];
        String question = (a + " " + operator + " " + b);
        int result = switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default -> 0;
        };
        String correctAnswer = "" + result;
        return new String[]{question, correctAnswer};
    }
    public static void gameCalc() {
        String exercise = "What is the result of the expression?";
        String[][] questionAndAnswer = new String[Engine.countOfRounds][2];
        for (int i = 0; i < Engine.countOfRounds; i++) {
            questionAndAnswer[i] = getQuestionAndAnswer();
        }
        Engine.gameEngine(exercise, questionAndAnswer);
    }
}
