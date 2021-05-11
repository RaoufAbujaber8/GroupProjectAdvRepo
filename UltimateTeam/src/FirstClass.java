
import java.awt.Font;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.lang.model.element.Element;
import javax.lang.model.util.Elements;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.Document;

import org.jsoup.Jsoup;



import javax.swing.JButton;

// Magableh
//april 27th
public class FirstClass {

	//We Initialize the instance variables that we need for this project here
	private JFrame frame;
	private JFrame MARKET;
	private JFrame STORE;
	private String marketSearch;
	private ArrayList<Player> playerSearch = new ArrayList<Player>();
	private ArrayList<Player> packContentt= new ArrayList<Player>();
	JLabel kdk;
	JLabel pic;
	JTextField textField;
	JTextField searchBar;
	ArrayList<Player> benchXI;
	ArrayList<Player> startingXI; 
	int teamRating;
	int oppTeamRating;
	ArrayList<String> actions = new ArrayList<String>();
	int playerScore = 0;
	int oppScore = 0;
	int coinBalance = 0;
	JTextArea coins;
	int gameCount = 30;
	boolean addCoins = true;

	private TextArea display = new TextArea();
	
	//this method adds the background image
	public void homePage() {
		// add background image here
		ImageIcon x = new ImageIcon("C:\\Users\\pc\\git\\GroupProjectAdvRepo\\UltimateTeam\\src\\background.jpg");
		Image image = x.getImage();
		Image newimg = image.getScaledInstance(1200, 900,  java.awt.Image.SCALE_SMOOTH);
		x = new ImageIcon(newimg);
		pic.setIcon(x);
		display.setBounds(12, 30, 650, 300);
		display.setEditable(false);
	}

	// this method fills an arraylist with possible events that happen when we simulate a match
	public void matchHighlights() {
		actions.add("MATCH KICK OFF");
		actions.add("HALF TIME");
		actions.add("HEADER GOAL!");
		actions.add("FOUL --- Penalty");
		actions.add("FOUL --- Freekick");
		actions.add("Missed goal");
		actions.add("Corner Kick");
		actions.add("FREEKICK GOAL!");
		actions.add("OUTSIDE OF THE BOX GOAL!");
		actions.add("Player Injured");
		actions.add("Bicycle kick GOAL");
		actions.add("Lost Possession");
		actions.add("Yellow Card");
		actions.add("Red Card");
		actions.add("Substitution");
		actions.add("Manager Sent off");
	}

