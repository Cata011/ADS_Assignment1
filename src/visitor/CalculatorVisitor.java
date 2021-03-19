package visitor;

import customExceptions.MalformedExpressionException;
import stack.LinkedStack;
import token.Operand;
import token.Operation;
import token.Operator;
import token.Token;

public class CalculatorVisitor implements Calculator, Visitor
{

  private LinkedStack<Token> tokenStack;

  public CalculatorVisitor() {
    this.tokenStack = new LinkedStack<>();
  }

  @Override public int getResult() throws MalformedExpressionException
  {
    try{
      return ((Operand)tokenStack.pop()).getValue();
    }
    catch (Exception e){
      throw new MalformedExpressionException("The stack is empty.");
    }
  }

  @Override public void visit(Operand operand)
  {
    pushOperand(operand);
  }

  @Override public void visit(Operator operator)
  {
    try {
      performOperation(operator);
    }
    catch (Exception e) {
      System.out.println("Exception for operator" + operator);
    }
  }

  private void pushOperand(Operand operand){
    tokenStack.push(operand);
  }
  private void performOperation(Operator operator) throws Exception{
    try {
      int rightOperand = ((Operand) tokenStack.pop()).getValue();
      int leftOperand = ((Operand) tokenStack.pop()).getValue();
      Operand operand;

      switch (operator.getOperation()) {
        case ADDITION:
          operand = new Operand(leftOperand + rightOperand);
          break;
        case SUBTRACTION:
          operand = new Operand(leftOperand - rightOperand);
          break;
        case MULTIPLICATION:
          operand = new Operand(leftOperand * rightOperand);
          break;
        case DIVISION:
          if (rightOperand == 0)
            throw new MalformedExpressionException("Cannot divide by 0");
          operand = new Operand(leftOperand / rightOperand);
          break;
        default:
          throw new MalformedExpressionException("Invalid operation");
      }
      pushOperand(operand);
    }
    catch (Exception e)
    {
      throw new MalformedExpressionException(e.getMessage());
    }
  }
}
