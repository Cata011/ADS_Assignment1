public class Operator extends Token {

    private Operation operation;
    private CalculatorVisitor visitor;

    @Override
    public void accept() {

    }

    public Operation getOperation()
    {
        return operation;
    }
}
