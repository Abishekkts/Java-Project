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

import javax.swing.JButton;

public class DeactivateEmp {

	private JFrame frame;
	private JTextField textField;
	private EmployeeController EmployeeController;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				 new DeactivateEmp();
			
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
	private void DeactivateEmp() throws ClassNotFoundException, SQLException {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 51, 102));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblDeactivateEmployee = new JLabel("Deactivate Employee");
		lblDeactivateEmployee.setFont(new Font("Arial", Font.BOLD, 17));
		lblDeactivateEmployee.setForeground(new Color(255, 255, 255));
		lblDeactivateEmployee.setBounds(116, 23, 203, 26);
		frame.getContentPane().add(lblDeactivateEmployee);
		
		JLabel lblEmployeeID = new JLabel("Employee ID");
		lblEmployeeID.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblEmployeeID.setForeground(new Color(255, 255, 255));
		lblEmployeeID.setBounds(52, 97, 71, 14);
		frame.getContentPane().add(lblEmployeeID);
		
		textField = new JTextField();
		textField.setBounds(159, 92, 130, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnDeactivate = new JButton("Deactivate");
		EmployeeController  = new EmployeeController();
		btnDeactivate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String UID;
				//JFrame j= new JFrame();
				UID = textField.getText();
				 EmployeeController.DeactivateEmp(UID);
				JOptionPane.showMessageDialog(frame,"Activated Succesfully");
				frame.dispose();
				
			}

			});
		
		btnDeactivate.setFont(new Font("Lucida Fax", Font.BOLD, 12));
		btnDeactivate.setBounds(148, 169, 105, 23);
		frame.getContentPane().add(btnDeactivate);
	}
	public DeactivateEmp() throws ClassNotFoundException, SQLException {
		DeactivateEmp();
	}


}
