package moe.leer.codeflowcore;

import org.testng.annotations.Test;

import java.io.IOException;

/**
 * @author leer
 * Created at 12/18/19 11:53 AM
 */
@Test
public class IfBlockTest extends BaseFlowchartTest {

  // 单分支If
  public void testSimpleIf() throws IOException {
    baseFlowchartFileTest("ifCode.cf");
    baseFlowchartFileTest("ifCode1.cf");
    baseFlowchartFileTest("ifCode2.cf");
  }

  // 嵌套if
  @Test
  public void testNestedIf() throws IOException {
    baseFlowchartFileTest("nestedIf.cf");
    baseFlowchartFileTest("nestedIf1.cf");
  }

  // if else
  @Test
  public void testIfAndElse() throws IOException {
    baseFlowchartFileTest("ifAndElse.cf");
    baseFlowchartFileTest("ifAndElse1.cf");
  }

  // If else嵌套，多分支
  @Test
  public void testIfElseIf() throws IOException {
    baseFlowchartFileTest("ifElseIf.cf");
  }
  @Test
  public void testIfElseIfElse() throws IOException {
    baseFlowchartFileTest("ifElseIfElse.cf");
    baseFlowchartFileTest("ifElseIfElse1.cf");
    baseFlowchartFileTest("ifElseIfElse2.cf");
  }

  public void testParallelIf() {
    baseFlowchartFileTest("parallelIf.cf");
  }

  @Test
  public void testIfExample() throws IOException {
    baseFlowchartFileTest("ifExample1.cf");
  }
}
