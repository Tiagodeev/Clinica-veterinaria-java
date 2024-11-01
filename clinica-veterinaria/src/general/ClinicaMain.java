package general;
import java.sql.Connection;
import database.DatabaseConnection;
import view.Menu;

public class ClinicaMain{
	
	public static void main(String[] args) {
		
		Connection connection = DatabaseConnection.getConnection();
		
		Menu view = new Menu();
	    
		view.MenuPrincipal();
		
	}
	
}
