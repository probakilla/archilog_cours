package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CustomersTest {
	
	Movie _rogueOne, _reine, _starWars;
	@SuppressWarnings("deprecation")
	Customers _bob;
	Rental _rentRogue, _rentReine, _rentStar;

	@SuppressWarnings("deprecation")
	@Before
	public void setUp() throws Exception 
	{
		_rogueOne = new Movie ("Rogue One", Movie.NEW_RELEASE);
		_reine = new Movie ("Reine des neiges", Movie.CHILDRENS);
		_starWars = new Movie ("Star Wars III", Movie.REGULAR);

		_bob = new Customers("Bob");
		_rentRogue = new Rental(_rogueOne, 5);
		_rentReine = new Rental(_reine, 7);
		_rentStar = new Rental(_starWars, 4);
		
		_bob.addRental(_rentRogue);
		_bob.addRental(_rentReine);
		_bob.addRental(_rentStar);
	}

	@After
	public void tearDown() throws Exception
	{
		_rogueOne = null;
		_reine = null;
		_starWars = null;
		_bob = null;
		_rentRogue = null;
		_rentReine = null;
		_rentStar = null;
	}

	@Test
	public void testStatement() 
	{
		assertEquals("Rental Record for Bob\n" + 
					"	Rogue One	15.0 \n" + 
					"	Reine des neiges	7.5 \n" + 
					"	Star Wars III	5.0 \n" + 
					"Amount owned is 27.5\n" + 
					"You earned 4 frequent renter points", _bob.statement());
	}
}
