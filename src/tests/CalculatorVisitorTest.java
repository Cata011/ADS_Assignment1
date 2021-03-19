package tests;

import customExceptions.MalformedExpressionException;
import org.junit.jupiter.api.Assertions;
import token.Operand;
import customExceptions.*;
import token.Operation;
import token.Operator;
import token.Token;
import visitor.CalculatorVisitor;

import java.util.ArrayList;

class CalculatorVisitorTest {

    private CalculatorVisitor calculatorVisitor;
    private ArrayList<Token> tokenList;
    private ArrayList<Token> tokenList1;
    private ArrayList<Token> tokenList2;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
         calculatorVisitor = new CalculatorVisitor();

        tokenList = new ArrayList<>();
        tokenList.add(new Operand(2));
        tokenList.add(new Operand(2));
        tokenList.add(new Operator(Operation.MULTIPLICATION));
        tokenList.add(new Operand(4));
        tokenList.add(new Operator(Operation.ADDITION));
        tokenList.add(new Operand(2));
        tokenList.add(new Operator(Operation.DIVISION));

        tokenList1 = new ArrayList<>();
        tokenList1.add(new Operand(2));
        tokenList1.add(new Operand(2));
        tokenList1.add(new Operator(Operation.MULTIPLICATION));
        tokenList1.add(new Operand(4));
        tokenList1.add(new Operator(Operation.ADDITION));
        tokenList1.add(new Operand(0));
        tokenList1.add(new Operator(Operation.DIVISION));

        tokenList2 = new ArrayList<>();
        tokenList2.add(new Operand(2));
        tokenList2.add(new Operand(2));
        tokenList2.add(new Operator(Operation.MULTIPLICATION));
        tokenList2.add(new Operand(4));
        tokenList2.add(new Operator(Operation.ADDITION));
        tokenList2.add(new Operand(2));
        tokenList2.add(new Operator(Operation.DIVISION));
        tokenList2.add(new Operator(Operation.DIVISION));

    }

    @org.junit.jupiter.api.Test
    void getResultTrue() throws MalformedExpressionException {
        int result;
        for (Token t : tokenList) {
            t.accept(calculatorVisitor);
        }
        Assertions.assertEquals(4, calculatorVisitor.getResult());
    }
    @org.junit.jupiter.api.Test
    void getResultInvalidDivision() throws MalformedExpressionException {
        int result;
        for (Token t : tokenList1) {
            t.accept(calculatorVisitor);
        }
        Assertions.assertThrows(MalformedExpressionException.class, () -> {
            calculatorVisitor.getResult();
        });
    }
    @org.junit.jupiter.api.Test
    void getResultDuplicateExpression() throws MalformedExpressionException {
        int result;
        for (Token t : tokenList2) {
            t.accept(calculatorVisitor);
        }
        Assertions.assertThrows(MalformedExpressionException.class, () -> {
            calculatorVisitor.getResult();
        });
    }
}