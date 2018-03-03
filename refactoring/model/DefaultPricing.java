package model;

public class DefaultPricing implements Pricing 
{
	private double _fee, _extraFee;
	private int _bundleDay;
	
	public DefaultPricing (double fee, int bundleDay, double extraFee)
	{
		_fee = fee;
		_bundleDay = bundleDay;
		_extraFee = extraFee;
	}
	
	public double rentalPrice (int daysRented)
	{
		double thisAmount = _fee;
		if (daysRented > _bundleDay)
		{
			thisAmount += (daysRented - _bundleDay) * _extraFee;
		}
		return thisAmount;
	}
	
	public Pricing clone ()
	{
		Object obj = null;
		try 
		{
			obj = super.clone();
		} 
		catch (CloneNotSupportedException e) 
		{
			e.printStackTrace();
		}
		return (Pricing) obj;
	}
	
	public int rentalPoints ()
	{
		return 1;
	}
}
