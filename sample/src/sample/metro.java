package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class metro {

	protected static final int YES_OPTION = 0;
	private JFrame frame;
	private JTextField TB1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metro window = new metro();
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
	public metro() {
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
		
		JLabel lblNewLabel = new JLabel("name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(26, 83, 80, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("source");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(26, 108, 80, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("destination");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(26, 141, 80, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("number of tickets");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(30, 176, 96, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox CB1 = new JComboBox();
		CB1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "SRI NAGAR", "AMEERPET", "JNTU"}));
		CB1.setBounds(168, 106, 86, 22);
		frame.getContentPane().add(CB1);
		
		JComboBox CB2 = new JComboBox();
		CB2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "SRI NAGAR", "AMEERPET", "JNTU"}));
		CB2.setBounds(168, 139, 86, 22);
		frame.getContentPane().add(CB2);
		
		JComboBox CB3 = new JComboBox();
		CB3.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5", "6", "7", "8"}));
		CB3.setBounds(168, 174, 86, 22);
		frame.getContentPane().add(CB3);
		
		TB1 = new JTextField();
		TB1.setBounds(168, 77, 86, 20);
		frame.getContentPane().add(TB1);
		TB1.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=TB1.getText();
				String source=(String)CB1.getSelectedItem();
				String destination=(String)CB2.getSelectedItem();
				String tickets=(String)CB3.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				if(source.equals(destination)) 
				{
					JOptionPane.showInputDialog(btnNewButton, name, "  PLEASE USE YOUR BRAIN");
				}
				else
				{
					int bill=0;
					bill=bill+nt*45;
					int res=0;
			        res=JOptionPane.showConfirmDialog(btnNewButton ,"Name:" +name+ "\n  SOURCE:" +source+ 
			        		"\n  DESTINATION:" +destination+  "\n No of tickets:"  +tickets+  "\n Amount:" +bill);
			        if(res==YES_OPTION)
			        {
			        	JOptionPane.showMessageDialog(btnNewButton , "BOOKING CONFIRMED");	
			        }
			        else
			        {
			        	JOptionPane.showMessageDialog(btnNewButton , "BOOKING  CANCELLED");
			        }
			        
				  }
				
				
				
				
				
			}
		});
		btnNewButton.setBounds(140, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_8 = new JLabel("       METRO TRAIN TICKET BOOKING");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_8.setForeground(new Color(0, 0, 0));
		lblNewLabel_8.setBackground(new Color(240, 240, 240));
		lblNewLabel_8.setBounds(30, 25, 359, 22);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\metro.jpg"));
		lblNewLabel_4.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_4);
	}

}
