public class mouse  extends product {
	int numberOfButtons;
	mouse(String[] mouseArray){
		// ID, proType, gaming/standard, brand, colour, connectivity, quantity, price, rrp, extra
		barcode = Integer.parseInt(mouseArray[0]);
		type = mouseArray[2];
		brand = mouseArray[3];
		colour = mouseArray[4];
		connectivity = mouseArray[5];
		quantity = Integer.parseInt(mouseArray[6]);
		retailPrice = Float.parseFloat(mouseArray[7]);
		originalPrice = Float.parseFloat(mouseArray[8]);
		numberOfButtons = Integer.parseInt(mouseArray[9]);
	}
}
