package GUI;

import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class CalendarFunctions extends JPanel {
	private JTable calendarTable = new JTable();
	private JTextField subscribeField = new JTextField();
	private JButton btnSubscribe = new JButton("Subscribe");
	private JButton btnMainMenu = new JButton("Main Menu");
	private JButton btnCreateCalendar = new JButton("Create Calendar");
	private JButton btnDeleteCalendar = new JButton("Delete Calendar");
	private JTextField createField = new JTextField();
	private JTextField deleteField = new JTextField();
	private JComboBox createCombo = new JComboBox();
	private final JLabel background = new JLabel("");
	private JButton btnUnsubscribe = new JButton("Unsubscribe");
	private JTextField unSubtextField = new JTextField();
	private JTextField calendarField;
	private JTextField usernameField;
	private JButton btnAddUser = new JButton("Add User");

	/**
	 * Create the panel.
	 */
	public CalendarFunctions() {
		setLayout(null);
		setBounds(0, 0, 1366, 768);
		
		/*
		 * Buttons
		 */
		btnMainMenu.setBounds(1129, 9, 225, 70);
		add(btnMainMenu);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 13, 419, 742);
		add(scrollPane);
		
		
		calendarTable.setModel(new DefaultTableModel(
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
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(calendarTable);
		
		JLabel lblSubscribeToCalendar = new JLabel("Subscribe to calendar");
		lblSubscribeToCalendar.setBounds(667, 13, 124, 16);
		add(lblSubscribeToCalendar);
		
		JLabel lblCalendarName = new JLabel("Calendar Name: ");
		lblCalendarName.setBounds(667, 36, 97, 16);
		add(lblCalendarName);
		
		subscribeField.setBounds(776, 33, 116, 22);
		add(subscribeField);
		subscribeField.setColumns(10);
		
		btnSubscribe.setBounds(667, 65, 97, 25);
		add(btnSubscribe);
		
		JLabel lblCreateNewCalender = new JLabel("Create New Calender");
		lblCreateNewCalender.setBounds(667, 167, 122, 16);
		add(lblCreateNewCalender);
		
		JLabel lblNewLabel = new JLabel("Calendar Name:");
		lblNewLabel.setBounds(667, 210, 93, 16);
		add(lblNewLabel);

		createField.setBounds(796, 207, 116, 22);
		add(createField);
		createField.setColumns(10);
		
		JLabel lblPublicOrPrivate = new JLabel("Public or Private");
		lblPublicOrPrivate.setBounds(936, 210, 92, 16);
		add(lblPublicOrPrivate);
		
		createCombo.setModel(new DefaultComboBoxModel(new String[] {"Public", "Private"}));
		createCombo.setBounds(1040, 207, 79, 22);
		add(createCombo);
		
		JLabel lblDeleteCalendar = new JLabel("Delete Calendar");
		lblDeleteCalendar.setBounds(667, 317, 91, 16);
		add(lblDeleteCalendar);
		
		JLabel lblCalendarName_1 = new JLabel("Calendar Name:");
		lblCalendarName_1.setBounds(667, 346, 93, 16);
		add(lblCalendarName_1);
		
		deleteField.setBounds(796, 343, 116, 22);
		add(deleteField);
		deleteField.setColumns(10);	
		
		btnCreateCalendar.setBounds(667, 250, 125, 25);
		add(btnCreateCalendar);	
		
		btnDeleteCalendar.setBounds(667, 388, 123, 25);
		add(btnDeleteCalendar);
		
		JLabel lblUnsubscribeCalendar = new JLabel("Unsubscribe calendar");
		lblUnsubscribeCalendar.setBounds(902, 13, 124, 16);
		add(lblUnsubscribeCalendar);
		
		JLabel label_1 = new JLabel("Calendar Name: ");
		label_1.setBounds(902, 36, 97, 16);
		add(label_1);
		
//		Unsub
		unSubtextField.setColumns(10);
		unSubtextField.setBounds(1011, 33, 116, 22);
		add(unSubtextField);
		
		btnUnsubscribe.setBounds(902, 65, 97, 25);
		add(btnUnsubscribe);
		
		JLabel lblSubscribeUsersTo = new JLabel("Subscribe users to yor Calendar");
		lblSubscribeUsersTo.setBounds(667, 447, 183, 16);
		add(lblSubscribeUsersTo);
		
		JLabel lblCalendar = new JLabel("Calendar:");
		lblCalendar.setBounds(667, 482, 56, 16);
		add(lblCalendar);
		
		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setBounds(874, 482, 67, 16);
		add(lblUsername);
		
		calendarField = new JTextField();
		calendarField.setBounds(734, 479, 116, 22);
		add(calendarField);
		calendarField.setColumns(10);
		
		usernameField = new JTextField();
		usernameField.setBounds(953, 479, 116, 22);
		add(usernameField);
		usernameField.setColumns(10);
		
		btnAddUser.setBounds(667, 511, 97, 25);
		add(btnAddUser);
		
		background.setIcon(new ImageIcon(MainMenu.class.getResource("/images/Baggrund client.jpg")));
		background.setBounds(0, 0, 1366, 768);
		add(background);
	}

	public JButton getBtnUnsubscribe() {
		return btnUnsubscribe;
	}

	public JTextField getUnSubtextField() {
		return unSubtextField;
	}

	public JButton getBtnSubscribe() {
		return btnSubscribe;
	}
	
	public JTextField getSubscribeField() {
		return subscribeField;
	}

	public JButton getBtnMainMenu() {
		return btnMainMenu;
	}

	public JButton getBtnCreateCalendar() {
		return btnCreateCalendar;
	}

	public JButton getBtnDeleteCalendar() {
		return btnDeleteCalendar;
	}

	public JTextField getCreateField() {
		return createField;
	}

	public JTextField getDeleteField() {
		return deleteField;
	}

	public JComboBox getCreateCombo() {
		return createCombo;
	}
	
	public JTable getCalendarTable() {
		return calendarTable;
	}
	public JTextField getCalendarField() {
		return calendarField;
	}

	public JTextField getUsernameField() {
		return usernameField;
	}
	
	public void subscribeListener(ActionListener l)
	{
		btnSubscribe.addActionListener(l);
	}
	public void createCalendarListener (ActionListener l)
	{
		btnCreateCalendar.addActionListener(l);
	}
	public void deleteCalendarListener (ActionListener l)
	{
		btnDeleteCalendar.addActionListener(l);
	}
	public void  goToMainMenu (ActionListener l)
	{
		btnMainMenu.addActionListener(l);
	}
	public void btnUnsubscribeListener (ActionListener l)
	{
		btnUnsubscribe.addActionListener(l);
	}
	public void otherUserSubscribe(ActionListener l)
	{
		btnAddUser.addActionListener(l);
	}
	
}