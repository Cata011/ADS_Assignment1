import CustomExceptions.MalformedExpressionException;

import java.util.ArrayList;

public class Client {

    private CalculatorVisitor calculatorVisitor;

    public Client(CalculatorVisitor calculatorVisitor) {
        this.calculatorVisitor = calculatorVisitor;
    }

    public int evaluateExpression(ArrayList<Token> tokenList) throws MalformedExpressionException {
        for (Token t : tokenList) {
            t.accept(calculatorVisitor);
        }
        return calculatorVisitor.getResult();
    }
}