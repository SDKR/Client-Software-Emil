import java.sql.SQLException;

import GUILogic.Logic;


public class run {

//		Java main method
	public static void main(String[] args) throws SQLException {
		
		try {
//		Application starts by running the GUI 
			Logic GUILogic = new Logic();
			GUILogic.startList();

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
