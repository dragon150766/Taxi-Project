import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;

public class pay {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pay frame = new pay();
					frame.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public pay() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		data d = new data();
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JLabel You_Credit_text = new JLabel("You Credit ");
		You_Credit_text.setHorizontalAlignment(SwingConstants.CENTER);
		You_Credit_text.setFont(new Font("Tahoma", Font.PLAIN, 18));
		You_Credit_text.setBounds(302, 92, 109, 42);
		frame.getContentPane().add(You_Credit_text);
		
		JLabel Credit = new JLabel(d.getMoney().toString());
		Credit.setHorizontalAlignment(SwingConstants.RIGHT);
		Credit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Credit.setBounds(286, 145, 79, 14);
		frame.getContentPane().add(Credit);
		
		JLabel THB_text1 = new JLabel("THB");
		THB_text1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		THB_text1.setBounds(375, 145, 46, 14);
		frame.getContentPane().add(THB_text1);
		
		JButton Back = new JButton("Back");
		Back.setForeground(Color.WHITE);
		Back.setBackground(Color.DARK_GRAY);
		Back.setFont(new Font("Tahoma", Font.BOLD, 16));
		Back.setBounds(56, 428, 98, 29);
		Back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
        		F3 f3 = new F3();
        		f3.main(null);
        		frame.setVisible(false);
        		
        	}
		});
		frame.getContentPane().add(Back);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(270, 341, 170, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel Taxi_text = new JLabel("Taxi Service");
		Taxi_text.setHorizontalAlignment(SwingConstants.CENTER);
		Taxi_text.setFont(new Font("Tahoma", Font.BOLD, 43));
		Taxi_text.setBounds(226, 22, 267, 61);
		frame.getContentPane().add(Taxi_text);
		
		JLabel Text1 = new JLabel("How much would you like to add?");
		Text1.setForeground(Color.LIGHT_GRAY);
		Text1.setHorizontalAlignment(SwingConstants.CENTER);
		Text1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Text1.setBounds(216, 299, 306, 31);
		frame.getContentPane().add(Text1);
		
		JLabel THB_Text2 = new JLabel("THB");
		THB_Text2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		THB_Text2.setBounds(450, 344, 46, 14);
		frame.getContentPane().add(THB_Text2);
		
		JButton submit = new JButton("Submit");
		submit.setForeground(Color.WHITE);
		submit.setFont(new Font("Tahoma", Font.BOLD, 16));
		submit.setBackground(Color.DARK_GRAY);
		submit.setBounds(561, 428, 98, 29);
		frame.getContentPane().add(submit);
		submit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
					BufferedReader read = new BufferedReader(new FileReader("data.txt"));
					String temp = "";
					
					while ((temp = read.readLine()) != null) {
						String[] data = temp.split("/");
						String ID = data[0];
						String Cradit = data[2];
						if(ID.equals(d.getID())) {
							d.setCradit(Cradit);
						}
						
						
					}
					read.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				if(d.getCradit().equals(textField_1.getText().toString()) ){
					float monet = Float.parseFloat(textField.getText().toString());
					
						d.plusMoney(monet);
					
					
					JOptionPane.showMessageDialog(null, "Add Money finish");
				}
				else {
					JOptionPane.showMessageDialog(null, "Add Money Not finish");
				}
				
				try {
					d.setMoney(d.getID());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Credit.setText(d.getMoney().toString());
				textField_1.setText(null);
			}
		});
		
		JLabel lblUid = new JLabel("Add Cradit id :");
		lblUid.setHorizontalAlignment(SwingConstants.CENTER);
		lblUid.setForeground(Color.LIGHT_GRAY);
		lblUid.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUid.setBounds(248, 192, 229, 31);
		frame.getContentPane().add(lblUid);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(257, 237, 207, 20);
		frame.getContentPane().add(textField_1);
		frame.setBounds(100, 100, 735, 557);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
