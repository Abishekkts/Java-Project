package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JTextField;

import controller.EmployeeController;

import javax.swing.JRadioButton;
import javax.swing.JButton;

public class ActivateEmployee {

	private JFrame frame;
	private JTextField textField;
	private EmployeeController employeecontroller;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 new ActivateEmployee();
			
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
	private void ActivateEmployee() throws ClassNotFoundException, SQLException {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 51, 102));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblActivateEmployee = new JLabel("Activate Employee");
		lblActivateEmployee.setFont(new Font("Arial", Font.BOLD, 17));
		lblActivateEmployee.setForeground(new Color(255, 255, 255));
		lblActivateEmployee.setBounds(126, 24, 149, 21);
		frame.getContentPane().add(lblActivateEmployee);
		
		JLabel lblEmployeeID = new JLabel("Enter Employee ID");
		lblEmployeeID.setForeground(new Color(255, 255, 255));
		lblEmployeeID.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblEmployeeID.setBounds(22, 80, 105, 14);
		frame.getContentPane().add(lblEmployeeID);
		
		textField = new JTextField();
		textField.setBounds(169, 75, 118, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnActivate = new JButton("Activate");
		employeecontroller = new EmployeeController();
		btnActivate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String UID;
				//JFrame j= new JFrame();
				UID = textField.getText();
				 employeecontroller.activateEmployee(UID);
				JOptionPane.showMessageDialog(frame,"Activated Succesfully");
				frame.dispose();
				
			}

			});
		
		btnActivate.setFont(new Font("Arial", Font.BOLD, 13));
		btnActivate.setBounds(137, 137, 89, 23);
		frame.getContentPane().add(btnActivate);
	}
	public ActivateEmployee() throws ClassNotFoundException, SQLException {
		ActivateEmployee();
	}
}
