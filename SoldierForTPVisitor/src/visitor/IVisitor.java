package visitor;

import soldier.core.*;

public interface IVisitor
{
	void visit (UnitGroup group);
	void visit (UnitInfantry infantry);
	void visit (UnitRider rider);
	void visit (EquipmentAttack equipment);
	void visit (EquipmentDefense equipment);
	void visit (EquipmentToy equipment);
}
