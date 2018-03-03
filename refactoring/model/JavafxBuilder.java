package model;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class JavafxBuilder implements Builder 
{
	Scene _scene;
	GridPane _grid = new GridPane ();
	int _currentRow = 0;
	int _currentCol = 0;
	
	public void beginDocument ()
	{
		
	}
	
	public void addNewLine ()
	{
		_currentRow++;
		_currentCol = 0;
	}

	public void addTabulation ()
	{
		_grid.addColumn(_currentCol++, new Text (""));
	}

	public void addName (String name)
	{
		_grid.addRow(_currentRow, new Text (name));
	}

	public void addMovie (Rental rent)
	{
		_grid.addRow(_currentRow, new Text (rent.getMovie().getTitle()));
		_grid.addRow(_currentRow, 
				new Text (String.valueOf(rent.getMovie().getPriceCode().rentalPrice(rent.getDaysRented()))));
	}

	public void addTotalAmount (String totalAmount)
	{
		_grid.addRow(_currentRow, new Text (totalAmount));		
	}

	public void addTotalRenterPoints (String totalRenterPoints)
	{
		_grid.addRow(_currentRow, new Text (totalRenterPoints));		
	}

	public void endDocument ()
	{
		_scene = new Scene (_grid, 500, 500);		
	}
	
	public Scene getResult ()
	{
		return _scene;
	}
}
