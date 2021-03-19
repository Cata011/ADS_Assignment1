package tests;

import client.Client;
import customExceptions.MalformedExpressionException;
import org.junit.jupiter.api.Assertions;
import token.Operand;
import token.Operation;
import token.Operator;
import token.Token;
import visitor.CalculatorVisitor;

import java.util.ArrayList;

class ClientTest {

    Client client;
    CalculatorVisitor calculatorVisitor;
    private ArrayList<Token> tokenList;
    private ArrayList<Token> tokenList1;
    private ArrayList<Token> tokenList2;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        calculatorVisitor = new CalculatorVisitor();
        client = new Client(calculatorVisitor);

        tokenList = new ArrayList<>();
        tokenList.add(new Operand(2));
        tokenList.add(new Operand(2));
        tokenList.add(new Operator(Operation.MULTIPLICATION));
        tokenList.add(new Operand(4));
        tokenList.add(new Operator(Operation.ADDITION));
        tokenList.add(new Operand(2));
        tokenList.add(new Operator(Operation.DIVISION));

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
    void evaluateExpression() throws MalformedExpressionException {
        Assertions.assertEquals(4, client.evaluateExpression(tokenList));
    }
    @org.junit.jupiter.api.Test
    void evaluateExpressionDivisionWithZero() throws MalformedExpressionException {
        Assertions.assertThrows(MalformedExpressionException.class, () -> {
            client.evaluateExpression(tokenList1);
        });
    }
    @org.junit.jupiter.api.Test
    void evaluateInvalidExpression() throws MalformedExpressionException {
        Assertions.assertThrows(MalformedExpressionException.class, () -> {
            client.evaluateExpression(tokenList2);
        });
    }
}