import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Canvas;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class F6  {

	private JFrame frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F6 frame = new F6();
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
	public F6() {
		data d = new data();
		checkDigi di = new checkDigi();
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 750, 550);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("YouLocation :");
		lblNewLabel.setBounds(143, 87, 104, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1 = new JLabel(d.getLocation());
		lblNewLabel_1.setBounds(257, 87, 377, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1_1 = new JLabel("You Go :");
		lblNewLabel_1_1.setBounds(146, 146, 73, 14);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1_1_1 = new JLabel(d.getWTG());
		lblNewLabel_1_1_1.setBounds(229, 146, 302, 14);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Long :");
		lblNewLabel_1_1_1_1.setBounds(146, 196, 46, 24);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel(String.valueOf(d.getHw()));
		lblNewLabel_1_1_1_1_1.setBounds(202, 201, 302, 14);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Time :");
		lblNewLabel_1_1_1_1_1_1.setBounds(146, 253, 56, 14);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel(di.Overmin(di.getWord()));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(202, 253, 329, 14);
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("Price :");
		lblNewLabel_1_1_1_1_1_1_1_1.setBounds(143, 310, 46, 14);
		lblNewLabel_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1 = new JLabel(String.valueOf(d.getPrice()));
		lblNewLabel_1_1_1_1_1_1_1_1_1.setBounds(199, 310, 147, 14);
		lblNewLabel_1_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBounds(52, 459, 89, 23);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				F4 f4 = new F4();
				f4.main(null);
				frame.setVisible(false);
				
			}
		});
		
		
		
		
		JButton btnNewButton_1_1 = new JButton("SaveTax");
		btnNewButton_1_1.setBounds(294, 459, 126, 23);
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_1.setEnabled(false);
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					PrintWriter write = new PrintWriter(new FileWriter("user\\"+d.getID()+"Tax.txt", true));
					write.println(LocalDate.now().toString() + "/" + d.getPrice()+"B./" +d.getWTG());
					write.close();
				}catch(IOException e1) {
					
				}
				
				frame.dispose();
			}
		});
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(315, 402, 134, 14);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setForeground(Color.RED);
		
		JLabel lblNewLabel_6 = new JLabel("__________________________________________________________________________________");
		lblNewLabel_6.setBounds(83, 112, 596, 14);
		lblNewLabel_6.setForeground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(409, 340, 257, 140);
		lblNewLabel_3.setEnabled(true);
		lblNewLabel_3.setIcon(new ImageIcon(F5.class.getResource("/images/s1.png")));
		lblNewLabel_3.setVisible(false);
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(lblNewLabel_1);
		contentPane.add(lblNewLabel_6);
		contentPane.add(lblNewLabel_1_1_1_1);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1);
		contentPane.add(btnNewButton);
		contentPane.add(lblNewLabel_2);
		contentPane.add(btnNewButton_1_1);
		
		contentPane.add(lblNewLabel_3);
		contentPane.add(lblNewLabel_1_1);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("-Taxi service / Bill-");
		lblNewLabel_4.setFont(new Font("ThaiSans Neue SemBd", Font.BOLD, 30));
		lblNewLabel_4.setBounds(220, 22, 300, 35);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("__________________________________________________________________________________");
		lblNewLabel_5.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_5.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_5.setBounds(81, 168, 577, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("__________________________________________________________________________________");
		lblNewLabel_5_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_5_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_5_1.setBounds(81, 223, 577, 14);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("__________________________________________________________________________________");
		lblNewLabel_5_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_5_2.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_5_2.setBounds(81, 277, 577, 14);
		contentPane.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("__________________________________________________________________________________");
		lblNewLabel_5_3.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_5_3.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_5_3.setBounds(81, 327, 577, 14);
		contentPane.add(lblNewLabel_5_3);
		
		JButton btnBuy = new JButton("Buy");
		btnBuy.setBounds(608, 459, 89, 23);
		btnBuy.setBackground(Color.RED);
		btnBuy.setForeground(Color.WHITE);
		btnBuy.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBuy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Buy Success!");
				d.buy(d.getPrice());
				lblNewLabel_3.setVisible(true);
				btnNewButton_1_1.setEnabled(true);
			}
		});
		contentPane.add(btnBuy);
		
	}
}
