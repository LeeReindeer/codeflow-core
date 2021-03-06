package moe.leer.codeflowcore.exception;

/**
 * Throw semantic error when visit AST
 *
 * @author leer
 * Created at 2/1/20 4:00 PM
 */
public class SemanticErrorException extends RuntimeException {

  public SemanticErrorException(String message) {
    super(message);
  }
}
