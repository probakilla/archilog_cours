package model;
import java.util.*;

import javafx.scene.Scene;

public class Customer
{
	private String _name;
	private Vector<Rental> _rentals = new Vector<Rental>();

	public Customer(String name)
	{
		_name = name;
	}

	public void addRental(Rental rental)
	{
		_rentals.addElement(rental);
	}

	public String getName()
	{
		return _name;
	}

	private int totalRenterPoints ()
	{
		int totalRenterPoints = 0;
		for (Rental rent : _rentals)
			totalRenterPoints += rent.getMovie().getPriceCode().rentalPoints();
		return totalRenterPoints;

	}

	private double totalAmount ()
	{
		double totalAmount = 0;
		for (Rental rent : _rentals)
			totalAmount += rent.getMovie().getPriceCode().rentalPrice(rent.getDaysRented());
		return totalAmount;
	}
	
	private Builder statementBuilder (Builder builder)
	{
		builder.beginDocument();
		builder.addName("Rental Record for " +  _name);
		builder.addNewLine();
		for (Rental rent : _rentals)
		{
			builder.addTabulation();
			builder.addMovie(rent);
			builder.addNewLine();
		}
		builder.addTotalAmount("Amount owned is " + String.valueOf(totalAmount()));
		builder.addNewLine();
		builder.addTotalRenterPoints("You earned " + String.valueOf(totalRenterPoints()) + " frequent renter points");
		builder.endDocument();
		return builder;
	}
	
	public String statement ()
	{		
		TxtBuilder builder = (TxtBuilder) statementBuilder (new TxtBuilder ());
		return builder.getResult();
	}
	
	public Scene statementScene ()
	{
		JavafxBuilder builder =
				(JavafxBuilder) statementBuilder (new JavafxBuilder ());
		return builder.getResult();
	}
}