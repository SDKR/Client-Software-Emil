import java.sql.SQLException;

import GUILogic.Logic;


public class run {

	public static void main(String[] args) throws SQLException {
		
		try {
			
			Logic GUILogic = new Logic();
			GUILogic.startList();

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
