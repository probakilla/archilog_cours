package model;

public class Movie 
{
	public static final Pricing CHILDRENS = new DefaultPricing (1.5, 3, 1.5);
	public static final Pricing REGULAR = new DefaultPricing (2, 2, 1.5);
	public static final Pricing NEW_RELEASE = new NewRelease (0, 0, 3);

	private String _title;
	private Pricing _priceCode;

	public Movie(String title, Pricing priceCode)
	{
		_title = title;
		_priceCode = priceCode;
	}

	public Pricing getPriceCode()
	{
		return _priceCode;
	}

	public void setPriceCode(Pricing priceCode)
	{
		_priceCode = priceCode;
	}

	public String getTitle()
	{
		return _title;
	}
}
