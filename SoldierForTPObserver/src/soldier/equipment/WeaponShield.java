/**
 * D. Auber & P. Narbel
 * Solution TD Architecture Logicielle 2016 Universit� Bordeaux.
 */
package soldier.equipment;

import soldier.core.BehaviorSoldier;
import soldier.core.EquipmentDefense;

public class WeaponShield extends EquipmentDefense {

	@Override
	public WeaponShield clone() {
		return (WeaponShield) super.clone();
	}

	@Override
	public String getName() {
		return "Shield";
	}

	@Override
	public BehaviorSoldier createExtension(BehaviorSoldier s) {
		return new BehaviorExtLogLin(this, s);
	}

}
