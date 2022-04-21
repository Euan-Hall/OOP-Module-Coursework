public class admin extends user  {
	admin(String[] adminsArray){
		ID = Integer.parseInt(adminsArray[0]);
		name = adminsArray[1];
		username = adminsArray[2];
		address[0] = adminsArray[3];
		address[1] = adminsArray[4];
		address[2] = adminsArray[5];
		address[3] = adminsArray[6];	
	}
	public void addProduct() {
		// adds product to stock.
	}
}
