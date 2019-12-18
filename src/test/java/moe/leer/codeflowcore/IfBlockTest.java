package moe.leer.codeflowcore;

import guru.nidi.graphviz.engine.Format;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * @author leer
 * Created at 12/18/19 11:53 AM
 */
public class IfBlockTest extends BaseFlowchartTest {

  @Test
  public void testSimpleIf() throws IOException {
    codeFlow.parseFile("ifCode.cf").toFile("simpleIf.png");
  }

  @Test
  public void testNestedIf() throws IOException {
    codeFlow.parseFile("nestedIf.cf").toFile("nestedIf");
  }

  @Test
  public void testIfAndElse() throws IOException {
    codeFlow.parseFile("ifAndElse.cf").toFile("ifAndElse");
  }

  @Test
  public void testIfElseIf() throws IOException {
    codeFlow.parseFile("ifElseIf.cf").toFile("ifIfElse");
  }

  @Test
  public void testIfElseIfElse() throws IOException {
    codeFlow.parseFile("ifElseIfElse.cf").toFile("ifIfElseElse");
  }

  @Test
  public void testIfExample() throws IOException {
    codeFlow.parseFile("ifExample1.cf").toFile("IfExample1");
  }
}
