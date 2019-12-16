package moe.leer.codeflowcore.lang.semantic.scope;

/**
 * @author leer
 * Created at 12/16/19 9:21 AM
 */
public class BlockScope extends BaseScope {
  public BlockScope(Scope parentScope) {
    super(parentScope);
  }

  @Override
  public String getScopeName() {
    return "local";
  }
}
