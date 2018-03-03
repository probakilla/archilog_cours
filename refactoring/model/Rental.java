package model;

public class Rental 
{
	private Movie _movie;
	private int _daysRented;
	private Pricing _pricing;

	public Rental(Movie movie, int daysRented)
	{
		_movie = movie;
		_daysRented = daysRented;
		_pricing = _movie.getPriceCode().clone();
	}
	
	public int getDaysRented()
	{
		return _daysRented; 
	}
	
	public Movie getMovie()
	{
		return _movie;
	}

	public Pricing getPricing ()
	{
		return _pricing;
	}
}