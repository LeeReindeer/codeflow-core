package moe.leer.codeflowcore;

import org.testng.annotations.Test;

import java.io.IOException;

/**
 * @author leer
 * Created at 12/18/19 11:53 AM
 */
public class IfBlockTest extends BaseFlowchartTest {

  @Test
  public void testSimpleIf() throws IOException {
    baseFlowchartTest("ifCode.cf");
  }

  @Test
  public void testNestedIf() throws IOException {
    baseFlowchartTest("nestedIf.cf");
  }

  @Test
  public void testIfAndElse() throws IOException {
    baseFlowchartTest("ifAndElse.cf");
  }

  @Test
  public void testIfElseIf() throws IOException {
    baseFlowchartTest("ifElseIf.cf");
  }

  @Test
  public void testIfElseIfElse() throws IOException {
    baseFlowchartTest("ifElseIfElse.cf");
  }

  @Test
  public void testIfExample() throws IOException {
    baseFlowchartTest("ifExample1.cf");
  }
}
