import java.io.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;

public class F1 {

	private JFrame frame;
	public JTextField txtUsername;
	public JTextField txtPassword;
	public String Aid ="";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F1 frame = new F1();
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
	public F1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBackground(SystemColor.activeCaption);
		frame.getContentPane().setForeground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 500, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Taxi Service");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Star Jedi Rounded", Font.BOLD, 40));
		lblNewLabel.setBounds(85, 47, 313, 55);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("Login");
		lblNewLabel_4.setForeground(new Color(64, 64, 64));
		lblNewLabel_4.setFont(new Font("supermarket", Font.BOLD, 35));
		lblNewLabel_4.setToolTipText("");
		lblNewLabel_4.setBounds(204, 201, 172, 64);
		frame.getContentPane().add(lblNewLabel_4);
		
		txtUsername = new JTextField();
		txtUsername.setToolTipText("");
		txtUsername.setForeground(Color.GRAY);
		txtUsername.setBackground(new Color(255, 255, 255));
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtUsername.setBounds(156, 297, 223, 31);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(50);
		
		txtPassword = new JPasswordField();
		txtPassword.setToolTipText("");
		txtPassword.setForeground(Color.GRAY);
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPassword.setBounds(156, 351, 223, 31);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(50);
		
		
		JButton btnNewButton = new JButton("Log In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				boolean s = false;
				String id = txtUsername.getText().toString();
				String pas = txtPassword.getText().toString();
				
			try {
				check ck = new check(id,pas);
				s = ck.Scheck();
				 
				 
			} catch (HeadlessException e1) {
				
				e1.printStackTrace();
				
			} catch (IOException e1) {
				
				JOptionPane.showMessageDialog(null, "You no Have data");
			}
			
			if(s == true)
			{
			
				JOptionPane.showMessageDialog(null, "Login Success!");
			 data d = new data();
			 F3 f3 = new F3();
			 d.setID(id);
			 
			 f3.main(null);
			 
			 
			 frame.setVisible(false);
			 
			
			}
			else {
				JOptionPane.showMessageDialog(null, "Not Have User or Password\n");
			}
			
			}
			
		});
		btnNewButton.setBounds(264, 443, 117, 27);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Registion");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				F2 f2 = new F2();
				f2.main(null);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(92, 443, 109, 27);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel img2 = new JLabel("");
		img2.setHorizontalAlignment(SwingConstants.CENTER);
		img2.setIcon(new ImageIcon(F1.class.getResource("/images/001.png")));
		img2.setBounds(85, 339, 139, 132);
		frame.getContentPane().add(img2);
		
		JLabel img1 = new JLabel("");
		img1.setHorizontalAlignment(SwingConstants.CENTER);
		img1.setIcon(new ImageIcon(F1.class.getResource("/images/icon2.png")));
		img1.setBounds(79, 283, 67, 62);
		frame.getContentPane().add(img1);
		
		JLabel img3 = new JLabel("");
		img3.setBackground(Color.DARK_GRAY);
		img3.setForeground(Color.DARK_GRAY);
		img3.setHorizontalAlignment(SwingConstants.CENTER);
		img3.setIcon(new ImageIcon(F1.class.getResource("/images/icon5.png")));
		img3.setBounds(-42, 72, 516, 329);
		frame.getContentPane().add(img3);
		
		JLabel bg1 = new JLabel("");
		bg1.setIcon(new ImageIcon(F1.class.getResource("/images/bg8.jpg")));
		bg1.setBounds(0, -54, 484, 665);
		frame.getContentPane().add(bg1);
	}
	
	

}

