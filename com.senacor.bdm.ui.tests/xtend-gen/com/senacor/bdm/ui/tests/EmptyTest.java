package com.senacor.bdm.ui.tests;

import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(DslUiInjectorProvider.class)
@SuppressWarnings("all")
public class EmptyTest {
  @Test
  public void empty() {
  }
}
