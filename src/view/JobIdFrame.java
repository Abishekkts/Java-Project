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
import controller.JobController;

import javax.swing.JButton;

public class JobIdFrame {

	private JFrame frame;
	private JTextField textField;
    JobController jobcontroller;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 new JobIdFrame();
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
	private void JobID() throws ClassNotFoundException, SQLException {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 51, 102));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblJobID = new JLabel("Job ID");
		lblJobID.setForeground(new Color(255, 255, 255));
		lblJobID.setFont(new Font("Arial", Font.BOLD, 15));
		lblJobID.setBounds(150, 27, 138, 14);
		frame.getContentPane().add(lblJobID);
		
		JLabel lblEnteJobID = new JLabel("Enter Job ID");
		lblEnteJobID.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblEnteJobID.setForeground(new Color(255, 255, 255));
		lblEnteJobID.setBounds(34, 102, 116, 14);
		frame.getContentPane().add(lblEnteJobID);
		
		textField = new JTextField();
		textField.setBounds(187, 97, 138, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		jobcontroller=new JobController();
		btnSubmit.setFont(new Font("Lucida Fax", Font.BOLD, 13));
	    btnSubmit.setBounds(150, 167, 89, 23);
	    frame.getContentPane().add(btnSubmit);
		btnSubmit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int JID;
				JID = Integer.parseInt(textField.getText());
			   jobcontroller.getJobById(JID);
			}
			
		});
	}

			
	public JobIdFrame() throws ClassNotFoundException, SQLException {
		JobID();
	}
}
