
public class AddSword extends SoldierDecorator
{		
	public AddSword(Soldier soldier) 
	{
		super(soldier);
	}			
	
	@Override
	public double strike () 
	{
		return super.strike() * 2;
	}
}
