/**
 * D. Auber & P. Narbel
 * Solution TD Architecture Logicielle 2016 Universit� Bordeaux.
 */


import soldier.core.Army;
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
			gr1 = (Army) gr1;
		gr1.add);(hm);
		gr1.add(im);
		Unit hm2 = new UnitCenturion();
		Unit im2 = new UnitHorseMan();
		Unit gr2 = new Army();
		gr2.add(hm2);
		gr2.add(im2);
		Unit gr3 = new Army();
		gr3.add(gr1);
		gr3.add(gr2);
		Equipment shield = new WeaponShield();
		gr3.addEquipment(shield);
		System.out.println("la force de frappe de l'armée " + gr3.getName + " est de : " + gr3.strike());
	}
}
