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
    baseFlowchartFileTest("ifCode.cf");
  }

  @Test
  public void testNestedIf() throws IOException {
    baseFlowchartFileTest("nestedIf.cf");
  }

  @Test
  public void testIfAndElse() throws IOException {
    baseFlowchartFileTest("ifAndElse.cf");
  }

  @Test
  public void testIfElseIf() throws IOException {
    baseFlowchartFileTest("ifElseIf.cf");
  }

  @Test
  public void testIfElseIfElse() throws IOException {
    baseFlowchartFileTest("ifElseIfElse.cf");
  }

  @Test
  public void testIfExample() throws IOException {
    baseFlowchartFileTest("ifExample1.cf");
  }
}
