package moe.leer.codeflowcore;

import org.testng.annotations.Test;

/**
 * @author leer
 * Created at 4/28/20 10:14 PM
 */
@Test
public class ComplexExampleTest extends BaseFlowchartTest {
  public void testBinarySearch() {
    baseFlowchartFileTest("binarySearch.cf");
  }

  public void testMinDistance() {
    baseFlowchartFileTest("minDistance.cf");
  }

  public void testReshape() {
    baseFlowchartFileTest("reshape.cf");
  }

  public void testReverseInteger() {
    baseFlowchartFileTest("reverseInteger.cf");
  }

  public void testCombinationSum() {
    baseFlowchartFileTest("combinationSum.cf");
  }

  public void testUniquePath() {
    baseFlowchartFileTest("uniquePath.cf");
  }

  public void testTwoSum() {
    baseFlowchartFileTest("twoSum.cf");
  }

  public void testMergeTwoLists() {
    baseFlowchartFileTest("mergeTwoLists.cf");
  }

}
