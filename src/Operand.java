public class Operand extends Token {

    private int value;
    private CalculatorVisitor visitor;

    @Override
    public void accept() {
    }

    public int getValue()
    {
        return value;
    }
}
