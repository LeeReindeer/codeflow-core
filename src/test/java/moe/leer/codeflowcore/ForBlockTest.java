package moe.leer.codeflowcore;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leer
 * Created at 12/18/19 1:53 PM
 */
@Test
public class ForBlockTest extends BaseFlowchartTest {

  // 1 + 4,  TODO 三个表达式可缺失
  @Test
  public void testForCode() throws IOException {
    codeFlow.setStrictMode(false);
    baseFlowchartFileTest("forCode.cf");
  }

  @Test
  public void testForNestIf() throws IOException {
    baseFlowchartFileTest("forNestIf.cf");
  }

  // 嵌套循环
  @Test
  public void testNestedFor() throws IOException {
    baseFlowchartFileTest("nestedFor.cf");
//    baseFlowchartFileTest("nestedFor2.cf");
  }

  @Test
  public void testForBreak() throws IOException {
    baseFlowchartFileTest("forBreak.cf");
  }

  @Test
  public void testNestedForBreak() throws IOException {
    baseFlowchartFileTest("nestedForBreak.cf");
  }

  public void testForEach() {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    for (Integer integer : list) {
      System.out.println(integer);
    }
    Iterator<Integer> it = list.iterator();
    while (it.hasNext()) {
      int a = it.next();
      System.out.println(a);
    }

    baseFlowchartFileTest("forEach.cf");
  }

  public void forScopeTest() {
    baseFlowchartTest("int a = 1;\n" +
        "for(int a = 1; a < 10 ;a++) {\n" +
        "    doSome();\n" +
        "}", "forScopeTest");
  }
}
