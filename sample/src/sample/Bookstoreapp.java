package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Bookstoreapp {
     int items=0;
     int total=0;

	private JFrame frame;
	private final JLabel lblNewLabel = new JLabel("     BOOK STORE APPLICATION");
	private JTextField TB1;
	private JTextField TB2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bookstoreapp window = new Bookstoreapp();
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
	public Bookstoreapp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 454, 294);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(86, 0, 282, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New Button");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\book1.jpg"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			items=items+1;
			total=total+599;
			TB1.setText(""+items);
			TB2.setText(""+total);
				
				
			}
		});
		btnNewButton.setBounds(10, 59, 114, 139);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				total=total+750;
				TB1.setText(""+items);
				TB2.setText(""+total);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\book2.jpg"));
		btnNewButton_1.setBounds(134, 55, 143, 143);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				total=total+967;
				TB1.setText(""+items);
				TB2.setText(""+total);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\book3.jpg"));
		btnNewButton_2.setBounds(299, 56, 132, 139);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("    ITEMS");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Verdana", Font.ITALIC, 13));
		lblNewLabel_1.setBounds(142, 30, 69, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		TB1 = new JTextField();
		TB1.setBounds(234, 28, 63, 20);
		frame.getContentPane().add(TB1);
		TB1.setColumns(10);
		
		TB2 = new JTextField();
		TB2.setBounds(362, 28, 69, 20);
		frame.getContentPane().add(TB2);
		TB2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("TOTAL");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblNewLabel_2.setBounds(303, 30, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_6 = new JLabel("  RS:599/-");
		lblNewLabel_6.setFont(new Font("Segoe UI Black", Font.BOLD, 11));
		lblNewLabel_6.setBounds(35, 195, 69, 20);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("   RS:750/-");
		lblNewLabel_7.setFont(new Font("Segoe UI Black", Font.BOLD, 11));
		lblNewLabel_7.setBounds(187, 195, 79, 20);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("   RS:967/-");
		lblNewLabel_8.setFont(new Font("Segoe UI Black", Font.BOLD, 11));
		lblNewLabel_8.setBounds(331, 195, 69, 20);
		frame.getContentPane().add(lblNewLabel_8);
		
		JButton btnNewButton_3 = new JButton("REMOVE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items-1;
				total=total-599;
				TB1.setText("" +items);
				TB2.setText("" +total);
			}
		});
		btnNewButton_3.setFont(new Font("Segoe UI Black", Font.BOLD, 11));
		btnNewButton_3.setBounds(15, 221, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("REMOVE");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items-1;
				total=total-750;
				TB1.setText(""+items);
				TB2.setText(""+total);
			}
		});
		btnNewButton_4.setFont(new Font("Segoe UI Black", Font.BOLD, 11));
		btnNewButton_4.setBounds(168, 221, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("REMOVE");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items-1;
				total=total-967;
				TB1.setText(""+items);
				TB2.setText(""+total);
			}
		});
		btnNewButton_5.setFont(new Font("Segoe UI Black", Font.BOLD, 11));
		btnNewButton_5.setBounds(322, 221, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
	}
}
