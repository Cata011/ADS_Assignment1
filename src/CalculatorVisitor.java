public class CalculatorVisitor implements Calculator, Visitor
{

  private LinkedStack tokenStack;

  @Override public int getResult() throws Exception
  {
    throw new Exception("MalformedExpressionException");
  };

  @Override public void visit(Operand operand)
  {

  }

  @Override public void visit(Operator operator)
  {

  }

  private void pushOperand(Operand operand){

  }
  private void performOperation(Operator operator) throws Exception{
    
    throw new Exception("MalformedExpressionException");
  }
}
