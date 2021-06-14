package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.SwingConstants;

import view.AllEmployeeFrames;

public class HRAPortal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new HRAPortal();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void HRAPortal() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 51, 102));
		frame.setBounds(100, 100, 616, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblWelcometoHRAPortal = new JLabel("Welcome to HRAPortal");
		lblWelcometoHRAPortal.setFont(new Font("Arial", Font.BOLD, 18));
		lblWelcometoHRAPortal.setForeground(new Color(255, 255, 255));
		lblWelcometoHRAPortal.setBounds(194, 25, 272, 29);
		frame.getContentPane().add(lblWelcometoHRAPortal);
		
		JButton btnViewallEmployees = new JButton("View all Employees");
		btnViewallEmployees.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
					try {
						new AllEmployeeFrames();
					} catch (ClassNotFoundException | SQLException e1) {
						e1.printStackTrace();
					}
			}
		});
		btnViewallEmployees.setVerticalAlignment(SwingConstants.TOP);
		btnViewallEmployees.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnViewallEmployees.setBounds(26, 98, 163, 23);
		frame.getContentPane().add(btnViewallEmployees);
		
		
		
		JButton btnDeactivateEmployees = new JButton("Deactivate Employees");
		btnDeactivateEmployees.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					new DeactivateEmp();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}	
		});
		
		btnDeactivateEmployees.setVerticalAlignment(SwingConstants.TOP);
		btnDeactivateEmployees.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnDeactivateEmployees.setBounds(26, 147, 163, 23);
		frame.getContentPane().add(btnDeactivateEmployees);
		
		JButton btnActiveUsers = new JButton("Active Users");
		btnActiveUsers.addActionListener(new ActionListener() {
			 @Override
			 public void actionPerformed(ActionEvent e) {
				 
				 try {
					new ActivateEmployee();
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			 }
		 });
		 
		btnActiveUsers.setVerticalAlignment(SwingConstants.TOP);
		btnActiveUsers.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnActiveUsers.setBounds(26, 194, 163, 23);
		frame.getContentPane().add(btnActiveUsers);
		
		JButton btnViewEmployeesbyID = new JButton("View Employees by ID");
		btnViewEmployeesbyID.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
					try {
						new EmployeeID();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
			}	
		});
		btnViewEmployeesbyID.setVerticalAlignment(SwingConstants.TOP);
		btnViewEmployeesbyID.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnViewEmployeesbyID.setBounds(26, 249, 163, 23);
		frame.getContentPane().add(btnViewEmployeesbyID);
		
		JButton btnViewallSkill = new JButton("View all Skill");
		btnViewallSkill.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
					try {
						new AllSkillFrame();
					} catch (ClassNotFoundException | SQLException e1) {
						e1.printStackTrace();
					}
			}
		});
		btnViewallSkill.setVerticalAlignment(SwingConstants.TOP);
		btnViewallSkill.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnViewallSkill.setBounds(238, 98, 122, 23);
		frame.getContentPane().add(btnViewallSkill);
		
		JButton btnActivateSkill = new JButton("Activate Skill");
		btnActivateSkill.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
					try {
						new ActSkill();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				
			}	
		});
		btnActivateSkill.setVerticalAlignment(SwingConstants.TOP);
		btnActivateSkill.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnActivateSkill.setBounds(238, 147, 122, 23);
		frame.getContentPane().add(btnActivateSkill);
		
		JButton btnDeactivateSkill = new JButton("Deactivate Skill");
		btnDeactivateSkill.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
					try {
						new DeactivateSkill();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
			}	
		});
		btnDeactivateSkill.setVerticalAlignment(SwingConstants.TOP);
		btnDeactivateSkill.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnDeactivateSkill.setBounds(238, 194, 122, 23);
		frame.getContentPane().add(btnDeactivateSkill);
		
		JButton btnActivateJob = new JButton("Activate Job");
		btnActivateJob.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
					try {
						new ActJob();
					} catch (Exception e1) {
						e1.printStackTrace();
					}	
			}	
		});
		btnActivateJob.setVerticalAlignment(SwingConstants.TOP);
		btnActivateJob.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnActivateJob.setBounds(415, 98, 139, 23);
		frame.getContentPane().add(btnActivateJob);
		
		JButton btnDeactivateJob = new JButton("Deactivate Job");
		btnDeactivateJob.setVerticalAlignment(SwingConstants.TOP);
		btnDeactivateJob.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
						try {
							new DeactivateJob();
						} catch (Exception e1) {
							e1.printStackTrace();
						}
			}	
		});
		btnDeactivateJob.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnDeactivateJob.setBounds(415, 147, 139, 23);
		frame.getContentPane().add(btnDeactivateJob);
		
		JButton btnNewButton = new JButton("Delete Employee");
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)  {
				
				new DeleteEmployee();
			}
	   });
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnNewButton.setBounds(415, 194, 139, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete Job");
		btnNewButton_1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)  {
				try {
						new DeleteJob();
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
	   });
		btnNewButton_1.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnNewButton_1.setBounds(415, 249, 139, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Delete Skill");
		btnNewButton_3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)  {
				try {
						new DeleteSkill();
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
	   });
		btnNewButton_3.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnNewButton_3.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_3.setBounds(238, 249, 122, 23);
		frame.getContentPane().add(btnNewButton_3);
	}
	public HRAPortal() {
		HRAPortal();
	}


}
