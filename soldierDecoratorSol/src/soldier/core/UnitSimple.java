package soldier.core;

import equipement.core.*;
import exception.ImpossibleExtensionException;

public abstract class UnitSimple 
{
	private double _health = 10;
	private BehaviorSoldier _deleg;
	private int _nb_equipement = 0;
	
	public UnitSimple (BehaviorSoldier sol) 
	{
		_deleg = sol;
	}
	
	public float strike ()
	{
		return _deleg.strike();
	}
	
	public void parry (float d)
	{
		_deleg.parry(d);
	}
	
	public boolean isAlive ()
	{
		return (_health > 0);
	}
	
	public void addEquipment (Equipement eq) throws ImpossibleExtensionException
	{
		if (_nb_equipement == 2)
			throw new ImpossibleExtensionException("Can't carry it");
		eq.createExtension(_deleg);
	}
	
	public void removeEquipement (Equipement eq)
	{
		BehaviorExtension it = (BehaviorExtension)_deleg;
		while (it instanceof BehaviorExtension)
		{
			if (it.getEquipement() instanceof Sword)
				return;
		}
	}
}
