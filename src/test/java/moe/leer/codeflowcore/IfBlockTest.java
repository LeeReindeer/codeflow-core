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
    codeFlow.parse(Example::testIfCode).toFile("simpleIf.png");
  }

  @Test
  public void testNestedIf() throws IOException {
    codeFlow.parse(Example::testNestedIfCode).toFile("nestedIf");
  }

  @Test
  public void testIfAndElse() throws IOException {
    codeFlow.parse(Example::testIfAndElseCode).toFile("ifAndElse");
  }

  @Test
  public void testIfIfElse() throws IOException {
    codeFlow.parse(Example::testIfElseCode).toFile("ifIfElse");
  }

  @Test
  public void testIfIfElseElse() throws IOException {
    codeFlow.parse(Example::testIfElseElseCode).toFile("ifIfElseElse");
  }

  @Test
  public void testIfExample() throws IOException {
    codeFlow.parse(Example::testIfExample1).toFile("IfExample1");
  }
}
