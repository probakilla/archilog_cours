
public class AddRing extends SoldierDecorator 
{
	public AddRing (Soldier soldier)
	{
		super (soldier);
	}
	
	public double strike ()
	{
		return super.strike() * 2;
	}
	
	public void parry (double power)
	{
		super.parry(power / 2);
	}
}
