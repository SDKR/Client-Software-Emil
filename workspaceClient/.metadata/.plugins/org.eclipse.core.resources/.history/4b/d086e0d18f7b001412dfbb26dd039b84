package GUI;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class MainMenu extends JPanel {
	private JButton btnFCalendar = new JButton("Full Calendar");
	private JButton btnCreateEvent = new JButton("Create Calendar and Event");
	private JButton btnCreateNote = new JButton("Create Note");
	private JButton btnLogOff = new JButton("LogOff");
	private JButton button_2 = new JButton("New button");
	private JTextField weatherbox = new JTextField();
	private JTextField QOTDtxt = new JTextField();
	private final JTable dayTable = new JTable();
	private final JScrollPane scrollPane = new JScrollPane();
	private final JScrollPane scrollPane_1 = new JScrollPane();
	
		
		public MainMenu() {
			setPreferredSize(new Dimension(1366, 768));
			setLayout(null);
			
//			Panel for daily activities
			
			scrollPane.setBounds(12, 147, 800, 608);
			add(scrollPane);
			dayTable.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
				},
				new String[] {
					"CustomID", "New column", "New column", "New column", "New column"
				}
			));
			
			scrollPane.setViewportView(dayTable);
			scrollPane_1.setBounds(608, 274, 746, 481);
			
			JLabel lblTodaysCalendar = new JLabel("Todays Calendar");
			lblTodaysCalendar.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblTodaysCalendar.setBounds(324, 66, 167, 25);
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
			btnLogOff.setBounds(1006, 461, 250, 75);
			add(btnLogOff);
			
			JLabel lblTodaysWeather = new JLabel("Todays Weather");
			lblTodaysWeather.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblTodaysWeather.setBounds(1053, 678, 167, 25);
			add(lblTodaysWeather);
			
//			Textbox for weather
			weatherbox.setBounds(1006, 714, 250, 20);
			add(weatherbox);
			weatherbox.setColumns(10);
			
			JLabel lblQuoteOfThe = new JLabel("Quote Of The Day");
			lblQuoteOfThe.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblQuoteOfThe.setBounds(1043, 547, 177, 25);
			add(lblQuoteOfThe);
			
//			Textbox for quote of the day
			QOTDtxt.setBounds(1006, 583, 250, 75);
			add(QOTDtxt);
			QOTDtxt.setColumns(10);
			
	}
		
//		Action listeners
		public void addActionListenerLogOff(ActionListener l){
			btnLogOff.addActionListener(l);
		}
		
		public void addActionListenerCreateEvent(ActionListener l){
			btnCreateEvent.addActionListener(l);
		}
		
		
//		Getters and setters
		public JTextField getWeatherbox() {
			return weatherbox;
		}

		public void setWeatherbox(JTextField weatherbox) {
			this.weatherbox = weatherbox;
		}

		public JButton getBtnLogOff() {
			return btnLogOff;
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

		public JTextField getQOTDtxt() {
			return QOTDtxt;
		}

		public void setQOTDtxt(JTextField qOTDtxt) {
			QOTDtxt = qOTDtxt;
		}
		
		public JTable getDayTable() {
			return dayTable;
		}
}
