package moe.leer.codeflowcore;

import org.testng.annotations.Test;

/**
 * @author leer
 * Created at 2/1/20 4:04 PM
 */
@Test
public class LabeledLoopTest extends BaseFlowchartTest {
  public void test() {
    baseFlowchartFileTest("label.cf");
  }
}
