package moe.leer.codeflowcore;

import org.testng.annotations.Test;

/**
 * @author leer
 * Created at 2/1/20 4:04 PM
 */
@Test
public class LabeledLoopTest extends BaseFlowchartTest {
  public void labeledFor() {
    baseFlowchartFileTest("labeledFor.cf");
    baseFlowchartFileTest("labeledFor1.cf");
  }

  // 2
  public void labeledWhile() {
    baseFlowchartFileTest("labeledWhile.cf");
    baseFlowchartFileTest("labeledDoWhile.cf");
  }

}
