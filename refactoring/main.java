import javafx.application.Application;
import javafx.stage.Stage;
import model.Customers;
import model.Movie;
import model.Rental;

@SuppressWarnings("deprecation")
public class main extends Application
{
	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		Movie rogueOne = new Movie ("Rogue One", Movie.NEW_RELEASE);
		Movie reine = new Movie ("Reine des neiges", Movie.CHILDRENS);
		Movie starWars = new Movie ("Star Wars III", Movie.REGULAR);

		Customers bob = new Customers("Bob");
		Rental rentRogue = new Rental(rogueOne, 5);
		Rental rentReine = new Rental(reine, 7);
		Rental rentStar = new Rental(starWars, 4);
		
		bob.addRental(rentRogue);
		bob.addRental(rentReine);
		bob.addRental(rentStar);
		
		String statement = bob.statement();
		System.out.println (statement);
		
		primaryStage.setTitle("Statement");
		primaryStage.setScene(bob.statementScene());
		primaryStage.show();
	}
	
	public static void main (String [] args) 
	{
		launch(args);
	}
}
