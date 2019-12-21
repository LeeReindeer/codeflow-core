package moe.leer.codeflowcore;

import moe.leer.codeflowcore.exception.SyntaxErrorException;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * @author leer
 * Created at 12/21/19 4:17 PM
 */
public class APITest extends BaseFlowchartTest {
  @Test(expectedExceptions = SyntaxErrorException.class)
  public void failFastTest() throws IOException {
    codeFlow.setFailFast(true).parse("boolean  a = false; \n" +
        "if (a) {").toFile("failFast");
    codeFlow.setFailFast(false);
  }
}
