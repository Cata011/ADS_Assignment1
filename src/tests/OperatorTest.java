package tests;

import org.junit.jupiter.api.Assertions;
import token.Operation;
import token.Operator;

class OperatorTest {

    private Operator operator;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        operator = new Operator(Operation.ADDITION);
    }

    @org.junit.jupiter.api.Test
    void getOperation() {
        Assertions.assertEquals(Operation.ADDITION, operator.getOperation());
    }

}