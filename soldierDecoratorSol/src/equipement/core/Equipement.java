package equipement.core;

import soldier.core.BehaviorSoldier;

public interface Equipement
{
	public BehaviorSoldier createExtension (BehaviorSoldier sol);
}
