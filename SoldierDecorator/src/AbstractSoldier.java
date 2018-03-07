
public class AbstractSoldier implements Soldier 
{
	double _health;

	private final double FOOTMAN_STRENGHT = 5;
	private final double FOOTMAN_HEALTH = 10.0;
	
	public AbstractSoldier() 
	{
		_health = FOOTMAN_HEALTH;
	}
	
	@Override
	public double strike() 
	{
		return FOOTMAN_STRENGHT;
	}

	@Override
	public void parry(double power) 
	{	
		_health -= power;
	}

	@Override
	public void displayHealth() 
	{
		System.out.println(_health);
	}

	@Override
	public boolean isAlive() 
	{
		return (_health > 0);
	}

}
