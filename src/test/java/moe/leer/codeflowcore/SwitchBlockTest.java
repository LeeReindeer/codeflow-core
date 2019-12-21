package moe.leer.codeflowcore;

import org.testng.annotations.Test;

import java.io.IOException;

/**
 * @author leer
 * Created at 12/21/19 7:31 PM
 */
public class SwitchBlockTest extends BaseFlowchartTest {
  @Test
  public void testSwitch() throws IOException {
    codeFlow.parseFile("switch.cf").toFile("switch");
  }

  @Test
  public void testTrickSwitch() throws IOException {
    codeFlow.parseFile("trickSwitch.cf").toFile("trickSwitch");
  }
}
