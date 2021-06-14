package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.JobController;

import javax.swing.JButton;

public class AddJob {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private static JobController jobcontroller;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 new AddJob();
					
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
	private void AddJob() throws ClassNotFoundException, SQLException {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Arial", Font.BOLD, 15));
		frame.getContentPane().setBackground(new Color(0, 51, 102));
		frame.setBounds(100, 100, 450, 435);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblAddJob = new JLabel("Add Job");
		lblAddJob.setFont(new Font("Arial", Font.BOLD, 17));
		lblAddJob.setForeground(new Color(255, 255, 255));
		lblAddJob.setBounds(167, 24, 114, 14);
		frame.getContentPane().add(lblAddJob);
		
		JLabel lblJobTitle = new JLabel("Job Title");
		lblJobTitle.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblJobTitle.setForeground(new Color(255, 255, 255));
		lblJobTitle.setBounds(50, 82, 74, 20);
		frame.getContentPane().add(lblJobTitle);
		
		JLabel lblJobDescription = new JLabel("Job Description");
		lblJobDescription.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblJobDescription.setForeground(new Color(255, 255, 255));
		lblJobDescription.setBounds(50, 125, 85, 14);
		frame.getContentPane().add(lblJobDescription);
		
		textField = new JTextField();
		textField.setBounds(168, 80, 125, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(167, 120, 126, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCompanyName = new JLabel("Company Name");
		lblCompanyName.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblCompanyName.setForeground(new Color(255, 255, 255));
		lblCompanyName.setBounds(50, 149, 98, 40);
		frame.getContentPane().add(lblCompanyName);
		
		textField_2 = new JTextField();
		textField_2.setBounds(168, 157, 125, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblLocation.setForeground(new Color(255, 255, 255));
		lblLocation.setBounds(50, 200, 64, 14);
		frame.getContentPane().add(lblLocation);
		
		textField_3 = new JTextField();
		textField_3.setBounds(167, 195, 126, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblKeySkill = new JLabel("Key Skill");
		lblKeySkill.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblKeySkill.setForeground(new Color(255, 255, 255));
		lblKeySkill.setBounds(50, 241, 46, 14);
		frame.getContentPane().add(lblKeySkill);
		
		textField_4 = new JTextField();
		textField_4.setBounds(167, 236, 126, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblSalary.setForeground(new Color(255, 255, 255));
		lblSalary.setBounds(50, 285, 46, 14);
		frame.getContentPane().add(lblSalary);
		
		textField_5 = new JTextField();
		textField_5.setBounds(167, 280, 126, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		jobcontroller = new JobController();
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String j1,j2,j3,j4,j5,j6;
				j1=textField.getText();
				j2=textField_1.getText();
				j3=textField_2.getText();
				j4=textField_3.getText();
				j5=textField_4.getText();
				j6=textField_5.getText();
				jobcontroller.addJob(j1,j2,j3,j4,j5,j6);
				frame=new JFrame();
				JOptionPane.showMessageDialog(frame,"Job Added");
			}
			
		});
		btnSubmit.setFont(new Font("Lucida Fax", Font.BOLD, 13));
		btnSubmit.setBounds(167, 336, 89, 23);
		frame.getContentPane().add(btnSubmit);
	}
	public AddJob() throws ClassNotFoundException, SQLException {
		AddJob();
	}

}
