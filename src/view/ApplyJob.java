package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ApplyJob {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplyJob window = new ApplyJob();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void ApplyJob() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 51, 102));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblApplyJob = new JLabel("Apply Job");
		lblApplyJob.setFont(new Font("Arial", Font.BOLD, 18));
		lblApplyJob.setForeground(new Color(255, 255, 255));
		lblApplyJob.setBounds(143, 11, 102, 27);
		frame.getContentPane().add(lblApplyJob);
		
		JLabel lblRecruited = new JLabel("Recruited");
		lblRecruited.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblRecruited.setForeground(new Color(255, 255, 255));
		lblRecruited.setBounds(33, 69, 84, 14);
		frame.getContentPane().add(lblRecruited);
		
		textField = new JTextField();
		textField.setBounds(143, 64, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEmployeeID = new JLabel("Employee ID");
		lblEmployeeID.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblEmployeeID.setForeground(new Color(255, 255, 255));
		lblEmployeeID.setBounds(33, 113, 71, 14);
		frame.getContentPane().add(lblEmployeeID);
		
		textField_1 = new JTextField();
		textField_1.setBounds(143, 108, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblJobID = new JLabel("Job ID");
		lblJobID.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblJobID.setForeground(new Color(255, 255, 255));
		lblJobID.setBounds(33, 152, 46, 14);
		frame.getContentPane().add(lblJobID);
		
		textField_2 = new JTextField();
		textField_2.setBounds(143, 147, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Lucida Fax", Font.BOLD, 13));
		btnSubmit.setBounds(140, 199, 89, 23);
		frame.getContentPane().add(btnSubmit);
	}
	public ApplyJob() {
		ApplyJob();
	}

}
