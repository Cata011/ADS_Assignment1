package token;

import visitor.CalculatorVisitor;

public abstract class Token {
    private CalculatorVisitor visitor;

    public abstract void accept (CalculatorVisitor visitor);
}
