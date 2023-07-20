

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;
import java.awt.Color;
import javax.swing.UIManager;

public class F3  {

	
	private JFrame frame;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {F3 frame = new F3();
				
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
	public F3()  {
		F1 f1 = new F1();
		data d = new data();
		String id = d.getID();
		
		
		try {
			 d.setMoney(id);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		String Amoney = d.getMoney().toString();
	
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 750, 550);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 63, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Money :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(282, 11, 70, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Date :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(492, 13, 52, 21);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setBackground(new Color(128, 128, 128));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNewButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		JOptionPane.showMessageDialog(null, "You should enter you credit after add Money");
        		pay p = new pay();
        		p.main(null);
        		
        		frame.setVisible(false);
        		
        	}
		    
		});
		btnNewButton.setBounds(299, 59, 89, 23);
		contentPane.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("Logout");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				f1.main(null);
				frame.setVisible(false);
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(47, 433, 125, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Buy");
		btnNewButton_2.setBackground(Color.RED);
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(538, 432, 119, 31);
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "You Money : "+ d.getMoney().toString() +"\n"
						+ "Warring \nThe Time should have 4 only word");
				F4 f4 = new F4();
				f4.main(null);
				frame.setVisible(false);
				
			}
		});
		contentPane.add(btnNewButton_2);
		
		JLabel TextName = new JLabel(id);
		TextName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		TextName.setBounds(108, 17, 89, 14);
		contentPane.add(TextName);
		
		
		
		JLabel TextMoney = new JLabel(Amoney);
		TextMoney.setFont(new Font("Tahoma", Font.PLAIN, 10));
		TextMoney.setBounds(381, 17, 60, 14);
		contentPane.add(TextMoney);
		
		JLabel TextDate = new JLabel(LocalDate.now().toString());
		TextDate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		TextDate.setBounds(593, 17, 70, 14);
		contentPane.add(TextDate);
		
		JButton btnNewButton1 = new JButton("History");
		btnNewButton1.setBounds(143, 121, 460, 248);
		btnNewButton1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				d.History(id);
				JOptionPane.showMessageDialog(null, d.getHistory());
				
				
			}
		});
		contentPane.add(btnNewButton1);
		
		
	}
	
	
	public Float setMoney(String ID) throws IOException{
		
		float Rmoney = 0;
		try {
			Scanner read = new Scanner(new File("user\\"+ID+"Money.txt"));
			while(read.hasNext()) {
			String a1 = read.next();
			Rmoney = Float.parseFloat(a1);
			
			
			  }
			}
			catch(FileNotFoundException e) {
				
			}
			catch(IOException e) {
				System.out.print("B");
			  }
			
		
		return Rmoney;
	}

}
