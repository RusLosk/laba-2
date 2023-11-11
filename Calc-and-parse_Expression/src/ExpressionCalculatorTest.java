import ExpressionCalculator.ExpressionCalculator;
import ExpressionCalculator.InvalidExpressionException;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExpressionCalculatorTest {

    @Test
    public void testCalculateExpression_Addition() throws InvalidExpressionException {
        String expression = "2+3";
        double result = ExpressionCalculator.calculateExpression(expression);
        assertEquals(5.0, result);
    }

    @Test
    public void testCalculateExpression_Subtraction() throws InvalidExpressionException {
        String expression = "5-2";
        double result = ExpressionCalculator.calculateExpression(expression);
        assertEquals(3.0, result);
    }

    @Test
    public void testCalculateExpression_Multiplication() throws InvalidExpressionException {
        String expression = "3*4";
        double result = ExpressionCalculator.calculateExpression(expression);
        assertEquals(12.0, result);
    }

    @Test
    public void testCalculateExpression_Division() throws InvalidExpressionException {
        String expression = "10/5";
        double result = ExpressionCalculator.calculateExpression(expression);
        assertEquals(2.0, result);
        assertE
    }

    @Test
    public void testCalculateExpression_ComplexExpression() throws InvalidExpressionException {
        String expression = "2+3*(4-1)";
        double result = ExpressionCalculator.calculateExpression(expression);
        assertEquals(11.0, result);
    }

    @Test
    public void testCalculateExpression_DivisionByZero() {
        String expression = "10/0";
        assertThrows(ArithmeticException.class, () -> {
            ExpressionCalculator.calculateExpression(expression);
        });
    }
}
