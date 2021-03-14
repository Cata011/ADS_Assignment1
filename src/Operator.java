public class Operator extends Token {

    private Operation operation;

    @Override
    public void accept(CalculatorVisitor visitor) {
        visitor.performOperation();
    }

    public Operation getOperation()
    {
        return operation;
    }
}
