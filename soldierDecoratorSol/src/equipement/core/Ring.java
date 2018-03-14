package equipement.core;

import soldier.core.BehaviorSoldier;
import soldier.core.StdExtension;

public class Ring implements Equipement
{

	@Override
	public BehaviorSoldier createExtension(BehaviorSoldier sol)
	{
		StdExtension res = new StdExtension (8, 8, sol);
		res.addEquipement (this);
		return res;
	}

}
