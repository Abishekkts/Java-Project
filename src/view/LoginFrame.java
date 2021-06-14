package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JTextField;

import controller.EmployeeController;
import model.Employee;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Color;

public class LoginFrame {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private EmployeeController EmployeeController;
	private controller.EmployeeController empController;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				 new LoginFrame();
				    
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
	private void LoginFrame() throws ClassNotFoundException, SQLException {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setBackground(new Color(0, 51, 102));
		frame.setBounds(100, 100, 439, 307);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblUserName = new JLabel("UserName");
		lblUserName.setBackground(Color.WHITE);
		lblUserName.setForeground(Color.WHITE);
		lblUserName.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblUserName.setBounds(24, 75, 110, 14);
		frame.getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblPassword.setBounds(24, 131, 95, 14);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(165, 70, 166, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		empController = new EmployeeController();
		//Event handling for Login button
		btnLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String userId,password;
				Employee emp=new Employee();
				
				userId=textField.getText();
				
				password=new String(passwordField.getPassword());
				emp=empController.checkLogin(userId, password);
				if(emp.getUserId()==null || emp.getPassword()==null) {
					JFrame f=new JFrame();
					JOptionPane.showMessageDialog(f,"You are not authorized user! Retry or Register!");
				}
				else {
					if(emp.getActive().equals("yes")) {
						if(emp.getRole().equals("HRA")) {
							new HRAPortal();
						}
						else if(emp.getRole().equals("PME")) {
							new PMEPortal();
						}
						else {
							try {
								new EmployeeHomeScreen(emp);
							} catch (ClassNotFoundException | SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
					else {
						JFrame f=new JFrame();
						JOptionPane.showMessageDialog(f,"User not activated !...");
					}
				}	
			}
		});
				
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		btnLogin.setBackground(new Color(255, 255, 255));
		btnLogin.setForeground(new Color(0, 0, 0));
		btnLogin.setFont(new Font("Lucida Fax", Font.BOLD, 15));
		btnLogin.setBounds(67, 198, 110, 23);
		frame.getContentPane().add(btnLogin);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(new Color(0, 0, 0));
		passwordField.setBackground(Color.WHITE);
		passwordField.setBounds(165, 126, 166, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblLoginForm = new JLabel("LoginForm");
		lblLoginForm.setForeground(new Color(255, 255, 255));
		lblLoginForm.setFont(new Font("Arial", Font.BOLD, 18));
		lblLoginForm.setBounds(158, 11, 149, 20);
		frame.getContentPane().add(lblLoginForm); 
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					new RegistrationForm();
				} catch (ClassNotFoundException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				} catch (SQLException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
				
			}
			
		});
		btnRegister.setFont(new Font("Lucida Fax", Font.BOLD, 14));
		btnRegister.setBounds(221, 197, 110, 25);
		frame.getContentPane().add(btnRegister);
	}
	public LoginFrame() throws ClassNotFoundException, SQLException {
		LoginFrame();
	}
}
