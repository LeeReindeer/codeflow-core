package moe.leer.codeflowcore;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author leer
 * Created at 12/22/19 8:06 PM
 */
@Test
public class ExampleInPaper extends BaseFlowchartTest {

  @BeforeClass
  public void before() {
    super.before();
    codeFlow = codeFlow.setOutDir("paper");
    nativeOutPutPrefix = "";
    outPutPrefix = "paper-";
    FlowchartConfig.virtualEndNode = true;
    FlowchartConfig.virtualStartNode = true;
  }

  @AfterClass
  public void after() {
    codeFlow.setOutDir("tests");
    outPutPrefix = "";
    nativeOutPutPrefix = "native-";
  }

  public void sequenceEg() {
    baseFlowchartTest(
        "Process1 = 1;\n" +
            "Process2;\n" +
            "Process3;",
        "sequenceEg");
  }

  public void ifEg1() {
    baseFlowchartTest(
        "if(C){\n" +
            "   Process1\n" +
            "}", "ifEg");
  }

  public void ifEg2() {
    baseFlowchartTest(
        "if(C){\n" +
            "   Process1\n" +
            "}\n" +
            "Process2", "ifEg2");
  }

  public void ifElseEg() {
    baseFlowchartTest(
        "if(C1){\n" +
            "   Process1\n" +
            "} else {\n" +
            "   Process2\n" +
            "}\n" +
            "Process3",
        "ifElseEg");
  }

  public void ifElseIf() {
    baseFlowchartTest("if(C1){\n" +
        "   Process1\n" +
        "} else if(C2){\n" +
        "   Process2\n" +
        "}\n" +
        "Process3", "ifElseIf");
  }

  public void ifCombine() {
    baseFlowchartTest(
        "if(C1){\n" +
            "   Process1\n" +
            "} else if(C2){\n" +
            "   Process2\n" +
            "} else {\n" +
            "   Process3\n" +
            "}\n" +
            "Process4",
        "ifCombine");
  }

  public void switchEg() {
    baseFlowchartTest(
        "switch(constant) {\n" +
            "   case A:\n" +
            "      Process1;\n" +
            "      break;\n" +
            "   case B:\n" +
            "      Process2;\n" +
            "      break;\n" +
            "   case C:\n" +
            "      Process3;\n" +
            "      break;\n" +
            "   default:\n" +
            "      Process4;\n" +
            "      break;\n" +
            "}" +
            "Process5;",
        "switchEg");
  }

  public void specialSwitch() {
    baseFlowchartTest("switch(constant) {\n" +
            "   case A:\n" +
            "      Process1; // fallthrouth\n" +
            "   case B: // multi-cases\n" +
            "   case C:\n" +
            "      Process2;\n" +
            "      break;\n" +
            "   default:\n" +
            "      Process4;\n" +
            "      break;\n" +
            "}\n" +
            "Process5;",
        "specialSwitch");
  }

  public void structureLessStmt() {
    baseFlowchartTest("for(forInit;C;forUpdate) {\n" +
        "   Process1;\n" +
        "   if (C1) {\n" +
        "       continue;\n" +
        "   }\n" +
        "   if (C2) {\n" +
        "       break;\n" +
        "   }\n" +
        "   if (C3) {\n" +
        "       throw new RuntimeException();\n" +
        "   }\n" +
        "   if (C4) {\n" +
        "       return;\n" +
        "   }\n" +
        "}", "structureLess");
  }

  public void labeledBreak() {
    baseFlowchartTest("outter:\n" +
        "while(C1) {\n" +
        "  inner:\n" +
        "while(C2) {\n" +
        "  if (C3) {\n" +
        "  continue inner;\n" +
        "}\n" +
        "if (C4) {\n" +
        "  break outter;\n" +
        "}\n" +
        "}\n" +
        "Process1;\n" +
        "}", "labeledBreak");
  }

  public void testSubGraph() {
    int a = fact(3);
    System.out.println(a);
    baseFlowchartTest("int a = fact(3);\n" +
            "System.out.println(a);\n" +
            "\n" +
            "int fact(int n) {\n" +
            "  int res = 1;\n" +
            "  while (n > 0) {\n" +
            "    res *= n;\n" +
            "    n--;\n" +
            "  }\n" +
            "  return res;\n" +
            "}"
        , "subGraph");
  }

  int fact(int n) {
    int res = 1;
    while (n > 0) {
      res *= n;
      n--;
    }
    return res;
  }

  public void test() {
    baseFlowchartTest("  public boolean isPalindrome(int x) {\n" +
        "    if (x < 0) return false;\n" +
        "    String s = String.valueOf(x);\n" +
        "    int l = 0, r = s.length() - 1;\n" +
        "    while (l < r) {\n" +
        "      if ( s.charAt(l++) != s.charAt(r--)) return false;\n" +
        "    }\n" +
        "    return true;\n" +
        "  }", "isPalindrome");
  }

  public void example5_1() {
    baseFlowchartFileTest("paper-5-1");
  }

  public void example5_2() {
    baseFlowchartFileTest("paper-5-2");
  }

  public void example5_3() {
    baseFlowchartFileTest("paper-5-3");
  }

  public void example5_4() {
    baseFlowchartFileTest("paper-5-4");
  }

  public void example5_5() {
    baseFlowchartFileTest("paper-5-5");
  }
}
