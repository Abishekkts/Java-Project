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

public class PMEPortal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 new PMEPortal();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void PMEPortal() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 51, 102));
		frame.setBounds(100, 100, 615, 517);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblWelcometoPMEPortal= new JLabel("Welcome to PMEPortal");
		lblWelcometoPMEPortal.setForeground(new Color(255, 255, 255));
		lblWelcometoPMEPortal.setFont(new Font("Arial", Font.BOLD, 18));
		lblWelcometoPMEPortal.setBounds(198, 28, 252, 14);
		frame.getContentPane().add(lblWelcometoPMEPortal);
		
		JButton btnViewSkillwiseEmployee = new JButton("View Skill wise Employee");
		btnViewSkillwiseEmployee.setVerticalAlignment(SwingConstants.TOP);
		btnViewSkillwiseEmployee.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnViewSkillwiseEmployee.setBounds(213, 88, 171, 23);
		frame.getContentPane().add(btnViewSkillwiseEmployee);
		
		JButton btnViewallSkills = new JButton("View all Skills");
		btnViewallSkills.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new AddSkill();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnViewallSkills.setVerticalAlignment(SwingConstants.TOP);
		btnViewallSkills.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnViewallSkills.setBounds(213, 137, 171, 23);
		frame.getContentPane().add(btnViewallSkills);
		
		JButton btnAddanJob = new JButton("Add an Job");
		btnAddanJob.setVerticalAlignment(SwingConstants.TOP);
		btnAddanJob.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnAddanJob.setForeground(new Color(0, 0, 0));
		btnAddanJob.setBounds(213, 189, 171, 23);
		frame.getContentPane().add(btnAddanJob);
		
		JButton btnViewallJobs = new JButton("View all Jobs");
		btnViewallJobs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new AddJob();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnViewallJobs.setVerticalAlignment(SwingConstants.TOP);
		btnViewallJobs.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnViewallJobs.setBounds(213, 241, 171, 23);
		frame.getContentPane().add(btnViewallJobs);
		
		JButton btnViewSkillwiseJobs = new JButton("View Skill wise Jobs");
		btnViewSkillwiseJobs.setVerticalAlignment(SwingConstants.TOP);
		btnViewSkillwiseJobs.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnViewSkillwiseJobs.setBounds(213, 292, 171, 23);
		frame.getContentPane().add(btnViewSkillwiseJobs);
		
		JButton btnDeactivateJob= new JButton("Deactivate Job");
		btnDeactivateJob.setVerticalAlignment(SwingConstants.TOP);
		btnDeactivateJob.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnDeactivateJob.setBounds(213, 342, 171, 23);
		frame.getContentPane().add(btnDeactivateJob);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setVerticalAlignment(SwingConstants.TOP);
		btnLogout.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnLogout.setBounds(254, 397, 89, 23);
		frame.getContentPane().add(btnLogout);
	}
	public PMEPortal() {
		PMEPortal();
	}

}
