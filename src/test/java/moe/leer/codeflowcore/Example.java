package moe.leer.codeflowcore;

/**
 * @author leer
 * Created at 12/6/19 6:50 PM
 */
public class Example {
  /*
  public static String testIfExample1() {
    return """
              if (prev != null) {
                prev.stops.addLink(cur.start);
                if (prev.type == IF) {
                  prev.start.addLink(cur.start).with("false");
                } else if(prev.type == FOR) {
                  prev.doFor();
                } else {
                  prev.doSomething();
                }
                prev = cur;
              } else {
                prev.doSomethingElse();
              }
              Node a = new Node();
        """;
  }

  public static String testIfCode() {
    return """
        if (a == 1) {
          a++;
          b++;
        }
        """;
  }

  public static String testNestedIfCode() {
    return
        """
              if (prev != null) {
                prev.stops.addLink(cur.start);
                if (prev.type == IF) {
                  prev.start.addLink(cur.start).with("false");
                }
                prev = cur;
              }
              Node a = new Node();
            """;
  }

  public static String testIfAndElseCode() {
    return
        """
            if (a == 1) {
              a++;
            } else {
              a--
            }
            c++;
            """;
  }
/*
  public static String testIfElseCode() {
    return
        """
            if (a == 1) {
              a++;
            } else if (a == 2) {
              a--;
            }
            c++;
            """;
  }
  public static String testIfElseElseCode() {
    return
        """
            if (a == 1) {
              a++;
            } else if (a == 2) {
              a--;
            } else {
              b++;
            }
            c++;
            """;
  }
  */

}
