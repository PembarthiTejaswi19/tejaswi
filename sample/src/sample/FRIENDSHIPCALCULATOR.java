package sample;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.Math;
public class FRIENDSHIPCALCULATOR {

	private JFrame frame;
	private JTextField TB1;
	private JTextField TB2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FRIENDSHIPCALCULATOR window = new FRIENDSHIPCALCULATOR();
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
	public FRIENDSHIPCALCULATOR() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("   YOUR NAME");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblNewLabel.setBounds(31, 64, 118, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("FRIEND NAME");
		lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblNewLabel_1.setBounds(31, 123, 118, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		TB1 = new JTextField();
		TB1.setBounds(198, 70, 105, 20);
		frame.getContentPane().add(TB1);
		TB1.setColumns(10);
		
		TB2 = new JTextField();
		TB2.setBounds(198, 131, 105, 20);
		frame.getContentPane().add(TB2);
		TB2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("       FRIENDSHIP CALCULATOR");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(69, 21, 283, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("CLICK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name1=TB1.getText();
				String name2=TB2.getText();
				if(name1.equals(name2))
				{
					JOptionPane.showMessageDialog(btnNewButton , " you have entered same name twice");
				}
				else
				{
				
				int percentage=(int)Math.random()%100;
				JOptionPane.showMessageDialog(btnNewButton ,"  "     +name1+   " & "  +name2+  " \n your friendship is " +Math.random()*100);
				}
			}
		}
				
			
		);
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 16));
		btnNewButton.setBounds(174, 189, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}


