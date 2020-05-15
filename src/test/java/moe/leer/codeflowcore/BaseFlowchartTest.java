package moe.leer.codeflowcore;

import guru.nidi.graphviz.engine.Format;
import moe.leer.codeflowcore.exception.CodeFlowException;
import org.testng.annotations.BeforeClass;

/**
 * @author leer
 * Created at 12/18/19 2:01 PM
 */
public abstract class BaseFlowchartTest {
  protected CodeFlow codeFlow;

  public static String outPutPrefix = "";
  public static String nativeOutPutPrefix = "native-";

  @BeforeClass
  public void before() {
    FlowchartConfig.setFunctionColor("pink");
    FlowchartConfig.virtualStartNode = true;
    FlowchartConfig.virtualEndNode = true;
    FlowchartConfig.mergeSequences = true;
//    FlowchartConfig.setDecisionCompass("s", "w");
    codeFlow = CodeFlow.builder()
        .failFast(true)
        .strictMode(false)
        .useNative(true)
        .workDir("examples")
        .outDir("tests")
        .format(Format.PNG)
        .build();
  }

  public void baseFlowchartTest(String code, String outputFileName) {
    try {
      if (codeFlow.isUseNative()) {
        codeFlow.parse(code).toFile(nativeOutPutPrefix + outPutPrefix + outputFileName);
      } else {
        codeFlow.parse(code).toFile(outputFileName);
      }
    } catch (Exception e) {
      if (e instanceof CodeFlowException) {
        Throwable t = e.getCause();
        if (t instanceof RuntimeException) {
          throw (RuntimeException) t;
        }
        if (t instanceof Error) {
          throw (Error) t;
        }
      }
      e.printStackTrace();
    }
  }

  public void baseFlowchartFileTest(String inputFile) {
    int dotIndex = inputFile.indexOf('.');
    String fileNameWithoutSuffix = inputFile.substring(0, dotIndex == -1 ? inputFile.length() : dotIndex);
    baseFlowchartFileTest(inputFile, fileNameWithoutSuffix);
  }

  public void baseFlowchartFileTest(String inputFilepath, String outputFileName) {
    try {
      if (codeFlow.isUseNative()) {
        codeFlow.parseFile(inputFilepath).toFile(nativeOutPutPrefix + outPutPrefix + outputFileName);
      } else {
        codeFlow.parseFile(inputFilepath).toFile(outputFileName);
      }
    } catch (Exception e) {
      if (e instanceof CodeFlowException) {
        Throwable t = e.getCause();
        if (t instanceof RuntimeException) {
          throw (RuntimeException) t;
        }
        if (t instanceof Error) {
          throw (Error) t;
        }
      }
      e.printStackTrace();
    }
  }
}
