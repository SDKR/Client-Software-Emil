package GUILogic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import connections.ServerManager;
import GUI.ContainerPanel;
import GUI.MainMenu;
import connections.ServerManager;
import GUI.CreateEvent;

public class Logic {
	ServerManager SM = new ServerManager();
	private ContainerPanel CP;
	private CreateEvent CE;
	
	
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
				CP.show(ContainerPanel.mainMenu); 	/*Show main menu*/
				CP.getMM().getWeatherbox().setText(SM.weatherCheck()); /*Weather from server*/
				CP.getMM().getQOTDtxt().setText(SM.quoteCheck()); /*QOTD from server*/
				
			}
			else
			{
				JOptionPane.showMessageDialog (null, "You have entered an incorrect username or password", "Information", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	
//	LogOff button
	private class LogOff implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			CP.show(ContainerPanel.loginScreen);
		
		}}
		
//	Create Eventmenu button
	private class Event implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			CP.show(ContainerPanel.createevent);
			setComboDates();
		}
	}
	
//	Logic for the comboboxes in createEvent
	public void setComboDates() {
		for (int yCount = 2014; yCount < 2038; yCount++) {

			CP.getCE().getStartYear().addItem(yCount);
			CP.getCE().getEndYear().addItem(yCount);
		}
		for (int moCount = 1; moCount < 13; moCount++) {
			CP.getCE().getStartMonth().addItem(moCount);
			CP.getCE().getEndMonth().addItem(moCount);
		}
		for (int dCount = 1; dCount < 32; dCount++) {
			CP.getCE().getStartDay().addItem(dCount);
			CP.getCE().getEndDay().addItem(dCount);
		}
		for (int hCount = 1; hCount < 25; hCount++) {
			CP.getCE().getStartHour().addItem(hCount);
			CP.getCE().getEndhour().addItem(hCount);
		}
		for (int miCount = 1; miCount < 60; miCount++) {
			CP.getCE().getStartMinute().addItem(miCount);
			CP.getCE().getEndMinute().addItem(miCount);
		}
	}
	
//	Create event logic
	private class createEvent implements ActionListener{
		public void actionPerformed(ActionEvent e){
	
			String eventName = CP.getCE().getNameField().getText();
			String eventLocation = CP.getCE().getTxtChooseLocation().getText();
			String eventInfo = CP.getCE().getInfoBox().getText();
			String eventTypeCombo = CP.getCE().getTypeCombo().getSelectedItem()
					.toString();
			String startYear = CP.getCE().getStartYear().getSelectedItem()
					.toString();
			String startMonth = CP.getCE().getStartMonth().getSelectedItem()
					.toString();
			String startDay = CP.getCE().getStartDay().getSelectedItem()
					.toString();
			String startHour = CP.getCE().getStartHour().getSelectedItem()
					.toString();
			String startMinute = CP.getCE().getStartMinute().getSelectedItem()
					.toString();
			String endYear = CP.getCE().getEndYear().getSelectedItem()
					.toString();
			String endMonth = CP.getCE().getEndMonth().getSelectedItem()
					.toString();
			String endDay = CP.getCE().getEndDay().getSelectedItem().toString();
			String endHour = CP.getCE().getEndhour().getSelectedItem()
					.toString();
			String endMinute = CP.getCE().getEndMinute().getSelectedItem()
					.toString();
			String Calendar = CP.getCE().getCalendarCombo().getSelectedItem()
					.toString();
			
			String checkJson = SM.createEvent(eventName, eventLocation, eventInfo, eventTypeCombo, startYear, startMonth, startDay, startHour, startMinute, endYear, endMonth, endDay, endHour, endMinute, Calendar);
			
			JOptionPane.showMessageDialog(null, checkJson);
		}
	}
	

	private void initializeListeners() {
		CP.getLI().addActionListenerLoginScreen(new login());
		CP.getMM().addActionListenerLogOff(new LogOff());
		CP.getMM().addActionListenerCreateEvent(new Event());
		CP.getCE().createEventListener(new createEvent());
		
	}

	
}

