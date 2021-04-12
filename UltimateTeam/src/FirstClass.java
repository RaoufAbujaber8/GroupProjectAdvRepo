import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
// Magableh
//Done by Raouf April 10
public class FirstClass {

	private JFrame frame;
	JLabel pic;
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
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 762, 534);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		pic = new JLabel("");
		pic.setBounds(0, 0, 744, 487);
		frame.getContentPane().add(pic);

		JButton squad = new JButton("Squad");
		squad.setBackground(new Color(255, 255, 255));
		squad.setBounds(0, 401, 176, 86);
		frame.getContentPane().add(squad);

		JButton market = new JButton("market");
		market.setBackground(new Color(255, 255, 255));
		market.setBounds(175, 401, 191, 86);
		frame.getContentPane().add(market);

		JButton store = new JButton("Store");
		store.setBackground(new Color(255, 255, 255));
		store.setBounds(365, 401, 191, 86);
		frame.getContentPane().add(store);

		JButton play = new JButton("game");
		play.setBackground(new Color(255, 255, 255));
		play.setBounds(568, 401, 176, 86);
		frame.getContentPane().add(play);
	}
}
