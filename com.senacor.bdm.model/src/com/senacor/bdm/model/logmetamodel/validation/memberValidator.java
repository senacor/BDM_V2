/**
 *
 * $Id$
 */
package com.senacor.bdm.model.logmetamodel.validation;

import com.senacor.bdm.model.logmetamodel.LogDocument;

/**
 * A sample validator interface for {@link com.senacor.bdm.model.logmetamodel.member}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface memberValidator {
	boolean validate();

	boolean validateLogdocument(LogDocument value);
}