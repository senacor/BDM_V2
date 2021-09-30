package com.senacor.bdm.tests.validation

import com.senacor.bdm.modelsupport.BizModelBuilder
import org.junit.jupiter.api.BeforeEach

abstract class AbstractBizModelValidationTest extends AbstractValidationTest {
	
	/** The central builder that stores the model to build. Is automatically created before each test run ({@see #setBuilder()}. */
	protected var extension BizModelBuilder b
	
	@BeforeEach
	def void setBuilder() {
		b = newBizBuilder()
	}
}
