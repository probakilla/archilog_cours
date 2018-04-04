/**
 * D. Auber & P. Narbel
 * Solution TD Architecture Logicielle 2016 Universit� Bordeaux.
 */
package soldier.core;

import soldier.equipment.WeaponVisitor;

public interface Equipment extends Cloneable {
	String getName();

	BehaviorSoldier createExtension(BehaviorSoldier s);

	void accept(WeaponVisitor v);

	Equipment clone();
}
