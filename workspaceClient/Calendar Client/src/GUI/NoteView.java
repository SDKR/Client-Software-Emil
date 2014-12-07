package GUI;

import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class NoteView extends JPanel {
	private JButton mainMenuBtn = new JButton("Main Menu");
	private JTextField eventIDField = new JTextField();
	private JTable eventTable = new JTable();
	private JTextArea noteTextArea = new JTextArea();
	private JButton getNoteBtn = new JButton("Get Existing Note");
	private JButton updateNoteBtn = new JButton("Update Note");

	/**
	 * Create the panel.
	 */
	public NoteView() {
		setLayout(null);
		setBounds(0, 0, 1366, 768);
		
		mainMenuBtn.setBounds(1129, 13, 225, 70);
		add(mainMenuBtn);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon(MainMenu.class.getResource("/Images/Baggrund client.jpg")));
		lblBackground.setBounds(0, 0, 1366, 768);
		lblBackground.isForegroundSet();
		
		eventIDField.setBounds(901, 93, 228, 22);
		add(eventIDField);
		eventIDField.setColumns(10);
		
		noteTextArea.setText("Enter note here...");
		noteTextArea.setBounds(826, 159, 300, 229);
		add(noteTextArea);
		
		JLabel lblEventid = new JLabel("EventID* :");
		lblEventid.setBounds(829, 96, 76, 14);
		add(lblEventid);
		
		getNoteBtn.setBounds(826, 121, 129, 25);
		add(getNoteBtn);
		
		updateNoteBtn.setBounds(826, 414, 103, 25);
		updateNoteBtn.setEnabled(false);
		add(updateNoteBtn);
		
		JLabel whiteSpace = new JLabel("");
		whiteSpace.setBounds(714, 80, 349, 387);
		add(whiteSpace);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 13, 763, 742);
		add(scrollPane);
		
		
		eventTable.setModel(new DefaultTableModel(
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
				"Event ID", "Type", "Start", "End", "Name"
			}
		));
		scrollPane.setViewportView(eventTable);
		add(lblBackground);
	}

	public JButton getMainMenuBtn() {
		return mainMenuBtn;
	}
	
	public JTextField getEventIDField() {
		return eventIDField;
	}

	public JTable getEventTable() {
		return eventTable;
	}

	public JTextArea getNoteTextArea() {
		return noteTextArea;
	}

	public JButton getGetNoteBtn() {
		return getNoteBtn;
	}

	public JButton getUpdateNoteBtn() {
		return updateNoteBtn;
	}

	public void mainMenuListener(ActionListener l)
	{
		mainMenuBtn.addActionListener(l);
	}
	public void getNoteListener (ActionListener l)
	{
		getNoteBtn.addActionListener(l);
	}
	public void addNoteListener(ActionListener l)
	{
		updateNoteBtn.addActionListener(l);
	}
}