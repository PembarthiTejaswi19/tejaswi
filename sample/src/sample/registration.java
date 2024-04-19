package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

public class registration {

	private JFrame frame;
	private JTextField TB1;
	private JTextField TB2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registration window = new registration();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 128, 128));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("rollno");
		lblNewLabel.setBounds(67, 70, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("name");
		lblNewLabel_1.setBounds(67, 95, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("branch");
		lblNewLabel_2.setBounds(67, 120, 46, 26);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("gender");
		lblNewLabel_3.setBounds(67, 157, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		TB1 = new JTextField();
		TB1.setBackground(new Color(128, 128, 192));
		TB1.setBounds(118, 67, 109, 20);
		frame.getContentPane().add(TB1);
		TB1.setColumns(10);
		
		TB2 = new JTextField();
		TB2.setBackground(new Color(128, 128, 192));
		TB2.setBounds(118, 92, 110, 20);
		frame.getContentPane().add(TB2);
		TB2.setColumns(10);
		
		JRadioButton RB1 = new JRadioButton("male");
		RB1.setBackground(new Color(128, 128, 128));
		RB1.setBounds(119, 153, 59, 23);
		frame.getContentPane().add(RB1);
		
		JRadioButton RB2 = new JRadioButton("female");
		RB2.setBackground(new Color(128, 128, 128));
		RB2.setBounds(221, 153, 59, 23);
		frame.getContentPane().add(RB2);
		
		JLabel lblNewLabel_4 = new JLabel("prgm lang");
		lblNewLabel_4.setBounds(67, 196, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JCheckBox C1 = new JCheckBox("c");
		C1.setBackground(new Color(128, 64, 64));
		C1.setBounds(119, 192, 40, 23);
		frame.getContentPane().add(C1);
		
		JCheckBox C2 = new JCheckBox("java");
		C2.setBackground(new Color(128, 64, 64));
		C2.setBounds(186, 192, 47, 23);
		frame.getContentPane().add(C2);
		
		JCheckBox C3 = new JCheckBox("python");
		C3.setBackground(new Color(128, 64, 64));
		C3.setBounds(258, 192, 59, 23);
		frame.getContentPane().add(C3);
		ButtonGroup bg=new ButtonGroup();
		bg.add(RB1);
		bg.add(RB2);
		
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.setBackground(new Color(128, 255, 128));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  roll =TB1.getText();	
				String  name=TB2.getText();
				//String branch=(String) CB1.getSelectedItem();
				String gender="  ";
				String langs="  ";
				if(RB1.isSelected())
				{
					gender="male";
				}
				if(RB2.isSelected())
				{
					gender="female";
				}
				if(C1.isSelected())
				{
					 langs=langs+"c";
				}
				if(C2.isSelected())
				{
					 langs=langs+"java";
				}
				if(C3.isSelected())
				{
					 langs=langs+"python";
				}
				
				JOptionPane.showMessageDialog(btnNewButton,"roll :"  +roll+  "\n name:"   +name+   "branch:"  +branch+  
						"\n gender:"  +gender+  "\n prog langs:"   +langs);	 
					 
					 
			}
		});
		btnNewButton.setBounds(147, 222, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("registration form");
		lblNewLabel_5.setBounds(158, 21, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JComboBox CB1 = new JComboBox();
		CB1.setModel(new DefaultComboBoxModel(new String[] {"CSE", "CS", "IT", "ECE", "EEE", "MECH", "AIML"}));
		CB1.setBounds(118, 120, 109, 22);
		frame.getContentPane().add(CB1);
	}
}
