package moe.leer.codeflowcore;

import org.testng.annotations.Test;

/**
 * @author leer
 * Created at 12/26/19 1:51 PM
 */
@Test
public class EndNodeTest extends BaseFlowchartTest{
  public void testThrow(){
    baseFlowchartFileTest("throw.cf");
    baseFlowchartFileTest("throwNested.cf");
  }
}