	//this method takes the average rating of the players' team, which helps us with the probability of winning
	public void avgTeamRating() {
		int sum = 0;
		for(int i =0; i < 11; i++) {
			sum += startingXI.get(i).getRating();
		}
		sum /= 11;
		teamRating = sum;
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
		matchHighlights();
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

		coins = new JTextArea();
		coins.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		coins.setForeground(new Color(255, 250, 250));
		coins.setText("Coin Balance: " + Integer.toString(coinBalance));
		coins.setOpaque(false);
		coins.setBounds(12, 0, 135, 22);
		coins.setEditable(false);
		frame.getContentPane().add(coins);

		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(141, -3, 25, 28);
		frame.getContentPane().add(lblNewLabel_3);
		ImageIcon x1 = new ImageIcon("C:\\Users\\pc\\git\\GroupProjectAdvRepo\\UltimateTeam\\src\\coins.png");
		Image image1 = x1.getImage();
		Image newimg1 = image1.getScaledInstance(20, 20,  java.awt.Image.SCALE_SMOOTH);
		x1 = new ImageIcon(newimg1);
		lblNewLabel_3.setIcon(x1);


		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(27, 44, 692, 360);

		ImageIcon x = new ImageIcon("C:\\Users\\pc\\git\\GroupProjectAdvRepo\\UltimateTeam\\src\\home img.jpg");
		Image image = x.getImage();
		Image newimg = image.getScaledInstance(700, 400,  java.awt.Image.SCALE_SMOOTH);
		x = new ImageIcon(newimg);
		lblNewLabel_2.setIcon(x);

		frame.getContentPane().add(lblNewLabel_2);

		pic = new JLabel("");
		pic.setIcon(new ImageIcon("C:\\Users\\pc\\git\\GroupProjectAdvRepo\\UltimateTeam\\src\\background.jpg"));
		pic.setBounds(0, 0, 744, 417);
		frame.getContentPane().add(pic);

		//this method runs when we click the SQUAD button, it creates the window
		JButton squad = new JButton("SQUAD");
		squad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame SQUAD = new JFrame();
				SQUAD.getContentPane().setBackground(new Color(135, 206, 235));
				SQUAD.getContentPane().setLayout(null);

				coins = new JTextArea();
				coins.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
				coins.setForeground(new Color(255, 250, 250));
				coins.setText("Coin Balance: " + Integer.toString(coinBalance));
				coins.setOpaque(false);
				coins.setBounds(12, 0, 135, 22);
				coins.setEditable(false);
				SQUAD.getContentPane().add(coins);

				JLabel lblNewLabel_3 = new JLabel("New label");
				lblNewLabel_3.setBounds(141, -3, 25, 28);
				SQUAD.getContentPane().add(lblNewLabel_3);
				ImageIcon x1 = new ImageIcon("C:\\Users\\pc\\git\\GroupProjectAdvRepo\\UltimateTeam\\src\\coins.png");
				Image image1 = x1.getImage();
				Image newimg1 = image1.getScaledInstance(20, 20,  java.awt.Image.SCALE_SMOOTH);
				x1 = new ImageIcon(newimg1);
				lblNewLabel_3.setIcon(x1);

				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(39, 55, 599, 223);
				SQUAD.getContentPane().add(scrollPane);

				//we fill out the team with a set of ranodm players as a start
				JTextArea starting = new JTextArea();
				scrollPane.setViewportView(starting);
				starting.setEditable(false);
				startingXI = new ArrayList<Player>();
				for(int i =0; i < 11; i++) {
					startingXI.add(new Player("Starting Player " + i, (int)(Math.random()*21+60), 0));
					starting.append(startingXI.get(i).getName() + "\t" + Integer.toString(startingXI.get(i).getRating()) + "\n");
				}

				JScrollPane scrollPane_1 = new JScrollPane();
				scrollPane_1.setBounds(39, 333, 599, 103);
				SQUAD.getContentPane().add(scrollPane_1);

				// fill out the bench with random players
				JTextArea bench = new JTextArea();
				scrollPane_1.setViewportView(bench);
				bench.setEditable(false);
				benchXI = new ArrayList<Player>();
				for(int i =0; i < 6; i++) {
					benchXI.add(new Player("Bench Player " + i, (int)(Math.random()*16+60), 0));
					bench.append(benchXI.get(i).getName() + "\t" + "Rating: " + Integer.toString(benchXI.get(i).getRating()) + "\n");
				}

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

		//button that creates the market window 
		JButton market = new JButton("MARKET");
		market.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MARKET = new JFrame();
				MARKET = new JFrame();
				MARKET.getContentPane().setBackground(new Color(135, 206, 235));
				MARKET.getContentPane().setLayout(null);

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
				lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\pc\\git\\GroupProjectAdvRepo\\UltimateTeam\\src\\market.jpg"));
				lblNewLabel_1.setBounds(12, 30, 650, 300);
				MARKET.getContentPane().add(lblNewLabel_1);

				coins = new JTextArea();
				coins.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
				coins.setForeground(new Color(255, 250, 250));
				coins.setText("Coin Balance: " + Integer.toString(coinBalance));
				coins.setOpaque(false);
				coins.setBounds(12, 0, 135, 22);
				coins.setEditable(false);
				MARKET.getContentPane().add(coins);

				JLabel lblNewLabel_3 = new JLabel("New label");
				lblNewLabel_3.setBounds(141, -3, 25, 28);
				MARKET.getContentPane().add(lblNewLabel_3);
				ImageIcon x1 = new ImageIcon("C:\\Users\\pc\\git\\GroupProjectAdvRepo\\UltimateTeam\\src\\coins.png");
				Image image1 = x1.getImage();
				Image newimg1 = image1.getScaledInstance(20, 20,  java.awt.Image.SCALE_SMOOTH);
				x1 = new ImageIcon(newimg1);
				lblNewLabel_3.setIcon(x1);
				
				//this button searches for a player when their name is searched, and displays it in a text area
				JButton searchButton = new JButton("Search");
				searchButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						marketSearch = searchBar.getText();
						
						MARKET.getContentPane().add(display);
						MARKET.getContentPane().remove(lblNewLabel_1);
						String dbUrl = "https://www.futbin.com/21/players?page=1&version=gold_rare&search=" + marketSearch;
						org.jsoup.nodes.Document searchTable;
						try {
							int j =0;
							searchTable = Jsoup.connect(dbUrl).get();
							org.jsoup.nodes.Element table = searchTable.select("table").get(0);
							org.jsoup.select.Elements rows = table.select("tr");
							for(org.jsoup.nodes.Element r : rows) {
								org.jsoup.select.Elements clmn = r.select("td");
								if(clmn.size() != 0) {

									String name = clmn.get(0).select("div").get(1).select("div").get(0).select("a").get(0).text();
									int rating = Integer.parseInt(clmn.get(1).select("span").get(0).text());
									int price = 0;
									String temp = clmn.get(4).select("span").get(0).text();
									for (int i = 0;i<=temp.length()-1;i++) {
										if (temp.contains("K")) {
											temp = temp.substring(0, temp.indexOf("K"));
											price = (int)Double.parseDouble(temp)*1000;
											break;
										}
										else if (temp.contains("M")) {
											temp = temp.substring(0, temp.indexOf("M"));
											price = (int)Double.parseDouble(temp)*1000000;
											break;
										}
										else {
											price=Integer.parseInt(temp);
										}
									}

									playerSearch.add(new Player(name, rating, price));
									display.append(("Name: " + playerSearch.get(j).getName() + ", Rating:  " + playerSearch.get(j).getRating()+ ", Price: " + playerSearch.get(j).getPrice()+"\n"));
									j++;
								}
							}
						}
						catch (IOException e2) {
							e2.printStackTrace();
						}
						JButton buy = new JButton("Purchase");
						buy.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								if (coinBalance>=playerSearch.get(0).getPrice()) {
						
								benchXI.add(playerSearch.get(0));
								coinBalance-=playerSearch.get(0).getPrice();
								}
								else {
									display.setText("You don't have enough money");
								}
							}
						});
						buy.setBackground(new Color(255, 182, 193));
						buy.setBounds(487, 362, 114, 31);
						buy.setVisible(false);
						MARKET.getContentPane().add(buy);
						if(playerSearch.size() == 1) {
							buy.setVisible(true);
						}	
						
					}
				});
				searchButton.setBackground(new Color(255, 182, 193));
				searchButton.setBounds(487, 394, 114, 31);
				MARKET.getContentPane().add(searchButton);

				MARKET.setBounds(100, 100, 692, 510);
				MARKET.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


				MARKET.setVisible(true);
				
			}
		});
		market.setBackground(new Color(255, 182, 193));
		market.setBounds(175, 417, 191, 70);
		frame.getContentPane().add(market);

		// store button, creates store window
		JButton store = new JButton("STORE");
		store.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// in the following code we add button actions to open the packs when clicked
				STORE = new JFrame();
				STORE.getContentPane().setBackground(new Color(135, 206, 235));
				STORE.getContentPane().setLayout(null);

				JTextArea pack1 = new JTextArea();
				pack1.setBounds(0, 0, 675, 460);
				pack1.setEditable(false);
				STORE.getContentPane().add(pack1);
				pack1.setVisible(false);

				JButton pack5 = new JButton("5k Pack");
				pack5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						JFrame pack = new JFrame();
						pack.setSize(400, 400);
						TextArea packContent = new TextArea();
						packContent.setBounds(0,0,400,400);

						pack.setLayout(new BorderLayout());
						pack.add(packContent, BorderLayout.CENTER);
						pack.setVisible(true);

						String dbUrl = "https://www.futbin.com/21/players?page=1&version=gold_rare&search=" + marketSearch;
						org.jsoup.nodes.Document searchTable;

						try {
							int j =(int)Math.random()*826+1;
							searchTable = Jsoup.connect(dbUrl).get();
							org.jsoup.nodes.Element table = searchTable.select("table").get(0);
							for (int m =0; m<2;m++) {
								org.jsoup.nodes.Element row = table.select("tr").get((int)Math.random()*100);
								org.jsoup.select.Elements clmn = row.select("td");
								if(clmn.size() != 0) {

									String name = clmn.get(0).select("div").get(1).select("div").get(0).select("a").get(0).text();
									int rating = Integer.parseInt(clmn.get(1).select("span").get(0).text());
									int price = 0;
									String temp = clmn.get(4).select("span").get(0).text();

									for (int i = 0;i<=temp.length()-1;i++) {
										if (temp.contains("K")) {
											temp = temp.substring(0, temp.indexOf("K"));
											price = (int)Double.parseDouble(temp)*1000;
											break;
										}
										else if (temp.contains("M")) {
											temp = temp.substring(0, temp.indexOf("M"));
											price = (int)Double.parseDouble(temp)*1000000;
											break;
										}
										else {
											price=Integer.parseInt(temp);
										}
									}

									packContentt.add(new Player(name, rating, price));
									pack1.append(("Name: " + playerSearch.get(j).getName() + ", Rating:  " + playerSearch.get(j).getRating()+ ", Price: " + playerSearch.get(j).getPrice()+"\n"));
								}
							}

						}catch (IOException e2) {
							e2.printStackTrace();
						}
					}
				});

				JButton pack10 = new JButton("10k Coins Pack");
				JButton pack50 = new JButton("50k Coins Pack");
				JButton pack100 = new JButton("100k Pack");

				pack10.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						TextArea packDisplay = new TextArea();
						packDisplay.setBounds(0,0,762,534);
						STORE.add(packDisplay);
						pack10.setVisible(false);
						pack50.setVisible(false);
						pack100.setVisible(false);
						if (coinBalance<10000) {
							pack1.setText("You don't have enough coins");
						}
						else {
							coinBalance-=10000;
							String dbUrl = "https://www.futbin.com/21/players?page=1&version=gold_rare";
							org.jsoup.nodes.Document searchTable;

							try {
								int j =(int)Math.random()*826+1;
								searchTable = Jsoup.connect(dbUrl).get();
								org.jsoup.nodes.Element table = searchTable.select("table").get(0);
								for (int m =0; m<2;m++) {
									org.jsoup.nodes.Element row = table.select("tr").get((int)Math.random()*100);
									org.jsoup.select.Elements clmn = row.select("td");
									if(packContentt.size()!=4) {

										String name = clmn.get(0).select("div").get(2).select("a").get(0).text();
										int rating = Integer.parseInt(clmn.get(1).select("span").get(0).text());
										int price = 0;
										String temp = clmn.get(4).select("span").get(0).text();

										for (int i = 0;i<=temp.length()-1;i++) {
											if (temp.contains("K")) {
												temp = temp.substring(0, temp.indexOf("K"));
												price = (int)Double.parseDouble(temp)*1000;
												break;
											}
											else if (temp.contains("M")) {
												temp = temp.substring(0, temp.indexOf("M"));
												price = (int)Double.parseDouble(temp)*1000000;
												break;
											}
											else {
												price=Integer.parseInt(temp);
											}
										}

										packContentt.add(new Player(name, rating, price));
										pack1.append(("Name: " + playerSearch.get(j).getName() + ", Rating:  " + playerSearch.get(j).getRating()+ ", Price: " + playerSearch.get(j).getPrice()+"\n"));
									}
								}

							}catch (IOException e2) {
								e2.printStackTrace();
							}
						}

					}
				});

				pack10.setBackground(new Color(255, 192, 203));
				pack10.setBounds(0, 52, 674, 79);
				STORE.getContentPane().add(pack10);
				
				pack50.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						pack10.setVisible(false);
						pack50.setVisible(false);
						pack100.setVisible(false);
						pack1.setVisible(true);
						if (coinBalance<5) {
							pack1.setText("You don't have enough coins");
						}
						else {
							coinBalance-=50000;
							String dbUrl = "https://www.futbin.com/21/players?page=1&version=gold_rare";
							org.jsoup.nodes.Document searchTable;

							try {
								int j =(int)(Math.random()*700+1);
								searchTable = Jsoup.connect(dbUrl).get();
								org.jsoup.nodes.Element table = searchTable.select("table").get(0);
								for (int m =0; m<2;m++) {
									org.jsoup.nodes.Element row = table.select("tr").get((int)Math.random()*100);
									org.jsoup.select.Elements clmn = row.select("td");
									if(packContentt.size()!=20) {

										pack1.setVisible(false);
										System.out.println(clmn.get(0).select("div").get(2).select("a").get(0).text());
										String name = clmn.get(0).select("div").get(2).select("a").get(0).text();
										int rating = Integer.parseInt(clmn.get(1).select("span").get(0).text());
										int price = 0;
										String temp = clmn.get(4).select("span").get(0).text();

										for (int i = 0;i<=temp.length()-1;i++) {
											if (temp.contains("K")) {
												temp = temp.substring(0, temp.indexOf("K"));
												price = (int)Double.parseDouble(temp)*1000;
												break;
											}
											else if (temp.contains("M")) {
												temp = temp.substring(0, temp.indexOf("M"));
												price = (int)Double.parseDouble(temp)*1000000;
												break;
											}
											else {
												price=Integer.parseInt(temp);
											}
										}

										packContentt.add(new Player(name, rating, price));
										pack1.append(("Name: " + playerSearch.get(j).getName() + ", Rating:  " + playerSearch.get(j).getRating()+ ", Price: " + playerSearch.get(j).getPrice()+"\n"));
									}
								}

							}catch (IOException e2) {
								e2.printStackTrace();
							}

						}
					}
				});
				pack50.setBackground(new Color(255, 192, 203));
				pack50.setBounds(0, 179, 674, 79);
				STORE.getContentPane().add(pack50);
				pack100.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						pack10.setVisible(false);
						pack50.setVisible(false);
						pack100.setVisible(false);
						if (coinBalance<100000) {
							pack1.setText("You don't have enough coins");
						}
						else {
							coinBalance-=100000;
							String dbUrl = "https://www.futbin.com/21/players?page=1&version=gold_rare";
							org.jsoup.nodes.Document searchTable;

							try {
								int j =(int)Math.random()*826+1;
								searchTable = Jsoup.connect(dbUrl).get();
								org.jsoup.nodes.Element table = searchTable.select("table").get(0);
								for (int m =0; m<2;m++) {
									org.jsoup.nodes.Element row = table.select("tr").get((int)Math.random()*100);
									org.jsoup.select.Elements clmn = row.select("td");
									if(packContentt.size()!=40) {

										String name = clmn.get(0).select("div").get(2).select("a").get(0).text();
										int rating = Integer.parseInt(clmn.get(1).select("span").get(0).text());
										int price = 0;
										String temp = clmn.get(4).select("span").get(0).text();

										for (int i = 0;i<=temp.length()-1;i++) {
											if (temp.contains("K")) {
												temp = temp.substring(0, temp.indexOf("K"));
												price = (int)Double.parseDouble(temp)*1000;
												break;
											}
											else if (temp.contains("M")) {
												temp = temp.substring(0, temp.indexOf("M"));
												price = (int)Double.parseDouble(temp)*1000000;
												break;
											}
											else {
												price=Integer.parseInt(temp);
											}
										}

										packContentt.add(new Player(name, rating, price));
										pack1.append(("Name: " + playerSearch.get(j).getName() + ", Rating:  " + playerSearch.get(j).getRating()+ ", Price: " + playerSearch.get(j).getPrice()+"\n"));
									}
								}

							}catch (IOException e2) {
								e2.printStackTrace();
							}

						}
					}
				});
				pack100.setBackground(new Color(255, 192, 203));
				pack100.setBounds(0, 306, 674, 79);
				STORE.getContentPane().add(pack100);


				ImageIcon x1 = new ImageIcon("C:\\Users\\pc\\git\\GroupProjectAdvRepo\\UltimateTeam\\src\\coins.png");
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

		// this is where the game is played a simulated
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

				JLabel scoreBoard = new JLabel("Game Highlights");
				scoreBoard.setHorizontalAlignment(SwingConstants.CENTER);
				scoreBoard.setFont(new Font("Tahoma", Font.BOLD, 15));
				scoreBoard.setBounds(164, 31, 346, 44);
				GAME.getContentPane().add(scoreBoard);

				JLabel lblOpponent = new JLabel("Opponent");
				lblOpponent.setForeground(new Color(255, 0, 0));
				lblOpponent.setHorizontalAlignment(SwingConstants.CENTER);
				lblOpponent.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblOpponent.setBounds(510, 31, 164, 44);
				GAME.getContentPane().add(lblOpponent);

				JTextArea playerEvents = new JTextArea();
				playerEvents.setText("Display game \r\nhighlights here");
				playerEvents.setBackground(new Color(144, 238, 144));
				playerEvents.setBounds(0, 97, 164, 366);
				GAME.getContentPane().add(playerEvents);

				JTextArea opponentEvents = new JTextArea();
				opponentEvents.setText("Display Game \r\nHighlights here");
				opponentEvents.setBackground(new Color(255, 0, 51));
				opponentEvents.setBounds(510, 97, 164, 366);
				GAME.getContentPane().add(opponentEvents);

				pic = new JLabel("Mbappe Pic");
				pic.setBounds(164, 97, 346, 366);
				GAME.getContentPane().add(pic);
				GAME.setBounds(100, 100, 692, 510);
				GAME.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

				ImageIcon pic1 = new ImageIcon("C:\\Users\\pc\\git\\GroupProjectAdvRepo\\UltimateTeam\\src\\mbappe.jpg");
				Image image = pic1.getImage();
				Image newimg = image.getScaledInstance(350, 400,  java.awt.Image.SCALE_SMOOTH);
				pic1 = new ImageIcon(newimg);
				pic.setIcon(pic1);

				JLabel score1 = new JLabel("Score: ");
				score1.setBounds(12, 72, 127, 20);
				GAME.getContentPane().add(score1);

				JLabel score2 = new JLabel("Score: ");
				score2.setBounds(535, 72, 127, 20);
				GAME.getContentPane().add(score2);
				GAME.setVisible(true);

				JLabel gameCounter = new JLabel("Games Left: " + gameCount);
				gameCounter.setFont(new Font("Tahoma", Font.BOLD, 14));
				gameCounter.setBounds(0, 2, 125, 16);
				GAME.getContentPane().add(gameCounter);

				// Add code for game simulation here
				JButton simMatch = new JButton("Simulate Match");
				simMatch.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//keeps track of how many games are left to be played
						gameCount-=1;
						gameCounter.setText("Games Left:" + gameCount);							
						playerScore = 0;
						oppScore = 0;
						score1.setText("Score: ");
						score2.setText("Score: ");

						//finds out the average of the opponent team's rating
						oppTeamRating = (int)(Math.random()*27+60);

						//sets the probability of winning by adding goals to the team with higher rating
						if(teamRating > oppTeamRating+10) {
							playerScore +=2;
						}
						else if(teamRating > oppTeamRating+5) {
							playerScore+=1;
						}
						else if(teamRating < oppTeamRating) {
							oppScore+=1;
						}
						else {
							playerScore = 0;
							oppScore = 0;
						}
						//displays the start match
						playerEvents.setText(actions.get(0) + "\n");
						opponentEvents.setText(actions.get(0) + "\n");

						// keeps track of when a goal is scored in the match
						int rndm = 0;
						for(int i =1; i <= 9; i ++) {
							rndm = (int)(Math.random()*15+1);
							playerEvents.append(actions.get(rndm) + "\n" + "\n");
							if(actions.get(rndm).indexOf("GOAL") != -1) {
								playerScore++;
							}
						}
						//sets the score
						score1.setText("Score: " + Integer.toString(playerScore));

						// keeps track of when a goal is scored in the match for the opponent team
						int rndm1 = 0;
						for(int i =1; i <= 9; i ++) {
							rndm1 = (int)(Math.random()*15+1);
							opponentEvents.append(actions.get(rndm1) + "\n" + "\n");
							if(actions.get(rndm1).indexOf("GOAL") != -1) {
								oppScore++;
							}
						}
						score2.setText("Score: " + Integer.toString(oppScore));

						//keeps track of how many games are left
						if (gameCount < 0) {
							playerEvents.setText("YOU ARE OUT OF GAMES");
							opponentEvents.setText("YOU ARE OUT OF GAMES");
							addCoins = false;
							score1.setText("0");
							score2.setText("0");
							scoreBoard.setText("COME BACK NEXT WEEK");
						}

						//calculates the amounts of points earned if the player wins, loses, or draws
						int earned = 0;
						if(playerScore > oppScore && addCoins == true) {
							scoreBoard.setText("YOU WON");
							scoreBoard.setForeground(new Color(0, 100, 0));
							earned = (int)(Math.random()*10001+1000);
							coinBalance += earned;
							coins.setText("Balance: " + coinBalance);
							playerEvents.append("\n" + "Coins Earned:" + earned);
						}
						else if(oppScore > playerScore && addCoins == true) {
							scoreBoard.setText("YOU LOST");
							scoreBoard.setForeground(new Color(255, 0, 0));
							earned = (int)(Math.random()*3001+2000);
							coinBalance += earned;
							coins.setText("Balance: " + coinBalance);
							playerEvents.append("\n" + "Coins Earned:" + earned);
						}
						else if(oppScore == playerScore && addCoins == true) {
							scoreBoard.setText("ITS A DRAW");
							scoreBoard.setForeground(new Color(0, 0, 255));
							earned = (int)(Math.random()*5001+5000);
							coinBalance += earned;
							coins.setText("Balance: " + coinBalance);
							playerEvents.append("\n" + "Coins Earned:" + earned);
						}
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

			}
		});
		play.setBackground(new Color(255, 182, 193));
		play.setBounds(553, 417, 191, 70);
		frame.getContentPane().add(play);
	}
}
