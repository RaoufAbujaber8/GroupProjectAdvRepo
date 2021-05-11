public class Player {

	String name;
	int rating;
	int price;
	
	public Player(String name, int rating, int price) {
		this.name = name;
		this.rating = rating;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getRating() {
		return rating;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String displayy(Player x) {
		return("Name: " + name + ", Rating:  " + rating+ ", Price: " + price);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

