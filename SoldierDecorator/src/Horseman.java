
public class Horseman extends AbstractSoldier
{	
	private final double HORSEMAN_STRENGHT = 8.0;
	
	public Horseman () 
	{
		_health = 15.0;
	}
	
	@Override
	public double strike ()
	{
		return HORSEMAN_STRENGHT;
	}
}
