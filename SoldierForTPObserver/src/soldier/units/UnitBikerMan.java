/**
 * D. Auber & P. Narbel
 * Solution TD Architecture Logicielle 2016 Universit� Bordeaux.
 */
package soldier.units;

import soldier.core.EquipmentException;
import soldier.core.UnitRider;
import soldier.core.Equipment;

public class UnitBikerMan extends UnitRider {

	public UnitBikerMan(String soldierName) {
		super(soldierName, new BehaviorSoldierStd(20, 120));
	}

	/**
	 * A BikerMan can have at most one equipment
	 */
	@Override
	public void addEquipment(Equipment w) {
		if (nbWeapons() > 0)
			throw new EquipmentException();
		super.addEquipment(w);
	}

}
