package moe.leer.codeflowcore;

import org.testng.annotations.Test;

/**
 * @author leer
 * Created at 4/28/20 9:53 PM
 */
@Test
public class FunctionTest extends BaseFlowchartTest {
  public void testFunction() {
    baseFlowchartFileTest("fun.cf");
    baseFlowchartFileTest("fun1.cf");
    baseFlowchartFileTest("fun2.cf");
    baseFlowchartFileTest("fun3.cf");
    baseFlowchartFileTest("fun4.cf");
  }

  public void testRecursion() {
    baseFlowchartFileTest("recursion.cf");
    baseFlowchartFileTest("recursion1.cf");
  }
}
