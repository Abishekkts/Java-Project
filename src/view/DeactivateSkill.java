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
import controller.SkillController;

import javax.swing.JButton;


public class DeactivateSkill {

	private JFrame frame;
	private JTextField textField;
	SkillController skillController=null;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 new DeactivateSkill();
					
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
	private void DeactivateSkill() throws ClassNotFoundException, SQLException {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 51, 102));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblDeactivateSkill = new JLabel("Deactivate Skill");
		lblDeactivateSkill.setFont(new Font("Arial", Font.BOLD, 18));
		lblDeactivateSkill.setForeground(new Color(255, 255, 255));
		lblDeactivateSkill.setBounds(135, 24, 142, 21);
		frame.getContentPane().add(lblDeactivateSkill);
		
		JLabel lblEnterSkillID = new JLabel("Enter Skill ID");
		lblEnterSkillID.setForeground(new Color(255, 255, 255));
		lblEnterSkillID.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblEnterSkillID.setBounds(53, 93, 86, 14);
		frame.getContentPane().add(lblEnterSkillID);
		
		textField = new JTextField();
		textField.setBounds(149, 88, 136, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnDeactivate = new JButton("Deactivate");
        skillController=new SkillController();
		
        btnDeactivate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int s;
				s=Integer.parseInt(textField.getText());
				skillController.deactivateSkill(s);
			}

		 });
		btnDeactivate.setFont(new Font("Lucida Fax", Font.BOLD, 12));
		btnDeactivate.setBounds(146, 170, 108, 23);
		frame.getContentPane().add(btnDeactivate);
	}
	public DeactivateSkill() throws ClassNotFoundException, SQLException {
		DeactivateSkill();
	}


}
