package moe.leer.codeflowcore;

/**
 * @author leer
 * Created at 12/16/19 8:04 PM
 */
public class TodoException extends Error {


  public TodoException(String message) {
    super(message);
  }

  public static TodoException TODO(String msg) {
    return new TodoException(msg);
  }

  public static TodoException TODO() {
    return new TodoException("TODO");
  }
}
