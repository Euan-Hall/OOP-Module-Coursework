
public class product {
	// Easier to keep mouse and keyboard in the same class to reduce space usage?
	int barcode;
	int quantity;
	float retailPrice;
	float originalPrice;
	String brand;
	String colour;
	String connectivity;
	String type;
	
	public int getQuantity() {
		return quantity;
	}
	
	// Only admin's can view the following
	public void setQuantity(int bought) {
		quantity -= bought;
	}
	
	public float getOriginalPrice() {
		return originalPrice;
	}
}
