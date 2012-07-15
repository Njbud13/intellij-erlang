// This is a generated file. Not intended for manual editing.
package org.intellij.erlang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.erlang.ErlangTypes.*;
import org.intellij.erlang.psi.*;

public class ErlangTryCatchImpl extends ErlangCompositeElementImpl implements ErlangTryCatch {

  public ErlangTryCatchImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<ErlangExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ErlangExpression.class);
  }

  @Override
  @Nullable
  public ErlangTryClauses getTryClauses() {
    return findChildByClass(ErlangTryClauses.class);
  }

  @Override
  @Nullable
  public PsiElement getAfter() {
    return findChildByType(ERL_AFTER);
  }

  @Override
  @Nullable
  public PsiElement getCatch() {
    return findChildByType(ERL_CATCH);
  }

  @Override
  @Nullable
  public PsiElement getEnd() {
    return findChildByType(ERL_END);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ErlangVisitor) ((ErlangVisitor)visitor).visitTryCatch(this);
    else super.accept(visitor);
  }

}
