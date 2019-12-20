package moe.leer.codeflowcore;

import guru.nidi.graphviz.engine.Format;
import org.testng.annotations.BeforeClass;

/**
 * @author leer
 * Created at 12/18/19 2:01 PM
 */
public abstract class BaseFlowchartTest {
  protected CodeFlow codeFlow;

  @BeforeClass
  public void before() {
    FlowchartConfig.setFunctionColor("pink");
//    FlowchartConfig.setDecisionCompass("s", "w");
    codeFlow = CodeFlow.builder()
        .workDir("examples")
        .outDir("tests")
        .format(Format.PNG)
        .build();
  }
}
