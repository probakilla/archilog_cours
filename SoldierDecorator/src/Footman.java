
public class Footman implements Soldier 	
{	
	private double _health = 10.0;
	
	private final double FOOTMAN_STRENGHT = 5;
	
	public Footman () {}
	
	public double strike ()
	{
		return FOOTMAN_STRENGHT; 
	}
	
	public void parry (double power)
	{
		_health -= power;
	}
}
