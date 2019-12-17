package moe.leer.codeflowcore.lang.semantic.scope;

/**
 * @author leer
 * Created at 12/17/19 5:12 PM
 */
public class ClassScope extends BaseScope {
  public ClassScope(Scope parentScope) {
    super(parentScope);
  }

  @Override
  public String getScopeName() {
    return "class";
  }
}
