package moe.leer.codeflowcore.lang;

import org.antlr.v4.runtime.misc.ParseCancellationException;

/**
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
