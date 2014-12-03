package GUILogic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import connections.ServerManager;
import GUI.ContainerPanel;
import GUI.MainMenu;
import connections.ServerManager;

public class Logic {
	ServerManager SM = new ServerManager();
	private ContainerPanel CP;
	private GUI.CreateEvent CE;
	
	
	private String EmailKeeper;
	private String PassKeeper;
	private int AdminIntKeeper; /* skal m�ske bruges senere */
	
	public Logic() throws SQLException {
		CP = new ContainerPanel();
		initializeListeners();
	}
	
//	Starts GUI 
	public void startList() {
		CP.show(ContainerPanel.loginScreen);
		CP.setVisible(true);
	}
	
//	Login function and error message
	private class login implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String emailInput = CP.getLI().getTextFieldEmail().getText();
			String passwordInput = CP.getLI().getTextFieldPassword().getText();
			if(SM.userChecker(emailInput, passwordInput).equals("1"))
			{
				System.out.println("S� langt s� godt");
				CP.show(ContainerPanel.mainMenu);
				CP.getMM().getWeatherbox().setText(SM.weatherCheck()); /*Weather from server*/
				CP.getMM().getQOTDtxt().setText(SM.quoteCheck()); /*QOTD from server*/
				
			}
			else
			{
				JOptionPane.showMessageDialog (null, "You have entered an incorrect username or password", "Information", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	
	private class LogOff implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			CP.show(ContainerPanel.loginScreen);
		
		}}
		
	private class CreateEvent implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			CP.show(ContainerPanel.createevent);
		}
	}
	

	private void initializeListeners() {
		CP.getLI().addActionListenerLoginScreen(new login());
		CP.getMM().addActionListenerLogOff(new LogOff());
		CP.getMM().addActionListenerCreateEvent(new CreateEvent());
		
	}
	
}

