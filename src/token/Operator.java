package token;

import token.Operation;
import visitor.CalculatorVisitor;

public class Operator extends Token {

    private Operation operation;

    public Operator(Operation operation) {
        this.operation = operation;
    }

    @Override
    public void accept(CalculatorVisitor visitor) {
        visitor.visit(this);
    }

    public Operation getOperation()
    {
        return operation;
    }
}
