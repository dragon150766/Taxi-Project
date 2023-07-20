import java.awt.BorderLayout;
import java.awt.EventQueue;

import java.io.*;
import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class F2  {

	private JFrame frame;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try { F2 frame = new F2();
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
	public F2() {
		frame = new JFrame();
		frame.setBackground(SystemColor.activeCaption);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(455, 134, 28, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(401, 183, 85, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cradit :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(424, 236, 59, 14);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(493, 133, 174, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(493, 182, 174, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(493, 230, 174, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(255, 165, 0));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				F1 f1 = new F1();
				f1.main(null);
				frame.setVisible(false);
				
				
				
				
				
				//frame.setVisible(false);
                   
                
			}
		});
		btnNewButton.setBounds(401, 386, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Registion");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(255, 165, 0));
		btnNewButton_1.setBounds(578, 386, 114, 23);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id = textField.getText().toString();
				String pass = textField_1.getText().toString();
				String C = textField_2.getText().toString();
				check ck = new check(id,pass);
				PrintWriter write;
				
				try {
					write = new PrintWriter(new FileWriter("data.txt", true));
					boolean s = ck.Scheck();
					if(s == false) {
					
					write.println(id+ "/" + pass + "/" + C+ "/" +"0");
					write.close();
					textField.setText(null);
					textField_1.setText(null);
					textField_2.setText(null);
					JOptionPane.showMessageDialog(null, "You User have Save.");
					}else {
						JOptionPane.showMessageDialog(null, "Have this User in System.");
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "not save");
				}
				
				try {
					write = new PrintWriter(new FileWriter("user\\"+id+"Money.txt"));
					write.println("0");
					write.close();
					
				}catch(IOException e1) {
					JOptionPane.showMessageDialog(null, "not save");
				}
			}
		});
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 353, 461);
		contentPane.add(panel);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(F2.class.getResource("/images/1-1.jpg")));
		
		JLabel lblNewLabel_5_1 = new JLabel("service ");
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setFont(new Font("Star Jedi Rounded", Font.BOLD, 40));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addComponent(lblNewLabel_4)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(lblNewLabel_5_1)
					.addGap(66))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel_4)
					.addGap(67)
					.addComponent(lblNewLabel_5_1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
					.addGap(78))
		);
		panel.setLayout(gl_panel);
		
		JLabel lblNewLabel_3 = new JLabel("Create a Taxi service account");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(396, 44, 313, 47);
		contentPane.add(lblNewLabel_3);
	}
	

}
