package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JTextField;

import controller.JobController;

import javax.swing.JButton;

public class ActJob {

	private JFrame frame;
	private JTextField textField;
	JobController jobController=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 new ActJob();
					
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
	private void ActJob() throws ClassNotFoundException, SQLException {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 51, 102));
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblActivateJob = new JLabel("Activate Job");
		lblActivateJob.setFont(new Font("Arial", Font.BOLD, 18));
		lblActivateJob.setForeground(new Color(255, 255, 255));
		lblActivateJob.setBounds(156, 23, 129, 14);
		frame.getContentPane().add(lblActivateJob);
		
		JLabel lblJobID = new JLabel("Enter the Job ID");
		lblJobID.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblJobID.setForeground(new Color(255, 255, 255));
		lblJobID.setBounds(34, 90, 121, 24);
		frame.getContentPane().add(lblJobID);
		
		textField = new JTextField();
		textField.setBounds(162, 90, 129, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnActivate = new JButton("Activate");
        jobController=new JobController();
		
        btnActivate.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int s;
				s=Integer.parseInt(textField.getText());
				jobController.activateJob(s);
			}
			
		});
		btnActivate.setFont(new Font("Lucida Fax", Font.BOLD, 13));
		btnActivate.setBounds(156, 171, 91, 23);
		frame.getContentPane().add(btnActivate);
	}
	public ActJob() throws ClassNotFoundException, SQLException {
		ActJob();
	}

}
