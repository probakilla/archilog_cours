
public class Horseman implements Soldier
{
	private double _health = 15.0;
	
	private final double HORSEMAN_STRENGHT = 8.0;
	
	public Horseman () {}
	
	public double strike ()
	{
		return HORSEMAN_STRENGHT;
	}
	
	public void parry (double power)
	{
		_health -= power;
	}
}
