package model;

public interface Builder
{
	public void beginDocument ();
	public void addNewLine ();
	public void addTabulation ();
	public void addName (String name);
	public void addMovie (Rental rent);
	public void addTotalAmount (String totalAmount);
	public void addTotalRenterPoints (String totalRenterPoints);
	public void endDocument ();
}