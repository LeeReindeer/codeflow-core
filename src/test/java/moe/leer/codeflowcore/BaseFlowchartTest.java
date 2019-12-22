package moe.leer.codeflowcore;

import guru.nidi.graphviz.engine.Format;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

/**
 * @author leer
 * Created at 12/18/19 2:01 PM
 */
public abstract class BaseFlowchartTest {
  protected CodeFlow codeFlow;

  public static final String nativeOutPutPrefix = "native-";

  @BeforeClass
  public void before() {
    FlowchartConfig.setFunctionColor("pink");
//    FlowchartConfig.setDecisionCompass("s", "w");
    codeFlow = CodeFlow.builder()
        .failFast(true)
        .useNative(true)
        .workDir("examples")
        .outDir("tests")
        .format(Format.PNG)
        .build();
  }

  public void baseFlowchartTest(String inputFile) {
    int dotIndex = inputFile.indexOf('.');
    String fileNameWithoutSuffix = inputFile.substring(0, dotIndex == -1 ? inputFile.length() : dotIndex);
    baseFlowchartTest(inputFile, fileNameWithoutSuffix);
  }

  public void baseFlowchartTest(String inputFilepath, String outputFileName) {
    try {
      if (codeFlow.isUseNative()) {
        codeFlow.parseFile(inputFilepath).toFile(nativeOutPutPrefix + outputFileName);
      } else {
        codeFlow.parseFile(inputFilepath).toFile(outputFileName);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
