
public class AddShield extends SoldierDecorator 
{

	public AddShield(Soldier soldier) 
	{
		super(soldier);
	}
	
	@Override
	public void parry (double power)
	{
		super.parry(power/2);
	}
}
