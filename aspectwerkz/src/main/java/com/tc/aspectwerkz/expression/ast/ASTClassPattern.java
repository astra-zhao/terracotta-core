/*
 * All content copyright (c) 2003-2008 Terracotta, Inc., except as may otherwise be noted in a separate copyright notice.  All rights reserved.
 */

/* Generated By:JJTree: Do not edit this line. ASTClassPattern.java */
package com.tc.aspectwerkz.expression.ast;

import com.tc.aspectwerkz.expression.regexp.Pattern;
import com.tc.aspectwerkz.expression.regexp.TypePattern;
import com.tc.aspectwerkz.expression.SubtypePatternType;

public class ASTClassPattern extends SimpleNode {
  private TypePattern m_typePattern;

  public ASTClassPattern(int id) {
    super(id);
  }

  public ASTClassPattern(ExpressionParser p, int id) {
    super(p, id);
  }

  public Object jjtAccept(ExpressionParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }

  public void setTypePattern(String pattern) {
    if (pattern.endsWith("+")) {
      pattern = pattern.substring(0, pattern.length() - 1);
      m_typePattern = Pattern.compileTypePattern(pattern, SubtypePatternType.MATCH_ON_ALL_METHODS);
    } else if (pattern.endsWith("#")) {
      pattern = pattern.substring(0, pattern.length() - 1);
      m_typePattern = Pattern.compileTypePattern(pattern, SubtypePatternType.MATCH_ON_BASE_TYPE_METHODS_ONLY);
    } else {
      m_typePattern = Pattern.compileTypePattern(pattern, SubtypePatternType.NOT_HIERARCHICAL);
    }
  }

  public TypePattern getTypePattern() {
    return m_typePattern;
  }
}