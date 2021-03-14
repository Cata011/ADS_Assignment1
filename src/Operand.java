public class Operand extends Token {

    private int value;

    @Override
    public void accept(CalculatorVisitor visitor) {
        visitor.pushOperand();
    }

    public int getValue()
    {
        return value;
    }
}
