package com.senacor.bdm.tests.validation

import com.senacor.bdm.modelsupport.BizModelBuilder
import com.senacor.bdm.modelsupport.CommonModelSupport
import com.senacor.bdm.tests.testsupport.BizModelBuilderTestSupport
import javax.inject.Inject
import org.junit.jupiter.api.BeforeEach

abstract class AbstractBizModelValidationTest extends AbstractValidationTest {
	
	@Inject
	protected extension BizModelBuilderTestSupport
	@Inject
	protected extension CommonModelSupport
	
	protected extension BizModelBuilder b
	
	@BeforeEach
	def void setBuilder() {
		b = newBizBuilder()
	}
}
