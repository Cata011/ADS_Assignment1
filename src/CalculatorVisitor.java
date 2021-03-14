public class CalculatorVisitor implements Calculator, Visitor {

    private LinkedStack<Token> tokenStack;

    @Override
    public int getResult() throws Exception {
        throw new Exception("MalformedExpressionException");
    }

    ;

    @Override
    public void visit(Operand operand) {
        tokenStack.push(operand);
    }

    @Override
    public void visit(Operator operator) {
        try {



            tokenStack.push(new Operand(performOperation(leftElm, rightElm, operator.getOperation())));
        } catch (Exception e) {
            if (tokenStack.isEmpty()) System.out.println("Exception regarding: " + operator);
        }
    }

    private void pushOperand(Operand operand) {

    }

    private void performOperation(Operator operator) throws Exception {

      int leftElm = 0;
      int rightElm = 0;

      if (!tokenStack.isEmpty()) {
        rightElm = ((Operand) tokenStack.pop()).getValue();

      }
      if (!tokenStack.isEmpty()) {
        leftElm = ((Operand) tokenStack.pop()).getValue();
      }


      //TODO: WTF
      switch (operator) {
        case :
          return leftOperand + rightOperand;
        case SUBTRACT:
          return leftOperand - rightOperand;
        case MULTIPLY:
          return leftOperand * rightOperand;
        case DIVIDE:
          if(rightOperand == 0)
            throw new Exception("Cannot divide by 0");
          return leftOperand / rightOperand;
        default:
          return 0;
      }

        throw new Exception("MalformedExpressionException");
    }
}
