package equipement.core;

import soldier.core.BehaviorSoldier;
import soldier.core.StdExtension;

public class Shield implements Equipement
{

	@Override
	public BehaviorSoldier createExtension(BehaviorSoldier sol)
	{
		StdExtension res = new StdExtension (0, 10, sol);
		res.addEquipement (this);
		return res;
	}

}
