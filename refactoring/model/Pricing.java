package model;

public interface Pricing extends Cloneable
{
	public double rentalPrice (int daysRented);
	public int rentalPoints ();
	public Pricing clone ();
}
