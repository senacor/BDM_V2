package com.senacor.bdm.tests.validation

import com.senacor.bdm.modelsupport.BizModelBuilder
import com.senacor.bdm.tests.testsupport.BizModelBuilderTestSupport
import javax.inject.Inject
import org.junit.jupiter.api.BeforeEach

abstract class AbstractBizModelValidationTest extends AbstractValidationTest {
	
	@Inject
	protected extension BizModelBuilderTestSupport
	protected var extension BizModelBuilder b
	
	@BeforeEach
	def void setBuilder() {
		b = newBizBuilder()
	}
}
