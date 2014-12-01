package GUI;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class MainMenu extends JPanel {
	private JButton btnFCalendar = new JButton("Full Calendar");
	private JButton btnCreateEvent = new JButton("Create Calendar and Event");
	private JButton btnCreateNote = new JButton("Create Note");
	private JButton btnLogOff = new JButton("Log Off");
	private JButton button_2 = new JButton("New button");
	
		
		public MainMenu() {
			setPreferredSize(new Dimension(1366, 768));
			setLayout(null);
			
			JLabel lblTodaysCalendar = new JLabel("Todays Calendar");
			lblTodaysCalendar.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblTodaysCalendar.setBounds(202, 78, 167, 25);
			add(lblTodaysCalendar);
			
			JLabel lblMenu = new JLabel("Menu");
			lblMenu.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblMenu.setBounds(1100, 78, 62, 25);
			add(lblMenu);
			
//			View entire calendar			
			btnFCalendar.setBounds(1006, 117, 250, 75);
			add(btnFCalendar);
			
//			Create calendar and event
			btnCreateEvent.setBounds(1006, 203, 250, 75);
			add(btnCreateEvent);
			
//			Create Note
			btnCreateNote.setBounds(1006, 289, 250, 75);
			add(btnCreateNote);
			
//			Ekstra knap lige nu 
			button_2.setBounds(1006, 375, 250, 75);
			add(button_2);
			
//			Log Off
			btnLogOff.setBounds(583, 687, 200, 50);
			add(btnLogOff);
			
			JLabel lblTodaysWeather = new JLabel("Todays Weather");
			lblTodaysWeather.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblTodaysWeather.setBounds(599, 78, 167, 25);
			add(lblTodaysWeather);
			
			JLabel lblQuoteOfThe = new JLabel("Quote Of The Day");
			lblQuoteOfThe.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblQuoteOfThe.setBounds(594, 325, 177, 25);
			add(lblQuoteOfThe);
			
			JLabel lblKftHvorEr = new JLabel("K\u00E6ft hvor er det varmt og dejligt.... NOT!?! velkommen til DK\r\nDer er 22 grader i LA lige nu!");
			lblKftHvorEr.setBounds(544, 117, 452, 50);
			add(lblKftHvorEr);
			
			JLabel lblOgHitlerSagde = new JLabel("Og Hitler sagde: kochen Schwanz und essen sie heute Abend");
			lblOgHitlerSagde.setBounds(544, 375, 295, 14);
			add(lblOgHitlerSagde);
			
	}

		public void addActionListenerLoginScreen(ActionListener l){
			btn.addActionListener(l);
		}

		public JButton getBtnFCalendar() {
			return btnFCalendar;
		}


		public JButton getBtnCreateEvent() {
			return btnCreateEvent;
		}


		public JButton getBtnCreateNote() {
			return btnCreateNote;
		}


		public JButton getButton_2() {
			return button_2;
		}
		
		
}
