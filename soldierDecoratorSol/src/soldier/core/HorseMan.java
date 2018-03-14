package soldier.core;

public class HorseMan extends UnitSimple
{
	public HorseMan()
	{
		super(new LogPowBehavior(5, 5, 15, "Jacki Cheval"));
	}
}