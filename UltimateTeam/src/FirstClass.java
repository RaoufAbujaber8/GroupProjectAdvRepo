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
	JFrame frame1;
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
				frame1 = new JFrame();
				frame1.getContentPane().setBackground(new Color(135, 206, 235));
				frame1.getContentPane().setLayout(null);

				JTextArea txtrCoinBalance = new JTextArea();
				txtrCoinBalance.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
				txtrCoinBalance.setForeground(new Color(255, 250, 250));
				txtrCoinBalance.setText("Coin Balance: 0");
				txtrCoinBalance.setOpaque(false);
				txtrCoinBalance.setBounds(12, 0, 135, 22);
				frame1.getContentPane().add(txtrCoinBalance);

				JLabel lblNewLabel_3 = new JLabel("New label");
				lblNewLabel_3.setBounds(141, -3, 25, 28);
				frame1.getContentPane().add(lblNewLabel_3);
				ImageIcon x1 = new ImageIcon("C:\\Users\\pc\\eclipse-workspace\\SecondTerm\\src\\coins.png");
				Image image1 = x1.getImage();
				Image newimg1 = image1.getScaledInstance(20, 20,  java.awt.Image.SCALE_SMOOTH);
				x1 = new ImageIcon(newimg1);
				lblNewLabel_3.setIcon(x1);

				JTextArea textArea = new JTextArea();
				textArea.setBounds(39, 55, 599, 223);
				frame1.getContentPane().add(textArea);

				JTextArea textArea_1 = new JTextArea();
				textArea_1.setBounds(39, 333, 599, 103);
				frame1.getContentPane().add(textArea_1);

				JLabel lblNewLabel = new JLabel("Starting XI");
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblNewLabel.setBounds(39, 26, 154, 16);
				frame1.getContentPane().add(lblNewLabel);

				JLabel lblBench = new JLabel("Bench");
				lblBench.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblBench.setBounds(39, 314, 154, 16);
				frame1.getContentPane().add(lblBench);
				frame1.setBounds(100, 100, 692, 510);
				frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame1.setVisible(true);
			}
		});
		squad.setBackground(new Color(255, 182, 193));
		squad.setBounds(0, 417, 176, 70);
		frame.getContentPane().add(squad);

		JButton market = new JButton("MARKET");
		market.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				frame = new JFrame();
				frame.getContentPane().setBackground(new Color(135, 206, 235));
				frame.getContentPane().setLayout(null);

				textField = new JTextField();
				textField.setBounds(61, 407, 540, 31);
				frame.getContentPane().add(textField);
				textField.setColumns(10);
				textField.setEditable(true);

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

				JComboBox comboBox = new JComboBox();
				comboBox.setBounds(67, 205, 546, 50);
				frame.getContentPane().add(comboBox);
				frame.setBounds(100, 100, 692, 510);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
		store.setBackground(new Color(255, 182, 193));
		store.setBounds(365, 417, 191, 70);
		frame.getContentPane().add(store);

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

				JLabel lblGameHighlights = new JLabel("Game Highlights");
				lblGameHighlights.setHorizontalAlignment(SwingConstants.CENTER);
				lblGameHighlights.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblGameHighlights.setBounds(167, 45, 346, 44);
				frame.getContentPane().add(lblGameHighlights);

				JLabel lblOpponent = new JLabel("Opponent");
				lblOpponent.setHorizontalAlignment(SwingConstants.CENTER);
				lblOpponent.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblOpponent.setBounds(510, 0, 164, 44);
				frame.getContentPane().add(lblOpponent);

				JTextArea txtrDisplayGameHighlights = new JTextArea();
				txtrDisplayGameHighlights.setText("Display game \r\nhighlights here");
				txtrDisplayGameHighlights.setBackground(new Color(230, 230, 250));
				txtrDisplayGameHighlights.setBounds(0, 97, 164, 366);
				frame.getContentPane().add(txtrDisplayGameHighlights);

				JTextArea txtrDisplayGameHighlights_1 = new JTextArea();
				txtrDisplayGameHighlights_1.setText("Display Game \r\nHighlights here");
				txtrDisplayGameHighlights_1.setBackground(new Color(230, 230, 250));
				txtrDisplayGameHighlights_1.setBounds(510, 97, 164, 366);
				frame.getContentPane().add(txtrDisplayGameHighlights_1);

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

				frame.setVisible(true);
			}
		});
		play.setBackground(new Color(255, 182, 193));
		play.setBounds(553, 417, 191, 70);
		frame.getContentPane().add(play);
	}
}
