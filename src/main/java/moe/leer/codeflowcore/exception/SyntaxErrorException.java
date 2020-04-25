package moe.leer.codeflowcore.exception;

import org.antlr.v4.runtime.misc.ParseCancellationException;

/**
 * Throw exception when lexer and parser occur an error
 * <p>
 * Wrapper of <code>ParseCancellationException</code>
 *
 * @author leer
 * Created at 12/21/19 4:02 PM
 */
public class SyntaxErrorException extends ParseCancellationException {

  public SyntaxErrorException(String message, Throwable cause) {
    super(message, cause);
  }

  public SyntaxErrorException(Throwable cause) {
    super(cause);
  }

  public SyntaxErrorException(String s) {
    super(s);
  }
}
