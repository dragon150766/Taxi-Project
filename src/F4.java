import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

public class F4  {

	private JFrame frame;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F4 frame = new F4();
					frame.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public F4() {
		data d = new data();
		checkDigi di = new checkDigi();
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 750, 550);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("YouLocation :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(44, 96, 106, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(160, 96, 295, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("YouWantToGo :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(44, 156, 161, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(163, 155, 292, 29);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("HowLong(m) :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(44, 209, 106, 19);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(163, 206, 167, 29);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("TimeWeWillGo :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(44, 269, 115, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(167, 259, 161, 29);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("HowMuch :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(265, 362, 85, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("0");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(378, 362, 63, 14);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(58, 445, 107, 23);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				F1 f1 = new F1();
				f1.main(null);
				frame.setVisible(false);
				
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(175, 445, 89, 23);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				F3 f3 = new F3();
				f3.main(null);
				frame.setVisible(false);
				
			}
		});
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Next");
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(561, 445, 89, 23);
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(textField.getText().toString().equals("") ) 
				{
					JOptionPane.showMessageDialog(null, "Missing Information");
				
				
			}
				else if (textField_1.getText().toString().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Missing Information");
				}
				else if(textField_2.getText().toString().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Missing Information");
				}
				
				else if ( di.checkAdigi(textField_3.getText().toString()) == false) {
					
					JOptionPane.showMessageDialog(null, "Missing Information You Time Not True");
				}
				
				else {
					
					try {
						d.setLocation(textField.getText().toString());
						d.setWTG(textField_1.getText().toString());
					float sum = Float.parseFloat(textField_2.getText());
					d.setHw(sum);
					di.setWord(textField_3.getText().toString().substring(0, 2)+ ":"+ textField_3.getText().toString().substring(2, 4));
					 float asum = (float) (sum * 0.008);
					 d.setPrice(asum);
					F6 f6 = new F6();
					f6.main(null);
					frame.setVisible(false);
					}
					catch(NumberFormatException ex) {
						JOptionPane.showMessageDialog(null, "Missing Information");
					}
					
					
				}
			}
		});
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Map");
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBackground(Color.DARK_GRAY);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3.setBounds(462, 445, 89, 23);
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				F5 f5 = new F5();
				f5.main(null);
				frame.setVisible(false);
				
			}
		});
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_5_2 = new JLabel("__________________________________________________________________________________");
		lblNewLabel_5_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_5_2.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_5_2.setBounds(82, 314, 577, 14);
		contentPane.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_6 = new JLabel("Where are you go ?");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_6.setBounds(252, 25, 274, 38);
		contentPane.add(lblNewLabel_6);
		
		JButton calculated = new JButton("Calculated");
		calculated.setForeground(Color.WHITE);
		calculated.setFont(new Font("Tahoma", Font.BOLD, 16));
		calculated.setBackground(Color.DARK_GRAY);
		calculated.setBounds(308, 386, 127, 23);
		calculated.addMouseListener(new MouseAdapter() {
		
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
				float sum = Float.parseFloat(textField_2.getText());
				String textsum = "";
				 sum = (float) (sum * 0.008);
				 textsum = String.valueOf(sum);
				 lblNewLabel_5.setText(textsum);
				
			}
				catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "no value in howlong");
			   }
			}
		});
		contentPane.add(calculated);
		
		
		JLabel lblNewLabel2 = new JLabel("THB");
		lblNewLabel2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel2.setBounds(431, 359, 46, 14);
		contentPane.add(lblNewLabel2);
	}

}
