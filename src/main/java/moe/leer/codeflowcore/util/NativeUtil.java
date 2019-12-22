package moe.leer.codeflowcore.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/**
 * Load native library from resource
 *
 * @author leer
 * Created at 12/22/19 2:02 PM
 * @see "https://stackoverflow.com/a/12040310/7247458"
 */
public class NativeUtil {
  public static final Logger LOG = LoggerFactory.getLogger(NativeUtil.class);

  public static void loadLibrary(String library) {
    try {
      System.load(saveLibrary(library));
    } catch (IOException e) {
      LOG.warn("Could not find library " + library +
          " as resource, trying fallback lookup through System.loadLibrary");
      System.loadLibrary(library);
    }
  }


  public static String getOSSpecificLibraryName(String library, boolean includePath) {
    String osArch = System.getProperty("os.arch");
    String osName = System.getProperty("os.name").toLowerCase();
    String name;
    String path;

    if (osName.startsWith("win")) {
      if (osArch.equalsIgnoreCase("x86")) {
        name = library + ".dll";
        path = "win-x86/";
      } else {
        throw new UnsupportedOperationException("Platform " + osName + ":" + osArch + " not supported");
      }
    } else if (osName.startsWith("linux")) {
      if (osArch.equalsIgnoreCase("amd64")) {
        name = "lib" + library + ".so";
        path = "linux-x86_64/";
      } else if (osArch.equalsIgnoreCase("ia64")) {
        name = "lib" + library + ".so";
        path = "linux-ia64/";
      } else if (osArch.equalsIgnoreCase("i386")) {
        name = "lib" + library + ".so";
        path = "linux-x86/";
      } else {
        throw new UnsupportedOperationException("Platform " + osName + ":" + osArch + " not supported");
      }
    } else {
      throw new UnsupportedOperationException("Platform " + osName + ":" + osArch + " not supported");
    }

    return includePath ? path + name : name;
  }

  private static String saveLibrary(String library) throws IOException {
    String libraryName = getOSSpecificLibraryName(library, true);
    String tmpDirName = System.getProperty("java.io.tmpdir");
    File tmpDir = new File(tmpDirName);
    if (!tmpDir.exists()) {
      tmpDir.mkdir();
    }
    File file = File.createTempFile(library + "-", ".so", tmpDir);
    // Clean up the file when exiting
    file.deleteOnExit();
    try (InputStream in = NativeUtil.class.getClassLoader().getResourceAsStream("lib/" + libraryName); OutputStream out = new FileOutputStream(file)) {
      int cnt, offset = 0;
      // copy until done.
      if (in != null) {
        final byte[] buf = new byte[in.available()];
        while ((cnt = in.read(buf)) >= 1) {
          out.write(buf, offset, cnt);
          offset = cnt;
        }
      } else {
        throw new FileNotFoundException(libraryName);
      }
      LOG.info("Saved libfile: " + file.getAbsoluteFile());
      return file.getAbsolutePath();
    }
  }
}
