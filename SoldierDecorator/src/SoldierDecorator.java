
public class SoldierDecorator implements Soldier 
{
	private Soldier _soldier;
	
	public SoldierDecorator (Soldier soldier)
	{
		_soldier = soldier;
	}

	@Override
	public double strike ()
	{
		return _soldier.strike();
	}
	
	@Override
	public void parry (double power)
	{
		_soldier.parry(power);
	}
	
	@Override
	public void displayHealth ()
	{
		_soldier.displayHealth();
	}
	
	@Override
	public boolean isAlive ()
	{
		return _soldier.isAlive();
	}
}