package GUI;

import java.awt.CardLayout;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ContainerPanel extends JFrame {
	public static final String loginScreen = "LoginScreen";
	public static final String mainMenu = "MainMenu";
	public static final String createevent = "CreateEvent";
	public static final String WeeklyCalendar = "WeeklyCalendar";
	public static final String CalendarFunctions = "CalendarFunctions";
	public static final String NoteView = "NoteView";
	
	private static JPanel contentPane;
	CardLayout c;
	
	private Login LI;
	private CreateEvent CE;
	private WeeklyCalendar WC;
	private MainMenu MM;
	private CalendarFunctions CF;
	private NoteView NV;

	
	public ContainerPanel() throws SQLException
	{
		setTitle("Doek Calendar Client");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		setResizable(false);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		c = (CardLayout) getContentPane().getLayout();
		
		LI = new Login();
		contentPane.add(LI,loginScreen);
		
		MM = new MainMenu();
		contentPane.add(MM, mainMenu);
		
		CE = new CreateEvent();
		contentPane.add(CE, createevent);
		
		WC = new WeeklyCalendar();
		contentPane.add(WC, WeeklyCalendar);
		
		CF = new CalendarFunctions();
		contentPane.add(CF, CalendarFunctions);
		
		NV = new NoteView();
		contentPane.add(NV, NoteView);
		
	}
		
	public MainMenu getMM() {
		return MM;
	}
	
	public CreateEvent getCE() {
		return CE;
	}

	public WeeklyCalendar getWC() {
		return WC;
	}
	
	public CalendarFunctions getCF() {
		return CF;
	}
	
	public Login getLI() {
		return LI;
	}
	
	public NoteView getNV() {
		return NV;
	}

	public void show(String card){
		c.show(getContentPane(), card);
	}
}
