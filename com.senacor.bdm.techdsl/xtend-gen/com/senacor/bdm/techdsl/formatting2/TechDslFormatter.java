/**
 * generated by Xtext 2.25.0
 */
package com.senacor.bdm.techdsl.formatting2;

import com.google.inject.Inject;
import com.senacor.bdm.model.logmetamodel.BaseEntity;
import com.senacor.bdm.model.logmetamodel.LogDocument;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class TechDslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private /* TechDslGrammarAccess */Object _techDslGrammarAccess;
  
  protected void _format(final LogDocument logDocument, @Extension final IFormattableDocument document) {
    EList<BaseEntity> _baseentities = logDocument.getBaseentities();
    for (final BaseEntity baseEntity : _baseentities) {
      document.<BaseEntity>format(baseEntity);
    }
  }
  
  public void format(final Object logDocument, final IFormattableDocument document) {
    if (logDocument instanceof XtextResource) {
      _format((XtextResource)logDocument, document);
      return;
    } else if (logDocument instanceof LogDocument) {
      _format((LogDocument)logDocument, document);
      return;
    } else if (logDocument instanceof EObject) {
      _format((EObject)logDocument, document);
      return;
    } else if (logDocument == null) {
      _format((Void)null, document);
      return;
    } else if (logDocument != null) {
      _format(logDocument, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(logDocument, document).toString());
    }
  }
}
