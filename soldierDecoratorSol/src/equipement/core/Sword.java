package equipement.core;

import soldier.core.BehaviorSoldier;
import soldier.core.StdExtension;

public class Sword implements Equipement
{

	@Override
	public BehaviorSoldier createExtension(BehaviorSoldier sol)
	{
		StdExtension res = new StdExtension (10, 0, sol);
		res.addEquipement (this);
		return res;
	}

}
