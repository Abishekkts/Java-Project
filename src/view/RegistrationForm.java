package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JTextField;

import controller.EmployeeController;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class RegistrationForm {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_5;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_3;
	private static EmployeeController employeecontroller=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationForm window = new RegistrationForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Initialize the contents of the frame.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	private void RegistrationForm() throws ClassNotFoundException, SQLException {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 51, 102));
		frame.setBounds(100, 100, 615, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblRegistrationForm = new JLabel("Registration Form");
		lblRegistrationForm.setForeground(new Color(255, 255, 255));
		lblRegistrationForm.setBackground(new Color(255, 255, 255));
		lblRegistrationForm.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblRegistrationForm.setBounds(219, 11, 197, 35);
		frame.getContentPane().add(lblRegistrationForm);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Calibri", Font.PLAIN, 13));
		lblFirstName.setForeground(new Color(255, 255, 255));
		lblFirstName.setBounds(30, 62, 119, 27);
		frame.getContentPane().add(lblFirstName);
		
		textField = new JTextField();
		textField.setBounds(30, 86, 145, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Calibri", Font.PLAIN, 13));
		lblLastName.setForeground(new Color(255, 255, 255));
		lblLastName.setBounds(219, 62, 155, 23);
		frame.getContentPane().add(lblLastName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(219, 86, 155, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblUserID = new JLabel("User ID");
		lblUserID.setFont(new Font("Calibri", Font.PLAIN, 13));
		lblUserID.setForeground(new Color(255, 255, 255));
		lblUserID.setBounds(30, 127, 79, 14);
		frame.getContentPane().add(lblUserID);
		
		textField_2 = new JTextField();
		textField_2.setBounds(30, 144, 145, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCreatePassword = new JLabel("Create Password");
		lblCreatePassword.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblCreatePassword.setForeground(new Color(255, 255, 255));
		lblCreatePassword.setBounds(30, 185, 103, 14);
		frame.getContentPane().add(lblCreatePassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblConfirmPassword.setForeground(new Color(255, 255, 255));
		lblConfirmPassword.setBounds(219, 179, 116, 27);
		frame.getContentPane().add(lblConfirmPassword);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblGender.setForeground(new Color(255, 255, 255));
		lblGender.setBounds(30, 254, 46, 14);
		frame.getContentPane().add(lblGender);
		
		JLabel lblRole = new JLabel("Role");
		lblRole.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblRole.setForeground(new Color(255, 255, 255));
		lblRole.setBounds(30, 323, 46, 14);
		frame.getContentPane().add(lblRole);
		
		textField_5 = new JTextField();
		textField_5.setBounds(30, 348, 145, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		employeecontroller=new EmployeeController();
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String UFN, ULN, UID, UP, UCP, UG, UR;
				UFN = textField.getText();
				ULN =textField_1.getText();
				UID = textField_2.getText();
				UP = new String(passwordField.getPassword());
				UG = textField_3.getText();
				UR = textField_5.getText();
				UCP = new String(passwordField_1.getPassword());
				
				if(UP.equals(UCP)) {
					employeecontroller.addEmployee(UFN,ULN,UID,UP,UG,UR);		
					//Values Added to Controller
					JOptionPane.showMessageDialog(frame,"Registered Succesfully");
					frame.dispose();
					try {
					   new LoginFrame();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}
					else {
					JOptionPane.showMessageDialog(frame, "Check your Password and Retry ..!");
				}
			}
		});
		btnSubmit.setForeground(new Color(0, 51, 102));
		btnSubmit.setFont(new Font("Lucida Fax", Font.BOLD, 14));
		btnSubmit.setBounds(232, 411, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(30, 210, 145, 20);
		frame.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(219, 210, 155, 20);
		frame.getContentPane().add(passwordField_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(30, 279, 145, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
	}
	public RegistrationForm() throws ClassNotFoundException, SQLException {
		RegistrationForm();
	}
}
