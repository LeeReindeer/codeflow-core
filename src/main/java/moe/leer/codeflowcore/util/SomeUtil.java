package moe.leer.codeflowcore.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

import static java.util.Arrays.asList;

/**
 * @author leer
 * Created at 12/11/19 3:45 PM
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SomeUtil {
  @SafeVarargs
  public static <T> ArrayList<T> asArrayList(T... array) {
    return new ArrayList<>(asList(array));
  }

  public static <T> HashSet<T> asHashSet(T... array) {
    return new HashSet<>(asList(array));
  }

  public static <T> ArrayList<T> emptyArrayList() {
    return new ArrayList<>(4);
  }

  public static <T> HashSet<T> emptyHashList() {
    return new HashSet<>(4);
  }

  public static File createTempFile(String prefix, String suffix) throws IOException {
    String tmpDirName = System.getProperty("java.io.tmpdir");
    File tmpDir = new File(tmpDirName);
    if (!tmpDir.exists()) {
      tmpDir.mkdir();
    }
    File file = File.createTempFile(prefix, suffix, tmpDir);
    // Clean up the file when exiting
    file.deleteOnExit();
    return file;
  }
}
