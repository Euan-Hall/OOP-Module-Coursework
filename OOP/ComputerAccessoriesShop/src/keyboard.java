
public class keyboard extends product {
	String layout;
	keyboard(String[] keyboardArray){
		// ID, proType, gaming/standard, brand, colour, connectivity, quantity, price, rrp, extra
		barcode = Integer.parseInt(keyboardArray[0]);
		type = keyboardArray[2];
		brand = keyboardArray[3];
		colour = keyboardArray[4];
		connectivity = keyboardArray[5];
		quantity = Integer.parseInt(keyboardArray[6]);
		retailPrice = Float.parseFloat(keyboardArray[7]);
		originalPrice = Float.parseFloat(keyboardArray[8]);
		layout = keyboardArray[9];
	}
}
