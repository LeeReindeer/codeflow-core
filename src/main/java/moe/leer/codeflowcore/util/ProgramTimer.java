package moe.leer.codeflowcore.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author leer
 * Created at 12/22/19 9:21 PM
 */
public class ProgramTimer {

  private static final Logger logger = LoggerFactory.getLogger(ProgramTimer.class);

  private String name;
  private long duration;
  private long start;
  private long stop;

  public ProgramTimer(String name) {
    this.name = name;
  }

  public void start() {
    start = System.currentTimeMillis();
  }

  public void stop() {
    stop = System.currentTimeMillis();
  }

  public long stopAndReport() {
    stop = System.currentTimeMillis();
    duration = stop - start;
    logger.info(name + ": " + duration + "ms");
    return duration;
  }

  public void clear() {
    duration = 0;
  }

  public long getDuration() {
    return duration;
  }
}
