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

import controller.SkillController;

import javax.swing.JButton;

public class AddSkill {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private static SkillController skillcontroller;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 new AddSkill();
					
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
	private void AddSkill() throws ClassNotFoundException, SQLException {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 51, 102));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblAddSkill = new JLabel("Add Skill");
		lblAddSkill.setForeground(new Color(255, 255, 255));
		lblAddSkill.setFont(new Font("Arial", Font.BOLD, 18));
		lblAddSkill.setBounds(164, 11, 138, 31);
		frame.getContentPane().add(lblAddSkill);
		
		JLabel lblSkillName = new JLabel("Skill Name");
		lblSkillName.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblSkillName.setForeground(new Color(255, 255, 255));
		lblSkillName.setBounds(33, 87, 97, 14);
		frame.getContentPane().add(lblSkillName);
		
		textField = new JTextField();
		textField.setBounds(140, 82, 162, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblSkillDescription = new JLabel("Skill Description");
		lblSkillDescription.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblSkillDescription.setForeground(new Color(255, 255, 255));
		lblSkillDescription.setBounds(33, 140, 97, 14);
		frame.getContentPane().add(lblSkillDescription);
		
		textField_1 = new JTextField();
		textField_1.setBounds(140, 135, 162, 40);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		skillcontroller = new SkillController();
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String j1,j2;
				j1=textField.getText();
				j2=textField_1.getText();
				skillcontroller.addSkill(j1,j2);
				frame=new JFrame();
				JOptionPane.showMessageDialog(frame,"Skill Added");
			}
			
		});
		btnSubmit.setFont(new Font("Lucida Fax", Font.BOLD, 13));
		btnSubmit.setBounds(164, 210, 89, 23);
		frame.getContentPane().add(btnSubmit);
	}
	public AddSkill() throws ClassNotFoundException, SQLException {
		AddSkill();
	}

}
