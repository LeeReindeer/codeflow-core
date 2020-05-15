package moe.leer.codeflowcore;

import org.testng.annotations.Test;

import java.io.IOException;

/**
 * @author leer
 * Created at 12/18/19 1:53 PM
 */
public class WhileBlockTest extends BaseFlowchartTest {
  @Test
  public void testWhile() throws IOException {
    baseFlowchartFileTest("while.cf");
    baseFlowchartFileTest("whileNestIf.cf");
  }

  @Test
  public void testDoWhile() throws IOException {
    baseFlowchartFileTest("dowhile.cf");
    baseFlowchartFileTest("dowhileNestIf.cf");
  }

  // 嵌套循环 2
  @Test
  public void testNestedWhile() {

  }

  // 嵌套循环 2
  @Test
  public void testNestedDoWhile() {

  }


  @Test
  public void testWhileBreak() throws IOException {
    baseFlowchartFileTest("twoSumSorted.cf", "whileBreak");
  }

  @Test
  public void testDoWhileBreak() throws IOException {
    baseFlowchartFileTest("dowhileBreak.cf");
  }
}
