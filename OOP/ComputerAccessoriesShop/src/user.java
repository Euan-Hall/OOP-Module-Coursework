public class user {
	int ID;
	String name;
	String username;
	String[] address = new String[4];
	
	public void search() {
		// returns a list of products from given filters
	}
	
	public void viewItem(product item) {
		// View details abut the product (excluding the original price)
	}
	
	public void changeUsername(String newUsername) {
		// Check if username fits standards.
		username = newUsername;
	}
}
