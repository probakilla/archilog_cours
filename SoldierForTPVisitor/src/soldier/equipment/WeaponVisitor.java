/**
 * D. Auber & P. Narbel
 * Solution TD Architecture Logicielle 2016 Universit� Bordeaux.
 */
package soldier.equipment;

import soldier.core.EquipmentAttack;
import soldier.core.EquipmentDefense;
import soldier.core.EquipmentToy;

public interface WeaponVisitor {
	void visit(EquipmentAttack s);
	void visit(EquipmentDefense s);
	void visit(EquipmentToy s);
}
