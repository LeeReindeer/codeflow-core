package moe.leer.codeflowcore.lang;

import moe.leer.codeflowcore.exception.SyntaxErrorException;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

/**
 * Throw an runtime exception when occurred a syntax error while CodeFlow.failFast=true
 *
 * @author leer
 * Created at 12/21/19 4:04 PM
 */
public class ThrowSyntaxErrorListener extends BaseErrorListener {
  @Override
  public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
      throws SyntaxErrorException {
    throw new SyntaxErrorException("[From Parser] line " + line + ":" + charPositionInLine + ": " + msg, e);
  }
}
