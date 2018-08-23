/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.example.mydsl.JavaScriptRuntimeModule
import org.xtext.example.mydsl.JavaScriptStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class JavaScriptIdeSetup extends JavaScriptStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new JavaScriptRuntimeModule, new JavaScriptIdeModule))
	}
	
}
