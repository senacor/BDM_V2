/*
 * generated by Xtext 2.25.0
 */
package com.senacor.bdm.ui;

import com.google.inject.Injector;
import com.senacor.bdm.ui.internal.BdmActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(BdmActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		BdmActivator activator = BdmActivator.getInstance();
		return activator != null ? activator.getInjector(BdmActivator.COM_SENACOR_BDM_DSL) : null;
	}

}
