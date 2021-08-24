package com.senacor.bdm.ui.tests

import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(DslUiInjectorProvider)
class EmptyTest {
	@Test
	def void empty() {
		// always true. convenient.
	}
}