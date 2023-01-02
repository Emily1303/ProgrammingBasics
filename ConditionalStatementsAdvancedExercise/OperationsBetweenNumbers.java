package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        double result = 0;
        boolean isZero = false;
        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                if (number2 == 0) {
                    isZero = true;
                } else {
                    result = number1 * 1.0 / number2;
                }
                break;
            case "%":
                if (number2 == 0) {
                    isZero = true;
                } else {
                    result = number1 % number2;
                }
                break;
        }

        String evenOrOdd = "";
        if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            if (result % 2 == 0) {
                evenOrOdd = "even";
            } else {
                evenOrOdd = "odd";
            }
        }

        if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            System.out.printf("%d %s %d = %.0f - %s", number1, operator, number2, result, evenOrOdd);
        } else if (operator.equals("/") && !isZero) {
            System.out.printf("%d %s %d = %.2f", number1, operator, number2, result);
        } else if (operator.equals("%") && !isZero) {
            System.out.printf("%d %s %d = %.0f", number1, operator, number2, result);
        } else {
            System.out.printf("Cannot divide %d by zero", number1);
        }
    }
}

