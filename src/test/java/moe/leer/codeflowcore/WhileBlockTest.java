package moe.leer.codeflowcore;

import org.testng.annotations.Test;

import java.io.IOException;

/**
 * @author leer
 * Created at 12/18/19 1:53 PM
 */
public class WhileBlockTest extends BaseFlowchartTest {
  @Test
  public void testWhile() throws IOException {
    codeFlow.parseFile("while.cf").toFile("while");
  }

  @Test
  public void testDoWhile() throws IOException {
    codeFlow.parseFile("dowhile.cf").toFile("dowhile");
  }
}
