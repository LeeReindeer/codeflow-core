package moe.leer.codeflowcore.lang.semantic.scope;

/**
 * @author leer
 * Created at 12/16/19 9:19 AM
 */
public class GlobalScope extends BaseScope {
  public GlobalScope() {
    super(null);
  }

  @Override
  public String getScopeName() {
    return "global";
  }

}
