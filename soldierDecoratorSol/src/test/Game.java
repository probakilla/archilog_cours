package test;
import equipement.core.*;
import exception.ImpossibleExtensionException;
import soldier.core.*;
public class Game 
{

	public static void main(String[] args) 
	{
		UnitSimple hm = new HorseMan();
		UnitSimple im = new InfantryMan();
		Equipment sw = new Sword();
		Equipment sh = new Shield();
		Equipment sw2 = new Sword();
		try { 
			im.parry(hm.strike());
			im.addEquipement(sw);
			hm.addEquiment(sw); // Lève une exception car l'arme est déjà attaché
		}catch(ImpossibleExtensionException e) {}

		try {
			im.removeEquiment(sw);
			hm.addEquipement(sw);
			hm.addEquipement(sh);    
			hm.addEquiment(sw2); // Lève une exception car deux armes maximum
		}catch(ImpossibleExtensionException e) {}
	}
}