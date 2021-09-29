package com.senacor.bdm.tests.validation

import com.senacor.bdm.modelsupport.BizModelBuilder
import org.junit.jupiter.api.BeforeEach

abstract class AbstractBizModelValidationTest extends AbstractValidationTest {
	
	protected var extension BizModelBuilder b
	
	@BeforeEach
	def void setBuilder() {
		b = newBizBuilder()
	}
}
