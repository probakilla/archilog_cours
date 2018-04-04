/**
 * D. Auber & P. Narbel
 * Solution TD Architecture Logicielle 2016 Universit� Bordeaux.
 */


import soldier.core.Army;
import soldier.core.Equipment;
import soldier.core.UnitSimple;
import soldier.equipment.EquipmentTrumpet;
import soldier.equipment.WeaponShield;
import soldier.equipment.WeaponSword;
import soldier.units.UnitCenturion;
import soldier.units.UnitHorseMan;
import soldier.units.UnitRobot;

public class MainFightExemple 
{

	void main(String argv[]) 
	{
		UnitSimple hm = new UnitHorseMan("Jacyky");
		UnitSimple im = new UnitCenturion("La Fritte");
		UnitSimple gr1 = new Army ("Jacky La Fritte");
		if (gr1 instanceof Army)
		{
			((Army)gr1).addComponent (hm);
			((Army)gr1).addComponent (im);
		}
		UnitSimple hm2 = new UnitCenturion("Bob");
		UnitSimple im2 = new UnitHorseMan("Billy");
		UnitSimple gr2 = new Army("José");
		if (gr2 instanceof Army)
		{
			((Army)gr2).addComponent(hm2);
			((Army)gr2).addComponent(im2);
		}
		UnitSimple gr3 = new Army("Jaqueline");
		UnitSimple hm3 = new UnitCenturion ("Robert");
		UnitSimple im3 = new UnitHorseMan ("Swagg_man");
		if (gr3 instanceof Army)
		{
			((Army)gr3).addComponent(hm3);
			((Army)gr3).addComponent(im3);
		}
		Equipment shield = new WeaponShield();
		gr3.addEquipment(shield);
		System.out.println("la force de frappe de l'armée " +
							gr3.getName() + " est de : " + 
							gr3.strike());
	}
}
