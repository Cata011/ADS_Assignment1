import java.util.ArrayList;

public class Client {

  private CalculatorVisitor calculatorVisitor;

  public int evaluateExpression(ArrayList<Token> tokenList) throws Exception
  {
   return calculatorVisitor.getResult();
  };
}