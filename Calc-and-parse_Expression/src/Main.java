import ExpressionCalculator.ExpressionCalculator;
import ExpressionCalculator.InvalidExpressionException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter expression: ");
        String expression = scanner.nextLine();

        try {
            double result = ExpressionCalculator.calculateExpression(expression);
            System.out.println("Result: " + result);
        } catch (InvalidExpressionException | ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
