package moe.leer.codeflowcore.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

import static java.util.Arrays.asList;

/**
 * @author leer
 * Created at 12/11/19 3:45 PM
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SomeUtil {
  public static <T> ArrayList<T> asArrayList(T... array) {
    return new ArrayList<>(asList(array));
  }
}
