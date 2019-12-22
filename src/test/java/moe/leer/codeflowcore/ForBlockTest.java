package moe.leer.codeflowcore;

import org.testng.annotations.Test;

import java.io.IOException;

/**
 * @author leer
 * Created at 12/18/19 1:53 PM
 */
public class ForBlockTest extends BaseFlowchartTest {

  @Test
  public void testForCode() throws IOException {
    baseFlowchartTest("forCode.cf");
  }

  @Test
  public void testForNestIf() throws IOException {
    baseFlowchartTest("forNestIf.cf");
  }

  @Test
  public void testNestedFor() throws IOException {
    baseFlowchartTest("nestedFor.cf");
    baseFlowchartTest("nestedFor2.cf");
  }

  @Test
  public void testForBreak() throws IOException {
    baseFlowchartTest("forBreak.cf");
  }

  @Test
  public void testNestedForBreak() throws IOException {
    baseFlowchartTest("nestedForBreak.cf");
  }

  @Test
  public void mulTable() {
    for (int i = 1; i < 10; i++) {
      for (int j = 1; j <= i; j++) {
        if (j != 1) System.out.print(" ");
        System.out.printf("%d*%d=%d", i, j, i * j);
      }
      System.out.println();
    }
  }
}
