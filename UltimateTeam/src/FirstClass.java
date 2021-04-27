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

	// hhghghgh
	private JFrame frame;
	JLabel kdk;
	JLabel pic;
	JTextField textField;
	JTextField searchBar;

	public void homePage() {
		// add background image here
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
	
	// Call all the classes here
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

		JTextArea txtrCoinBalance = new JTextArea();
		txtrCoinBalance.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		txtrCoinBalance.setForeground(new Color(255, 250, 250));
		txtrCoinBalance.setText("Coin Balance: 0");
		txtrCoinBalance.setOpaque(false);
		txtrCoinBalance.setBounds(12, 0, 135, 22);
		txtrCoinBalance.setEditable(false);
		frame.getContentPane().add(txtrCoinBalance);

		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(141, -3, 25, 28);
		frame.getContentPane().add(lblNewLabel_3);
		ImageIcon x1 = new ImageIcon("C:\\Users\\pc\\eclipse-workspace\\SecondTerm\\src\\coins.png");
		Image image1 = x1.getImage();
		Image newimg1 = image1.getScaledInstance(20, 20,  java.awt.Image.SCALE_SMOOTH);
		x1 = new ImageIcon(newimg1);
		lblNewLabel_3.setIcon(x1);


		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(27, 44, 692, 360);

		ImageIcon x = new ImageIcon("C:\\Users\\pc\\eclipse-workspace\\SecondTerm\\src\\home img.jpg");
		Image image = x.getImage();
		Image newimg = image.getScaledInstance(700, 400,  java.awt.Image.SCALE_SMOOTH);
		x = new ImageIcon(newimg);
		lblNewLabel_2.setIcon(x);

		frame.getContentPane().add(lblNewLabel_2);

		pic = new JLabel("");
		pic.setIcon(new ImageIcon("C:\\Users\\pc\\Downloads\\background.jpg"));
		pic.setBounds(0, 0, 744, 417);
		frame.getContentPane().add(pic);

		JButton squad = new JButton("SQUAD");
		squad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame SQUAD = new JFrame();
				SQUAD.getContentPane().setBackground(new Color(135, 206, 235));
				SQUAD.getContentPane().setLayout(null);

				JTextArea txtrCoinBalance = new JTextArea();
				txtrCoinBalance.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
				txtrCoinBalance.setForeground(new Color(255, 250, 250));
				txtrCoinBalance.setText("Coin Balance: 0");
				txtrCoinBalance.setOpaque(false);
				txtrCoinBalance.setBounds(12, 0, 135, 22);
				txtrCoinBalance.setEditable(false);
				SQUAD.getContentPane().add(txtrCoinBalance);

				JLabel lblNewLabel_3 = new JLabel("New label");
				lblNewLabel_3.setBounds(141, -3, 25, 28);
				SQUAD.getContentPane().add(lblNewLabel_3);
				ImageIcon x1 = new ImageIcon("C:\\Users\\pc\\eclipse-workspace\\SecondTerm\\src\\coins.png");
				Image image1 = x1.getImage();
				Image newimg1 = image1.getScaledInstance(20, 20,  java.awt.Image.SCALE_SMOOTH);
				x1 = new ImageIcon(newimg1);
				lblNewLabel_3.setIcon(x1);

				JTextArea starting = new JTextArea();
				starting.setBounds(39, 55, 599, 223);
				SQUAD.getContentPane().add(starting);

				JTextArea bench = new JTextArea();
				bench.setBounds(39, 333, 599, 103);
				SQUAD.getContentPane().add(bench);

				JLabel lblNewLabel = new JLabel("Starting XI");
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblNewLabel.setBounds(39, 26, 154, 16);
				SQUAD.getContentPane().add(lblNewLabel);

				JLabel lblBench = new JLabel("Bench");
				lblBench.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblBench.setBounds(39, 314, 154, 16);
				SQUAD.getContentPane().add(lblBench);
				SQUAD.setBounds(100, 100, 692, 510);
				SQUAD.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				SQUAD.setVisible(true);
			}
		});
		squad.setBackground(new Color(255, 182, 193));
		squad.setBounds(0, 417, 176, 70);
		frame.getContentPane().add(squad);

		JButton market = new JButton("MARKET");
		market.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame MARKET = new JFrame();
				MARKET = new JFrame();
				MARKET.getContentPane().setBackground(new Color(135, 206, 235));
				MARKET.getContentPane().setLayout(null);

				JButton searchButton = new JButton("Search");
				searchButton.setBackground(new Color(255, 182, 193));
				searchButton.setBounds(487, 394, 114, 31);
				MARKET.getContentPane().add(searchButton);
				
				JTextField searchBar = new JTextField();
				searchBar.setBounds(61, 394, 426, 31);
				MARKET.getContentPane().add(searchBar);
				searchBar.setColumns(10);
				searchBar.setEditable(true);

				JLabel lblNewLabel = new JLabel("Enter Player Name Below");
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblNewLabel.setBounds(61, 362, 233, 31);
				MARKET.getContentPane().add(lblNewLabel);

				JLabel lblNewLabel_1 = new JLabel("New label");
				lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\pc\\Downloads\\market.jpg"));
				lblNewLabel_1.setBounds(12, 30, 650, 300);
				MARKET.getContentPane().add(lblNewLabel_1);
				
				
				JTextArea txtrCoinBalance = new JTextArea();
				txtrCoinBalance.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
				txtrCoinBalance.setForeground(new Color(255, 250, 250));
				txtrCoinBalance.setText("Coin Balance: 0");
				txtrCoinBalance.setOpaque(false);
				txtrCoinBalance.setBounds(12, 0, 135, 22);
				txtrCoinBalance.setEditable(false);
				MARKET.getContentPane().add(txtrCoinBalance);

				JLabel lblNewLabel_3 = new JLabel("New label");
				lblNewLabel_3.setBounds(141, -3, 25, 28);
				MARKET.getContentPane().add(lblNewLabel_3);
				ImageIcon x1 = new ImageIcon("C:\\Users\\pc\\eclipse-workspace\\SecondTerm\\src\\coins.png");
				Image image1 = x1.getImage();
				Image newimg1 = image1.getScaledInstance(20, 20,  java.awt.Image.SCALE_SMOOTH);
				x1 = new ImageIcon(newimg1);
				lblNewLabel_3.setIcon(x1);
				
				MARKET.setBounds(100, 100, 692, 510);
				MARKET.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

				
				MARKET.setVisible(true);
			}
		});
		market.setBackground(new Color(255, 182, 193));
		market.setBounds(175, 417, 191, 70);
		frame.getContentPane().add(market);

		JButton store = new JButton("STORE");
		store.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame STORE = new JFrame();
				STORE.getContentPane().setBackground(new Color(135, 206, 235));
				STORE.getContentPane().setLayout(null);
				
				JButton pack5 = new JButton("5k Pack");
				pack5.setBackground(new Color(255, 192, 203));
				pack5.setBounds(0, 0, 674, 54);
				STORE.getContentPane().add(pack5);
				
				JButton pack10 = new JButton("10k Pack");
				pack10.setBackground(new Color(255, 192, 203));
				pack10.setBounds(0, 52, 674, 66);
				STORE.getContentPane().add(pack10);
				
				JButton pack25 = new JButton("25k Pack");
				pack25.setBackground(new Color(255, 192, 203));
				pack25.setBounds(0, 116, 674, 66);
				STORE.getContentPane().add(pack25);
				
				JButton pack50 = new JButton("50k Pack");
				pack50.setBackground(new Color(255, 192, 203));
				pack50.setBounds(0, 179, 674, 79);
				STORE.getContentPane().add(pack50);
				
				JButton pack100 = new JButton("100k Pack");
				pack100.setBackground(new Color(255, 192, 203));
				pack100.setBounds(0, 252, 674, 96);
				STORE.getContentPane().add(pack100);
				
				JButton pack125 = new JButton("125k Pack");
				pack125.setBackground(new Color(255, 192, 203));
				pack125.setBounds(0, 342, 674, 121);
				STORE.getContentPane().add(pack125);
				ImageIcon x1 = new ImageIcon("C:\\Users\\pc\\eclipse-workspace\\SecondTerm\\src\\coins.png");
				Image image1 = x1.getImage();
				Image newimg1 = image1.getScaledInstance(20, 20,  java.awt.Image.SCALE_SMOOTH);
				x1 = new ImageIcon(newimg1);
				STORE.setBounds(100, 100, 692, 510);
				STORE.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				STORE.setVisible(true);
			}
		});
		store.setBackground(new Color(255, 182, 193));
		store.setBounds(365, 417, 191, 70);
		frame.getContentPane().add(store);

		JButton play = new JButton("GAME");
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame GAME = new JFrame();
				GAME = new JFrame();
				GAME.getContentPane().setBackground(new Color(135, 206, 235));
				GAME.getContentPane().setLayout(null);

				JLabel lblNewLabel = new JLabel("Player");
				lblNewLabel.setForeground(new Color(0, 100, 0));
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblNewLabel.setBounds(0, 31, 164, 44);
				GAME.getContentPane().add(lblNewLabel);

				JLabel lblGameHighlights = new JLabel("Game Highlights");
				lblGameHighlights.setHorizontalAlignment(SwingConstants.CENTER);
				lblGameHighlights.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblGameHighlights.setBounds(164, 31, 346, 44);
				GAME.getContentPane().add(lblGameHighlights);

				JLabel lblOpponent = new JLabel("Opponent");
				lblOpponent.setForeground(new Color(255, 0, 0));
				lblOpponent.setHorizontalAlignment(SwingConstants.CENTER);
				lblOpponent.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblOpponent.setBounds(510, 31, 164, 44);
				GAME.getContentPane().add(lblOpponent);

				JTextArea playerHighLights = new JTextArea();
				playerHighLights.setText("Display game \r\nhighlights here");
				playerHighLights.setBackground(new Color(230, 230, 250));
				playerHighLights.setBounds(0, 97, 164, 366);
				GAME.getContentPane().add(playerHighLights);

				JTextArea opponentHighlights = new JTextArea();
				opponentHighlights.setText("Display Game \r\nHighlights here");
				opponentHighlights.setBackground(new Color(230, 230, 250));
				opponentHighlights.setBounds(510, 97, 164, 366);
				GAME.getContentPane().add(opponentHighlights);

				pic = new JLabel("Mbappe Pic");
				pic.setBounds(164, 97, 346, 366);
				GAME.getContentPane().add(pic);
				GAME.setBounds(100, 100, 692, 510);
				GAME.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

				ImageIcon pic1 = new ImageIcon("C:\\Users\\pc\\eclipse-workspace\\SecondTerm\\src\\mbappe.jpg");
				Image image = pic1.getImage();
				Image newimg = image.getScaledInstance(350, 400,  java.awt.Image.SCALE_SMOOTH);
				pic1 = new ImageIcon(newimg);
				pic.setIcon(pic1);
				
				// Add code for game simulation here
				JButton simMatch = new JButton("Simulate Match");
				simMatch.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					}
				});
				simMatch.setBackground(new Color(255, 192, 203));
				simMatch.setBounds(274, 72, 127, 25);
				GAME.getContentPane().add(simMatch);
				
				JLabel lblNewLabel_1 = new JLabel("FUT RIVALS");
				lblNewLabel_1.setForeground(new Color(0, 0, 0));
				lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
				lblNewLabel_1.setBounds(0, 0, 674, 29);
				GAME.getContentPane().add(lblNewLabel_1);
				GAME.setVisible(true);
			}
		});
		play.setBackground(new Color(255, 182, 193));
		play.setBounds(553, 417, 191, 70);
		frame.getContentPane().add(play);
	}
}
