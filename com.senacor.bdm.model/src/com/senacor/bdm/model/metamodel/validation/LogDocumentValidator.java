/**
 *
 * $Id$
 */
package com.senacor.bdm.model.metamodel.validation;

import com.senacor.bdm.model.metamodel.BaseEntity;

import com.senacor.bdm.model.metamodel.ImportContainer;
import com.senacor.bdm.model.metamodel.Member;
import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link com.senacor.bdm.model.metamodel.LogDocument}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface LogDocumentValidator {
	boolean validate();

	boolean validateMembers(EList<Member> value);

	boolean validateImportcontainer(ImportContainer value);

	boolean validateName(String value);

	boolean validateBaseentities(EList<BaseEntity> value);
}
