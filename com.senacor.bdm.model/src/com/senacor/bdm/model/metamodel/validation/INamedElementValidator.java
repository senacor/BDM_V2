/**
 *
 * $Id$
 */
package com.senacor.bdm.model.metamodel.validation;

/**
 * A sample validator interface for {@link com.senacor.bdm.model.metamodel.INamedElement}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface INamedElementValidator {
	boolean validate();

	boolean validateName(String value);
}