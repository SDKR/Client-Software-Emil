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
import javax.swing.SwingConstants;

public class MainMenu extends JPanel {
	private JButton btnFCalendar = new JButton("Your Week");
	private JButton btnCreateEvent = new JButton("Create Calendar and Event");
	private JButton btnCreateNote = new JButton("Create Note");
	private JButton btnLogOff = new JButton("LogOff");
	private JButton btnCalendarFunctions = new JButton("Calendar Functions");
	private final JTable dayTable = new JTable();
	private final JScrollPane scrollPane = new JScrollPane();
	private final JScrollPane scrollPane_1 = new JScrollPane();
	private JLabel lblQotdtxt = new JLabel("");
	private JLabel lblQotdtxt_1 = new JLabel("");
	private JLabel lblQotdtxt_2 = new JLabel("");
	private JLabel lblQotdtxt_3 = new JLabel("");
	private final JLabel lblAuthor = new JLabel("Author:");
	private JLabel lblweatherDeg = new JLabel("deg");
	private JLabel lblweatherDesc = new JLabel("daec");
	private JLabel lblweatherDate = new JLabel("date");
	private final JLabel lblGrader = new JLabel("Grader:");
	private final JLabel lblVejr = new JLabel("Vejr:");
	private final JLabel lblDato = new JLabel("Dato:");
		
		public MainMenu() {
			setPreferredSize(new Dimension(1366, 768));
			setLayout(null);
			
//			Panel for daily activities
			
			scrollPane.setBounds(10, 71, 801, 637);
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
			lblTodaysCalendar.setBounds(325, 35, 167, 25);
			add(lblTodaysCalendar);
			
			JLabel lblMenu = new JLabel("Menu");
			lblMenu.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblMenu.setBounds(1100, 35, 62, 25);
			add(lblMenu);
			
//			View entire calendar (Your week)			
			btnFCalendar.setBounds(1006, 71, 250, 75);
			add(btnFCalendar);
			
//			Create calendar and event
			btnCreateEvent.setBounds(1006, 157, 250, 75);
			add(btnCreateEvent);
			
//			Create Note
			btnCreateNote.setBounds(1006, 243, 250, 75);
			add(btnCreateNote);
			
//			Calendar functions
			btnCalendarFunctions.setBounds(1006, 329, 250, 75);
			add(btnCalendarFunctions);
			
//			Log Off
			btnLogOff.setBounds(1006, 415, 250, 75);
			add(btnLogOff);
			
			JLabel lblTodaysWeather = new JLabel("Todays Weather");
			lblTodaysWeather.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblTodaysWeather.setBounds(1053, 610, 167, 25);
			add(lblTodaysWeather);
			
			JLabel lblQuoteOfThe = new JLabel("Quote Of The Day");
			lblQuoteOfThe.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblQuoteOfThe.setBounds(1043, 501, 177, 25);
			add(lblQuoteOfThe);
			
//			4 JLabels to hold QOTD
			lblQotdtxt.setBounds(1053, 537, 203, 14);
			add(lblQotdtxt);
			
			lblQotdtxt_1.setBounds(1006, 553, 250, 14);
			add(lblQotdtxt_1);
			
			lblQotdtxt_2.setBounds(1006, 569, 250, 14);
			add(lblQotdtxt_2);
			
			lblQotdtxt_3.setBounds(1006, 585, 250, 14);
			add(lblQotdtxt_3);
			lblAuthor.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblAuthor.setBounds(1006, 537, 46, 14);
			
			add(lblAuthor);
			lblweatherDeg.setBounds(1100, 646, 156, 14);
			
//			3 labels to hold weather
			add(lblweatherDeg);
			lblweatherDesc.setBounds(1100, 666, 156, 14);
			
			add(lblweatherDesc);
			lblweatherDate.setBounds(1100, 686, 156, 14);
			
			add(lblweatherDate);
			lblGrader.setHorizontalAlignment(SwingConstants.RIGHT);
			lblGrader.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblGrader.setBounds(1044, 646, 46, 14);
			
			add(lblGrader);
			lblVejr.setHorizontalAlignment(SwingConstants.RIGHT);
			lblVejr.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblVejr.setBounds(1043, 666, 46, 14);
			
			add(lblVejr);
			lblDato.setHorizontalAlignment(SwingConstants.RIGHT);
			lblDato.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblDato.setBounds(1043, 686, 46, 14);
			
			add(lblDato);
			
	}
		
//		Action listeners
		public void addActionListenerLogOff(ActionListener l){
			btnLogOff.addActionListener(l);
		}
		
		public void addActionListenerCreateEvent(ActionListener l){
			btnCreateEvent.addActionListener(l);
		}
		
		public void addActionListenerWeeklyCalendar(ActionListener l){
			btnFCalendar.addActionListener(l);
		}
		
		public void addActionListenerCalendarFunctions(ActionListener l){
			btnCalendarFunctions.addActionListener(l);
		}
		
		
//		Getters and setters

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


		public JButton getCalendarFunctions() {
			return btnCalendarFunctions;
		}
		
		public JTable getDayTable() {
			return dayTable;
		}

		public JLabel getLblQotdtxt() {
			return lblQotdtxt;
		}

		public void setLblQotdtxt(JLabel lblQotdtxt) {
			this.lblQotdtxt = lblQotdtxt;
		}

		public JLabel getLblQotdtxt_1() {
			return lblQotdtxt_1;
		}

		public void setLblQotdtxt_1(JLabel lblQotdtxt_1) {
			this.lblQotdtxt_1 = lblQotdtxt_1;
		}

		public JLabel getLblQotdtxt_2() {
			return lblQotdtxt_2;
		}

		public void setLblQotdtxt_2(JLabel lblQotdtxt_2) {
			this.lblQotdtxt_2 = lblQotdtxt_2;
		}
		
		public JLabel getLblQotdtxt_3() {
			return lblQotdtxt_3;
		}
		
		public void setLblQotdtxt_3(JLabel lblQotdtxt_3) {
			this.lblQotdtxt_3 = lblQotdtxt_3;
		}

		public JLabel getLblweatherDeg() {
			return lblweatherDeg;
		}

		public void setLblweatherDeg(JLabel lblweatherDeg) {
			this.lblweatherDeg = lblweatherDeg;
		}

		public JLabel getLblweatherDesc() {
			return lblweatherDesc;
		}

		public void setLblweatherDesc(JLabel lblweatherDesc) {
			this.lblweatherDesc = lblweatherDesc;
		}

		public JLabel getLblweatherDate() {
			return lblweatherDate;
		}

		public void setLblweatherDate(JLabel lblweatherDate) {
			this.lblweatherDate = lblweatherDate;
		}
		
		
}
