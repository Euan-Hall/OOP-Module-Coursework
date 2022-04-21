public class customer extends user{
	product[] basket;
	
	customer(String[] userArray){
		ID = Integer.parseInt(userArray[0]);
		name = userArray[1];
		username = userArray[2];
		address[0] = userArray[3];
		address[1] = userArray[4];
		address[2] = userArray[5];
		address[3] = userArray[6];	
	}
	
	public void payPayPal() {
		// Pay via PayPal
	}
	
	public void payCreditCard() {
		// Pay via credit card
	}
	
	public void addToBasket(product item) {
		// adds product to basket.
	}
	
	public void removeFromBasket(product item) {
		// Remove product from basket
	}
}
