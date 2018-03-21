/**
 * D. Auber & P. Narbel
 * Solution TD Architecture Logicielle 2016 Universit� Bordeaux.
 */
package soldier.units;

import soldier.core.EquipmentException;
import soldier.core.UnitInfantry;
import soldier.core.Equipment;

public class UnitRobot extends UnitInfantry {

	public UnitRobot(String soldierName) {
		super(soldierName, new BehaviorSoldierHealthBased( 200, 15));
	}
	
	/**
	 * A Robot can have at most four equipments
	 */
	@Override
	public void addEquipment(Equipment w) {
		if (nbWeapons()>3) throw new EquipmentException();
		super.addEquipment(w);
	}

	
}
