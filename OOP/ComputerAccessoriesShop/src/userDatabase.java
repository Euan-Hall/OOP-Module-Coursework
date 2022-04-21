import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class userDatabase{
	// Linked list maybe? VECTORS
	customer[] customers = new customer[4];
	admin[] admins = new admin[4];
	int customerPos = 0;
	int adminPos = 0;
	
	// Constructor method for userDatabase
	userDatabase(File userFile) throws Exception{
		// Make scanner from file
		Scanner userScanner = new Scanner(userFile);
		userScanner.useDelimiter(",");
		
		// Look through the file
		String[] user = new String[8];
		while(userScanner.hasNext()) {
			
			for(int i=0; i<7; i++) {
				// Error persists due to admin being admin\r\n102.
				// Need to find a fix for this.
				user[i] = userScanner.next();
			}
			if(user[7] == "admin") {
				admin adminUser = new admin(user);
				admins[adminPos] = adminUser;
				adminPos++;
				
			}
			else {
				customer customerUser = new customer(user);
				customers[customerPos] = customerUser;
				customerPos++;
			}
		}
		
		// Closes scanner
		userScanner.close();
	}
}
