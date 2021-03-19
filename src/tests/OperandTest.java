package tests;

import org.junit.jupiter.api.Assertions;
import token.Operand;

class OperandTest {

    private Operand operand;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        operand = new Operand(10);
    }

    @org.junit.jupiter.api.Test
    void getValue() {
        Assertions.assertEquals(operand.getValue(), 10);
    }
}