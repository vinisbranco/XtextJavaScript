/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.JavaScript.ui.internal.JavaScriptActivator;

public class JavaScriptUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return JavaScriptActivator.getInstance().getInjector("org.xtext.example.mydsl.JavaScript");
	}

}
