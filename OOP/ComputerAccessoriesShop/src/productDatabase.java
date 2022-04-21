import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class productDatabase{
	// Linked list maybe? VECTORS!!!
	// Too much space?
	keyboard[] keyboards = new keyboard[15];
	mouse[] mice = new mouse[15];
	int keyboardPos = 0;
	int mousePos = 0;
	
	productDatabase(File productFile) throws Exception{
		// Make scanner from file
		Scanner productScanner = new Scanner(productFile);
		productScanner.useDelimiter(",");
		
		// Look through the file
		while(productScanner.hasNext()) {
			String[] product = new String[8];
			for(int i=0; i<15; i++) {
				product[i] = productScanner.next();
			}
			if(product[8] == "admin") {
				mouse mouseProduct = new mouse(product);
				mice[mousePos] = mouseProduct;
				mousePos++;
			}
			else {
				keyboard keyboardProduct = new keyboard(product);
				keyboards[keyboardPos] = keyboardProduct;
				keyboardPos++;
			}
		}
		
		// Closes scanner
		productScanner.close();
	}
}
