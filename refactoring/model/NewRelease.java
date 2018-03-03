package model;

public class NewRelease extends DefaultPricing 
{
	public NewRelease (double fee, int bundleDay, double extraFee)
	{
		super(fee, bundleDay, extraFee);
	}
	
	@Override
	public int rentalPoints ()
	{
		return 2;
	}
}
