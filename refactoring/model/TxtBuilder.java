package model;

public class TxtBuilder implements Builder
{
	private StringBuffer _result;
	
	public TxtBuilder ()
	{
		_result = new StringBuffer ();
	}

	public void beginDocument () {}
	
	public void addNewLine ()
	{
		_result.append("\n");
	}

	public void addTabulation ()
	{
		_result.append("\t");	
	}

	public void addName (String name)
	{
		_result.append(name);
	}

	public void addMovie (Rental rent)
	{
		_result.append(rent.getMovie().getTitle()+"\t"+
				String.valueOf(rent.getMovie().getPriceCode().rentalPrice(rent.getDaysRented())));
	}

	public void addTotalAmount (String totalAmount)
	{
		_result.append(totalAmount);
	}

	public void addTotalRenterPoints (String totalRenterPoints)
	{
		_result.append(totalRenterPoints);
	}

	public void endDocument () {}
	
	public String getResult ()
	{
		return _result.toString();
	}
}