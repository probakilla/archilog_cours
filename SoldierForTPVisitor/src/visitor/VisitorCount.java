package visitor;

import java.util.Iterator;

import soldier.core.Unit;
import soldier.core.UnitGroup;
import soldier.core.UnitInfantry;
import soldier.core.UnitRider;

public class VisitorCount extends AbstractVisitor
{
	private int m_count = 0;
	
	@Override
	public void visit(UnitGroup group)
	{
		for (Iterator<Unit> it = group.subUnits();it.hasNext();it.next())
		{
			if (it instanceof UnitRider)
				visit ((UnitRider)it);
			else if (it instanceof UnitInfantry)
				visit ((UnitInfantry)it);
			else
				visit ((UnitGroup)it);
		}
	}

	@Override
	public void visit(UnitInfantry infantry)
	{
		++m_count;
	}

	@Override
	public void visit(UnitRider rider)
	{
		++m_count;
	}

	public int getCount ()
	{
		return m_count;
	}
}
