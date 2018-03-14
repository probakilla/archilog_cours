package soldier.core;

public class InfantryMan extends UnitSimple
{
	public InfantryMan()
	{
		super(new ConstBehavior(3, 5, 10, "Jacky à pied"));
	}
}
