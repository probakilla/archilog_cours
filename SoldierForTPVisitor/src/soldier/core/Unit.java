/**
 * D. Auber & P. Narbel
 * Solution TD Architecture Logicielle 2016 Universit� Bordeaux.
 */
package soldier.core;

import java.util.Iterator;
 
public interface Unit {
	/**
	 * Unit methods // Bridge
	 */
	public String getName();
	public float getHealthPoints();
	public boolean alive();
	public void heal();
	public float parry(float force); 
	public float strike();

	/**
	 * Behavior extensions
	 */
	public void addEquipment(Equipment w);
	public void removeEquipment(Equipment w);
	public Iterator<Equipment> getEquipments();

	/**
	 * Composite methods
	 */
	public Iterator<Unit> subUnits();
	public void addUnit(Unit au);
	public void removeUnit(Unit au);

	/**
	 * Observable methods
	 */
	void addObserver(UnitObserver ob);
	void removeObserver(UnitObserver ob);
	void notifyObservers();
	
}
