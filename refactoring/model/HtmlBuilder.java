package model;

public class HtmlBuilder implements Builder
{
	private StringBuffer _result;
	
	public HtmlBuilder ()
	{
		_result = new StringBuffer ();
	}
	
	public void beginDocument ()
	{
		_result.append("<HTML><BODY><BR>");
	}
	
	public void addNewLine ()
	{
		_result.append("<BR>");		
	}

	public void addTabulation ()
	{
		_result.append("<DT>");
	}

	public void addName (String name)
	{
		_result.append(name);
	}

	public void addMovie (Rental rent)
	{
		_result.append(rent.getMovie().getTitle()+"<DT>"+
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

	public void endDocument ()
	{
		_result.append("<BR></BODY></HTML>");
	}

	public String getResult ()
	{
		return _result.toString();
	}

}