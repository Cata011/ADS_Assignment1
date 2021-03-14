public class Operator extends Token {

    private Operation operation;

    @Override
    public void accept(CalculatorVisitor visitor) {
        visitor.visit(this);
    }

    public Operation getOperation()
    {
        return operation;
    }
}
