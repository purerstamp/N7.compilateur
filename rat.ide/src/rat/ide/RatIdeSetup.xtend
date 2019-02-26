/*
 * generated by Xtext 2.12.0
 */
package rat.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import rat.RatRuntimeModule
import rat.RatStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class RatIdeSetup extends RatStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new RatRuntimeModule, new RatIdeModule))
	}
	
}
