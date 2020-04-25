package moe.leer.codeflowcore.exception;

/**
 * Wrap SyntaxErrorException and SemanticErrorException to checked exception
 *
 * @author leer
 * Created at 4/25/20 2:25 PM
 */
public class CodeFlowException extends Exception {
  public CodeFlowException(String message) {
    super(message);
  }

  public CodeFlowException(String message, Throwable cause) {
    super(message, cause);
  }

  public CodeFlowException(Throwable cause) {
    super(cause);
  }
}
