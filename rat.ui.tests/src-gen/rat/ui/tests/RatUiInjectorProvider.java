/*
 * generated by Xtext 2.12.0
 */
package rat.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import rat.ui.internal.RatActivator;

public class RatUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return RatActivator.getInstance().getInjector("rat.Rat");
	}

}
