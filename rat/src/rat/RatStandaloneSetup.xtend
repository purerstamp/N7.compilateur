/*
 * generated by Xtext 2.12.0
 */
package rat


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class RatStandaloneSetup extends RatStandaloneSetupGenerated {

	def static void doSetup() {
		new RatStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
