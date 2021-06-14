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

public class DeactivateJob {

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
					 new DeactivateJob();
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
	private void DeactivateJob() throws ClassNotFoundException, SQLException {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 51, 102));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);

		
		JLabel lblDeactivateJob = new JLabel("Deactivate Job");
		lblDeactivateJob.setForeground(new Color(255, 255, 255));
		lblDeactivateJob.setFont(new Font("Arial", Font.BOLD, 17));
		lblDeactivateJob.setBounds(139, 28, 157, 14);
		frame.getContentPane().add(lblDeactivateJob);
		
		JLabel lblEnterJobID = new JLabel("Enter Job ID");
		lblEnterJobID.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblEnterJobID.setForeground(new Color(255, 255, 255));
		lblEnterJobID.setBounds(48, 92, 81, 20);
		frame.getContentPane().add(lblEnterJobID);
		
		textField = new JTextField();
		textField.setBounds(139, 90, 127, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnDeactivate = new JButton("Deactivate");
         jobController=new JobController();
		
         btnDeactivate.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int s;
				s=Integer.parseInt(textField.getText());
				jobController.deactivateJob(s);
			}
			
		});
		btnDeactivate.setFont(new Font("Lucida Fax", Font.BOLD, 12));
		btnDeactivate.setBounds(147, 167, 99, 23);
		frame.getContentPane().add(btnDeactivate);
	}
	public DeactivateJob() throws ClassNotFoundException, SQLException {
		DeactivateJob();
	}

}
