import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
// Magableh
//Done by Raouf April 10
// Hello raouf
public class FirstClass {

	private JFrame frame;
	JLabel pic;
	JTextField textField;
	JTextField searchBar;
	
	public void homePage() {
		ImageIcon x = new ImageIcon("C:\\Users\\pc\\eclipse-workspace\\SecondTerm\\src\\background.jpg");
		Image image = x.getImage();
		Image newimg = image.getScaledInstance(1200, 900,  java.awt.Image.SCALE_SMOOTH);
		x = new ImageIcon(newimg);
		pic.setIcon(x);

	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstClass window = new FirstClass();
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
	public FirstClass() {
		initialize();
		homePage();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	// This part builds up the GUI, to perform scrapping or an other type of code create a class above the main method
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 762, 534);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//home page foreground pic
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(26, 13, 692, 360);
		ImageIcon x = new ImageIcon("C:\\Users\\pc\\eclipse-workspace\\SecondTerm\\src\\home img.jpg");
		Image image = x.getImage();
		Image newimg = image.getScaledInstance(700, 400,  java.awt.Image.SCALE_SMOOTH);
		x = new ImageIcon(newimg);
		lblNewLabel_2.setIcon(x);	
		frame.getContentPane().add(lblNewLabel_2);
		
		//home page background pic
		pic = new JLabel("");
		pic.setIcon(new ImageIcon("C:\\Users\\pc\\Downloads\\background.jpg"));
		pic.setBounds(0, 0, 744, 417);
		frame.getContentPane().add(pic);
		
		// the code that excutes when clicking the SQUAD button
		JButton squad = new JButton("SQUAD");
		squad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame x = new JFrame();
				ImageIcon pic1 = new ImageIcon("C:\\Users\\pc\\eclipse-workspace\\SecondTerm\\src\\formation.png");
				Image image = pic1.getImage();
				Image newimg = image.getScaledInstance(750, 650,  java.awt.Image.SCALE_SMOOTH);
				pic1 = new ImageIcon(newimg);
				pic.setIcon(pic1);
				
				x.getContentPane().add(pic, BorderLayout.NORTH);
				x.setSize(750,650);
				x.setVisible(true);
			}
		});
		squad.setBackground(new Color(255, 182, 193));
		squad.setBounds(0, 417, 176, 70);
		frame.getContentPane().add(squad);
		
		// the code that excutes when clicking the MARKET button
		JButton market = new JButton("MARKET");
		market.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				frame = new JFrame();
				frame.getContentPane().setBackground(new Color(135, 206, 235));
				frame.getContentPane().setLayout(null);
				
				searchBar = new JTextField();
				searchBar.setBounds(61, 407, 540, 31);
				frame.getContentPane().add(searchBar);
				searchBar.setColumns(10);
				searchBar.setEditable(true);
				
				JLabel lblNewLabel = new JLabel("Enter Player Name Below");
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblNewLabel.setBounds(62, 373, 233, 31);
				frame.getContentPane().add(lblNewLabel);
				
				JLabel lblNewLabel_1 = new JLabel("New label");
				lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\pc\\Downloads\\market.jpg"));
				lblNewLabel_1.setBounds(12, 13, 650, 347);
				frame.getContentPane().add(lblNewLabel_1);
				frame.setBounds(100, 100, 692, 510);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				frame.setVisible(true);
			}
		});
		market.setBackground(new Color(255, 182, 193));
		market.setBounds(175, 417, 191, 70);
		frame.getContentPane().add(market);
		
		// the code that excutes when clicking the STORE button
		JButton store = new JButton("STORE");
		store.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				frame = new JFrame();
				frame.getContentPane().setBackground(new Color(135, 206, 235));
				frame.getContentPane().setLayout(null);
				
				JLabel lblNewLabel = new JLabel("New label");
				lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pc\\Downloads\\background.jpg"));
				lblNewLabel.setBounds(0, 0, 674, 463);
				frame.getContentPane().add(lblNewLabel);
				
				JComboBox dropDown = new JComboBox();
				dropDown.setBounds(67, 205, 546, 50);
				frame.getContentPane().add(dropDown);
				frame.setBounds(100, 100, 692, 510);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
		store.setBackground(new Color(255, 182, 193));
		store.setBounds(365, 417, 191, 70);
		frame.getContentPane().add(store);
		
		// the code that excutes when clicking the GAME button
		JButton play = new JButton("GAME");
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				frame = new JFrame();
				frame.getContentPane().setBackground(new Color(135, 206, 235));
				frame.getContentPane().setLayout(null);
				
				JLabel lblNewLabel = new JLabel("Player");
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblNewLabel.setBounds(0, 0, 164, 44);
				frame.getContentPane().add(lblNewLabel);
				
				JLabel lblOpponent = new JLabel("Opponent");
				lblOpponent.setHorizontalAlignment(SwingConstants.CENTER);
				lblOpponent.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblOpponent.setBounds(510, 0, 164, 44);
				frame.getContentPane().add(lblOpponent);
				
				JTextArea playerHighlights = new JTextArea();
				playerHighlights.setText("Display game \r\nhighlights here");
				playerHighlights.setBackground(new Color(230, 230, 250));
				playerHighlights.setBounds(0, 97, 164, 366);
				playerHighlights.setEditable(false);
				frame.getContentPane().add(playerHighlights);
				
				JTextArea opponentHighlights = new JTextArea();
				opponentHighlights.setText("Display Game \r\nHighlights here");
				opponentHighlights.setBackground(new Color(230, 230, 250));
				opponentHighlights.setBounds(510, 97, 164, 366);
				opponentHighlights.setEditable(false);
				frame.getContentPane().add(opponentHighlights);
				
				pic = new JLabel("New label");
				pic.setBounds(164, 97, 346, 366);
				frame.getContentPane().add(pic);
				frame.setBounds(100, 100, 692, 510);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				ImageIcon pic1 = new ImageIcon("C:\\Users\\pc\\eclipse-workspace\\SecondTerm\\src\\mbappe.jpg");
				Image image = pic1.getImage();
				Image newimg = image.getScaledInstance(350, 400,  java.awt.Image.SCALE_SMOOTH);
				pic1 = new ImageIcon(newimg);
				pic.setIcon(pic1);
				
				JButton btnNewButton = new JButton("Sim Match");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// add code for this button here
					}
				});
				btnNewButton.setBackground(new Color(230, 230, 250));
				btnNewButton.setBounds(242, 59, 188, 25);
				frame.getContentPane().add(btnNewButton);
				
				frame.setVisible(true);
			}
		});
		play.setBackground(new Color(255, 182, 193));
		play.setBounds(553, 417, 191, 70);
		frame.getContentPane().add(play);
	}
}
