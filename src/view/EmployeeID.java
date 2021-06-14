package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ModuleLayer.Controller;
import java.sql.SQLException;
import java.awt.Color;
import javax.swing.JTextField;

import controller.EmployeeController;

import javax.swing.JButton;

public class EmployeeID {

	private JFrame frame;
	private JTextField textField;
	EmployeeController employeecontroller;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 new EmployeeID();
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
	private void EmployeeID() throws ClassNotFoundException, SQLException {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 51, 102));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblEmployeeID = new JLabel("Employee ID");
		lblEmployeeID.setForeground(new Color(255, 255, 255));
		lblEmployeeID.setFont(new Font("Arial", Font.BOLD, 15));
		lblEmployeeID.setBounds(150, 27, 138, 14);
		frame.getContentPane().add(lblEmployeeID);
		
		JLabel lblEnterEmployeeID = new JLabel("Enter Employee ID");
		lblEnterEmployeeID.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblEnterEmployeeID.setForeground(new Color(255, 255, 255));
		lblEnterEmployeeID.setBounds(34, 102, 116, 14);
		frame.getContentPane().add(lblEnterEmployeeID);
		
		textField = new JTextField();
		textField.setBounds(187, 97, 138, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		employeecontroller=new EmployeeController();
		btnSubmit.setFont(new Font("Lucida Fax", Font.BOLD, 13));
	    btnSubmit.setBounds(150, 167, 89, 23);
	    frame.getContentPane().add(btnSubmit);
		btnSubmit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int EID;
				EID = Integer.parseInt(textField.getText());
			   employeecontroller.getEmployeeById(EID);
			}
			
		});
	}

			
	public EmployeeID() throws ClassNotFoundException, SQLException {
		EmployeeID();
	}
}
