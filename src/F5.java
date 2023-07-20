import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;

public class F5 {

	private JFrame frame;
	private JPanel contentPane;
	public int count = 0;
	public boolean ATime = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F5 frame = new F5();
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
	public F5() {
		data d = new data();
		checkDigi di = new checkDigi();
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTotalPrice_1 = new JLabel(""+d.price);
		lblTotalPrice_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalPrice_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTotalPrice_1.setBounds(376, 508, 120, 22);
		contentPane.add(lblTotalPrice_1);
		
		JLabel selected_location = new JLabel("Selected Location :");
		selected_location.setFont(new Font("Tahoma", Font.PLAIN, 13));
		selected_location.setBounds(390, 468, 250, 30);
		contentPane.add(selected_location);
		
		JLabel lblNewLabel = new JLabel("YouLocation :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(46, 468, 180, 30);
		contentPane.add(lblNewLabel);
		
		JButton L_1Rama9chicken = new JButton("1");
		L_1Rama9chicken.setBackground(Color.WHITE);
		L_1Rama9chicken.setBounds(258, 193, 29, 30);
		L_1Rama9chicken.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
                  if(count == 0) {
					d.setA(1);
					lblNewLabel.setText("YouLocation : Rama9chicken");
					d.setLocation("Rama9chicken");
					count ++;
					
				}
				else if(count >0) {
					d.setB(1);
					selected_location.setText("Selected Location : Rama9chicken");
					d.setWTG("Rama9chicken");
					count = 0;
					d.seePrice();
					lblTotalPrice_1.setText(""+d.getPrice());
				}
				
			}
		});
		contentPane.add(L_1Rama9chicken);
		
		JButton L_2The_Nice = new JButton("2");
		L_2The_Nice.setBackground(Color.WHITE);
		L_2The_Nice.setBounds(567, 260, 29, 30);
		L_2The_Nice.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(count == 0) {
					d.setA(2);
					lblNewLabel.setText("YouLocation : The Nice");
					d.setLocation("The Nice");
					count ++;
				}
				else if(count >0) {
					d.setB(2);
					selected_location.setText("Selected Location : The Nice");
					d.setWTG("The Nice");
					count = 0;
					d.seePrice();
					lblTotalPrice_1.setText(""+d.getPrice());
				}
				
			}
		});
		contentPane.add(L_2The_Nice);
		
		JButton L_3Makro = new JButton("3");
		L_3Makro.setBackground(Color.WHITE);
		L_3Makro.setBounds(584, 398, 29, 30);
		L_3Makro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
                 if(count == 0) {
                	 d.setA(3);
                	 lblNewLabel.setText("YouLocation : Makro");
                	 d.setLocation("Makro");
                	 count ++;
				}
				else if(count >0) {
					d.setB(3);
					selected_location.setText("Selected Location : Makro");
					d.setWTG("Makro");
					count = 0;
					d.seePrice();
					lblTotalPrice_1.setText(""+d.getPrice());
				}
				
			}
		});
		contentPane.add(L_3Makro);
		
		JButton L_4Ramkhamhaeng_University = new JButton("4");
		L_4Ramkhamhaeng_University.setBackground(Color.WHITE);
		L_4Ramkhamhaeng_University.setBounds(478, 0, 29, 30);
		L_4Ramkhamhaeng_University.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
                  if(count == 0) {
                	  d.setA(4);
                	  lblNewLabel.setText("YouLocation : Ramkhamhaeng University");
                	  d.setLocation("Ramkhamhaeng University");
                	  count ++;
				}
				else if(count >0) {
					d.setB(4);
					selected_location.setText("Selected Location : Ramkhamhaeng University");
					d.setWTG("Ramkhamhaeng University");
					count = 0;
					d.seePrice();
					lblTotalPrice_1.setText(""+d.getPrice());
				}
				
			}
		});
		contentPane.add(L_4Ramkhamhaeng_University);
		
		JButton L_5TNI = new JButton("5");
		L_5TNI.setBackground(Color.WHITE);
		L_5TNI.setBounds(614, 349, 29, 30);
		L_5TNI.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
                   if(count == 0) {
                	   d.setA(5);
                	   lblNewLabel.setText("YouLocation : TNI");
                	   d.setLocation("TNI");
                	   count ++;
				}
				else if(count >0) {
					d.setB(5);
					selected_location.setText("Selected Location : TNI");
					d.setWTG("TNI");
					count = 0;
					d.seePrice();
					lblTotalPrice_1.setText(""+d.getPrice());
				}
				
			}
		});
		contentPane.add(L_5TNI);
		
		JButton L_6NobleCube = new JButton("6");
		L_6NobleCube.setBackground(Color.WHITE);
		L_6NobleCube.setBounds(318, 402, 29, 30);
		L_6NobleCube.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
                    if(count == 0) {
                    	d.setA(6);
                    	lblNewLabel.setText("YouLocation : NobleCube");
                    	d.setLocation("NobleCube");
                    	count ++;
				}
				else if(count >0) {
					d.setB(6);
					selected_location.setText("Selected Location : NobleCube");
					d.setWTG("NobleCube");
					count = 0;
					d.seePrice();
					lblTotalPrice_1.setText(""+d.getPrice());
				}
				
			}
		});
		contentPane.add(L_6NobleCube);
		
		JButton L_7HomePro = new JButton("7");
		L_7HomePro.setBackground(Color.WHITE);
		L_7HomePro.setBounds(318, 245, 29, 30);
		L_7HomePro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
                  if(count == 0) {
                	  d.setA(7);
                	  lblNewLabel.setText("YouLocation : HomePro");
                	  d.setLocation("HomePro");
                	  count ++;
				}
				else if(count >0) {
					d.setB(7);
					selected_location.setText("Selected Location : HomePro");
					d.setWTG("HomePro");
					count = 0;
					d.seePrice();
					lblTotalPrice_1.setText(""+d.getPrice());
					
				}
				
			}
		});
		contentPane.add(L_7HomePro);
		
		JButton L_8Themallram = new JButton("8");
		L_8Themallram.setBackground(Color.WHITE);
		L_8Themallram.setBounds(170, 4, 29, 30);
		L_8Themallram.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
                  if(count == 0) {
                	  d.setA(8);
                	  lblNewLabel.setText("YouLocation : Themallram");
                	  d.setLocation("Themallram");
                	  count ++;
				}
				else if(count >0) {
					d.setB(8);
					selected_location.setText("Selected Location : Themallram");
					d.setWTG("Themallram");
					count = 0;
					d.seePrice();
					lblTotalPrice_1.setText(""+d.getPrice());
				}
				
			}
		});
		contentPane.add(L_8Themallram);
		
		JButton L_9Klongton = new JButton("9");
		L_9Klongton.setBackground(Color.WHITE);
		L_9Klongton.setBounds(10, 275, 29, 30);
		L_9Klongton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
                  if(count == 0) {
                	  d.setA(9);
                	  lblNewLabel.setText("YouLocation : Klongton");
                	  d.setLocation("Klongton");
                	  count ++;
				}
				else if(count >0) {
					d.setB(9);
					selected_location.setText("Selected Location : Klongton");
					d.setWTG("Klongton");
					count = 0;
					d.seePrice();
					lblTotalPrice_1.setText(""+d.getPrice());
				}
				
			}
		});
		contentPane.add(L_9Klongton);
		
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(33, 508, 111, 23);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				F1 f1 = new F1();
				f1.main(null);
				frame.setVisible(false);
				
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Next");
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(637, 508, 89, 23);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(ATime == true) {
					
				F6 f6 = new F6();
				f6.main(null);
				frame.setVisible(false);
				
			}
				else {
					JOptionPane.showMessageDialog(null, "Pls give me a Time");
				}
			}
		});
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBounds(170, 508, 89, 23);
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				F4 f4 = new F4();
				f4.main(null);
				frame.setVisible(false);
				
			}
		});
		contentPane.add(btnNewButton_2);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(F5.class.getResource("/images/map.jpg")));
		lblNewLabel_1.setBounds(-37, -65, 848, 514);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblTotalPrice = new JLabel("Total Price:");
		lblTotalPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTotalPrice.setBounds(285, 508, 81, 23);
		contentPane.add(lblTotalPrice);
		
		
		
		JLabel lblThb = new JLabel("THB");
		lblThb.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblThb.setBounds(505, 503, 36, 33);
		contentPane.add(lblThb);
		
		
		
		JButton Time = new JButton("Time");
		Time.setForeground(Color.WHITE);
		Time.setFont(new Font("Tahoma", Font.BOLD, 16));
		Time.setBackground(Color.DARK_GRAY);
		Time.setBounds(571, 508, 89, 23);
		Time.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String a = JOptionPane.showInputDialog("Input time");
				while(di.checkAdigi(a) == false) {
					a = JOptionPane.showInputDialog("Input time, again should 4 word");
				}
				di.setWord(a.substring(0, 2)+ ":"+a.substring(2, 4));
				ATime = true;
			}
		});
		contentPane.add(Time);
		
		}
	}