package visitor;

import customExceptions.MalformedExpressionException;

public interface Calculator {
  int getResult() throws MalformedExpressionException;
}
