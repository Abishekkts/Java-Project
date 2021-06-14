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

import controller.SkillController;

import javax.swing.JButton;

public class ActSkill {

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
					 new ActSkill();
				
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
	private void ActSkill() throws ClassNotFoundException, SQLException {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 51, 102));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblActivateSkill = new JLabel("Activate Skill");
		lblActivateSkill.setFont(new Font("Arial", Font.BOLD, 18));
		lblActivateSkill.setForeground(new Color(255, 255, 255));
		lblActivateSkill.setBounds(148, 23, 142, 14);
		frame.getContentPane().add(lblActivateSkill);
		
		JLabel lblSkillID = new JLabel("Enter Skill ID");
		lblSkillID.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblSkillID.setForeground(new Color(255, 255, 255));
		lblSkillID.setBounds(39, 87, 92, 14);
		frame.getContentPane().add(lblSkillID);
		
		textField = new JTextField();
		textField.setBounds(168, 82, 122, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnActivate = new JButton("Activate");
        skillController=new SkillController();
		
        btnActivate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int s;
				s=Integer.parseInt(textField.getText());
				skillController.activateJob(s);
			}
			
		});
		btnActivate.setFont(new Font("Lucida Fax", Font.BOLD, 13));
		btnActivate.setForeground(new Color(0, 0, 0));
		btnActivate.setBounds(148, 152, 97, 23);
		frame.getContentPane().add(btnActivate);
	}
	public ActSkill() throws ClassNotFoundException, SQLException {
		ActSkill();
	}

}
