package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JTextField;

import model.Employee;

import javax.swing.JButton;

public class ViewProfile {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	Employee emp = new Employee();

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 new ViewProfile();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Initialize the contents of the frame.
	 */
	private void EmpDetail() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 51, 102));
		frame.setBounds(100, 100, 500, 375);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblEmployeeID = new JLabel("Employee ID");
		lblEmployeeID.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblEmployeeID.setForeground(new Color(255, 255, 255));
		lblEmployeeID.setBounds(29, 42, 88, 14);
		frame.getContentPane().add(lblEmployeeID);
		
		textField = new JTextField(Integer.toString(emp.getEmpId()));
		textField.setBounds(144, 37, 144, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblFirstName.setForeground(new Color(255, 255, 255));
		lblFirstName.setBounds(29, 82, 71, 14);
		frame.getContentPane().add(lblFirstName);
		
		textField_1 = new JTextField(emp.getFirstName());
		textField_1.setBounds(144, 77, 144, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblLastName = new JLabel("LastName");
		lblLastName.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblLastName.setForeground(new Color(255, 255, 255));
		lblLastName.setBounds(29, 128, 88, 14);
		frame.getContentPane().add(lblLastName);
		
		textField_2 = new JTextField(emp.getLastName());
		textField_2.setBounds(144, 123, 144, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setForeground(new Color(255, 255, 255));
		lblGender.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblGender.setBounds(29, 174, 60, 14);
		frame.getContentPane().add(lblGender);
		
		textField_3 = new JTextField(emp.getGender());
		textField_3.setBounds(144, 169, 144, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblRole = new JLabel("Role");
		lblRole.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblRole.setForeground(new Color(255, 255, 255));
		lblRole.setBounds(29, 217, 46, 14);
		frame.getContentPane().add(lblRole);
		
		textField_4 = new JTextField(emp.getRole());
		textField_4.setBounds(144, 212, 144, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Active");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(29, 254, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField_5 = new JTextField(emp.getActive());
		textField_5.setBounds(144, 249, 144, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener () {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			try {
				new EmployeeHomeScreen(emp);
			} catch (ClassNotFoundException | SQLException e1) {
				//TODO Auto-generated catch block
				e1.printStackTrace();			
			}
			
	}
		});
		btnNewButton.setFont(new Font("Lucida Fax", Font.BOLD, 14));
		btnNewButton.setBounds(170, 289, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
	public ViewProfile(Employee emp) {
		this.emp = emp;
		EmpDetail();
	}
}
