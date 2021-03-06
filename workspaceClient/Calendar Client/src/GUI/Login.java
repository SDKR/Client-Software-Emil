package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.SwingConstants;

import java.awt.Dimension;

import javax.swing.JTextPane;

//Initialize buttons, textfields, and so on.
	public class Login extends JPanel {
		JLabel lblJegErLogin = new JLabel("Login here:\r\n");
		JLabel lblWelcomeToThe = new JLabel("Welcome to your calendar");
		
		private JPasswordField PasswordIn = new JPasswordField();
		private JTextField EmailIn = new JTextField();
		private JButton btnLogin = new JButton("Login");
		private final JLabel background = new JLabel("");

		
//		The panel itself
		
		public Login() {
			setLayout(null);
			setPreferredSize(new Dimension(1366, 768));
			
//			Login label
			lblJegErLogin.setFont(new Font("Tahoma", Font.BOLD, 34));
			lblJegErLogin.setBounds(587, 286, 192, 41);
			add(lblJegErLogin);
			
//			Welcome label
			lblWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD, 34));
			lblWelcomeToThe.setBounds(460, 157, 445, 41);
			add(lblWelcomeToThe);
			
//			Email input
			EmailIn.setBounds(587, 362, 192, 32);
			add(EmailIn);
			EmailIn.setColumns(10);
			
			JLabel lblEmailAddress = new JLabel("Email Address:");
			lblEmailAddress.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblEmailAddress.setBounds(433, 368, 110, 19);
			add(lblEmailAddress);
			
//			Password Input
			PasswordIn.setColumns(10);
			PasswordIn.setBounds(587, 425, 192, 32);
			add(PasswordIn);
			
			JLabel lblPassword = new JLabel("Password:\r\n");
			lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblPassword.setBounds(433, 431, 110, 19);
			add(lblPassword);
			
//			Login button
			btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnLogin.setBounds(623, 492, 119, 41);
			add(btnLogin);
			
			background.setIcon(new ImageIcon(MainMenu.class.getResource("/images/Baggrund client.jpg")));
			background.setBounds(0, 0, 1366, 768);
			add(background);
			
		}
		
//		Action listener
		public void addActionListenerLoginScreen(ActionListener l){
			btnLogin.addActionListener(l);
		}

//		Getters
		public JButton getBtnLogIn() {
			return btnLogin;
		}

		public JTextField getTextFieldEmail() {
			return EmailIn;
		}

		public JPasswordField getTextFieldPassword() {
			return PasswordIn;
		}
		
}
