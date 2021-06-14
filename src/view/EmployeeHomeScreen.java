package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.SwingConstants;

import model.Employee;

public class EmployeeHomeScreen {

	private JFrame frame;
	Employee emp = new Employee();

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 new EmployeeHomeScreen();
									} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Initialize the contents of the frame.
	 */
	private void Dashboard() {
		frame = new JFrame("Employee Home Screen");
		frame.getContentPane().setBackground(new Color(0, 51, 102));
		frame.setBounds(100, 100, 610, 526);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);

		
		JLabel lblWelcometoyourDashboard = new JLabel("Welcome to your Dashboard ");
		lblWelcometoyourDashboard.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblWelcometoyourDashboard.setForeground(new Color(255, 255, 255));
		lblWelcometoyourDashboard.setBounds(186, 28, 264, 27);
		frame.getContentPane().add(lblWelcometoyourDashboard);
		
		JButton btnViewProfile = new JButton("View Profile");
        btnViewProfile.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				try {
					new ViewProfile(emp);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnViewProfile.setVerticalAlignment(SwingConstants.TOP);
		btnViewProfile.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnViewProfile.setForeground(new Color(0, 0, 0));
		btnViewProfile.setBackground(Color.WHITE);
		btnViewProfile.setBounds(228, 129, 173, 23);
		frame.getContentPane().add(btnViewProfile);
		
		JButton btnUpdateyourProfile = new JButton("Update your Profile");
        btnUpdateyourProfile.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				try {
					new UpdateProfile(emp);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnUpdateyourProfile.setVerticalAlignment(SwingConstants.TOP);
		btnUpdateyourProfile.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnUpdateyourProfile.setForeground(new Color(0, 0, 0));
		btnUpdateyourProfile.setBackground(new Color(255, 255, 255));
		btnUpdateyourProfile.setBounds(228, 181, 173, 23);
		frame.getContentPane().add(btnUpdateyourProfile);
		
		JButton btnUpdateyourSkill = new JButton("Update your Skill");
		btnUpdateyourSkill.setVerticalAlignment(SwingConstants.TOP);
		btnUpdateyourSkill.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnUpdateyourSkill.setBounds(229, 231, 172, 23);
		frame.getContentPane().add(btnUpdateyourSkill);
		
		JButton btnApplyforaJob = new JButton("Apply for a Job");
		btnApplyforaJob.setVerticalAlignment(SwingConstants.TOP);
		btnApplyforaJob.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnApplyforaJob.setBounds(229, 286, 172, 23);
		frame.getContentPane().add(btnApplyforaJob);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setVerticalAlignment(SwingConstants.TOP);
		btnLogout.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnLogout.setBounds(271, 366, 89, 23);
		frame.getContentPane().add(btnLogout);
	}
	public EmployeeHomeScreen(Employee emp) throws ClassNotFoundException, SQLException {
		this.emp=emp;
		Dashboard();
	}
}
