package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.EmployeeController;
import controller.JobController;
import controller.SkillController;
import model.Employee;
import model.Job;
import model.Skill;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class DeleteSkill {

	private JFrame frame;
	private JTextField textField;
    Skill k = new Skill();
	
	private SkillController skillcontroller;
	

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 new DeleteJob();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public DeleteSkill() throws ClassNotFoundException, SQLException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	private void initialize() throws ClassNotFoundException, SQLException {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 51, 102));
		frame.setBounds(100, 100, 450, 372);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Delete Skill");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel.setBounds(136, 26, 149, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Skill ID");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(56, 101, 112, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(184, 103, 149, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
            skillcontroller = new SkillController();
		
		     btnSubmit.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				int KID;
				KID = Integer.parseInt(textField.getText());
				skillcontroller.DeleteSkill(KID);
			}
		});
		btnSubmit.setFont(new Font("Lucida Fax", Font.PLAIN, 13));
		btnSubmit.setBounds(226, 189, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnNewButton_1 = new JButton("Back");
		 btnNewButton_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new HRAPortal();
			}
		});
		btnNewButton_1.setFont(new Font("Lucida Fax", Font.PLAIN, 14));
		btnNewButton_1.setBounds(77, 188, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
