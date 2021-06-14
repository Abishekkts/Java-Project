package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ModuleLayer.Controller;
import java.sql.SQLException;
import java.awt.Color;
import javax.swing.JTextField;

import controller.EmployeeController;
import controller.JobController;
import controller.SkillController;

import javax.swing.JButton;

public class SkillIdFrame {

	private JFrame frame;
	private JTextField textField;
    SkillController skillcontroller;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 new SkillIdFrame();
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
	private void JobID() throws ClassNotFoundException, SQLException {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 51, 102));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblSkillID = new JLabel("Skil ID");
		lblSkillID.setForeground(new Color(255, 255, 255));
		lblSkillID.setFont(new Font("Arial", Font.BOLD, 15));
		lblSkillID.setBounds(150, 27, 138, 14);
		frame.getContentPane().add(lblSkillID);
		
		JLabel lblEnterSkillID = new JLabel("Enter Skill ID");
		lblEnterSkillID.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblEnterSkillID.setForeground(new Color(255, 255, 255));
		lblEnterSkillID.setBounds(34, 102, 116, 14);
		frame.getContentPane().add(lblEnterSkillID);
		
		textField = new JTextField();
		textField.setBounds(187, 97, 138, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		skillcontroller=new SkillController();
		btnSubmit.setFont(new Font("Lucida Fax", Font.BOLD, 13));
	    btnSubmit.setBounds(150, 167, 89, 23);
	    frame.getContentPane().add(btnSubmit);
		btnSubmit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int KID;
				KID = Integer.parseInt(textField.getText());
			   skillcontroller.getSkillById(KID);
			}
			
		});
	}

			
	public SkillIdFrame() throws ClassNotFoundException, SQLException {
		JobID();
	}
}
