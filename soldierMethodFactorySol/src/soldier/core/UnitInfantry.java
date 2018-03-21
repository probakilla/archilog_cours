/**
 * D. Auber & P. Narbel
 * Solution TD Architecture Logicielle 2016 Universit� Bordeaux.
 */
package soldier.core;

public abstract class UnitInfantry extends UnitSimpleBridge {

	public UnitInfantry(String name, BehaviorSoldier behavior) {
		super(name, behavior);
	}

}
