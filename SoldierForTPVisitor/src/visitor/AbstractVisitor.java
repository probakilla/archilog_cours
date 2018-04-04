package visitor;

import soldier.core.EquipmentAttack;
import soldier.core.EquipmentDefense;
import soldier.core.EquipmentToy;
import soldier.core.UnitGroup;
import soldier.core.UnitInfantry;
import soldier.core.UnitRider;

public abstract class AbstractVisitor implements IVisitor
{

	@Override
	public void visit(UnitGroup group)
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public void visit(UnitInfantry infantry)
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public void visit(UnitRider rider)
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public void visit(EquipmentAttack equipment)
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public void visit(EquipmentDefense equipment)
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public void visit(EquipmentToy equipment)
	{
		throw new UnsupportedOperationException();
	}

}
