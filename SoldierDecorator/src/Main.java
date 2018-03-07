
public class Main 
{
	private static void fight (Soldier s1, Soldier s2)
	{
		while (s1.isAlive() && s2.isAlive())
		{
			s2.parry(s1.strike());
			if (s2.isAlive())
				s1.parry(s2.strike());
		}
		if (s1.isAlive())
			System.out.println("first soldier won.");
		else
			System.out.println("second soldier won.");
	}
	
	public static void main(String[] args) 
	{
		Soldier footman = new Footman ();
		Soldier horseman = new Horseman ();
		SoldierDecorator decoFootman = new SoldierDecorator (footman);
		SoldierDecorator decoHorseman = new SoldierDecorator (horseman);
		SoldierDecorator buffedFootman = new AddRing (footman); // Add a ring to the footman.
		SoldierDecorator buffedHorseman = new AddShield (new AddSword(horseman)); // Add a sword and a shield to the horseman.
		
		fight (buffedFootman, buffedHorseman);
	}
}
