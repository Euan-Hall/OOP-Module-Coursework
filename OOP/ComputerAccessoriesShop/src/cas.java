import java.io.File;

public class cas {

	public static void main(String[] args) throws Exception{
		// Read user file and make users
		File userFile = new File("src/UserAccounts.txt");
		userDatabase uDatabase = new userDatabase(userFile);
		
		for(int i=0; i<4; i++) {
			System.out.println("Name:" + uDatabase.customers[i].name);
		}
		
		// Read stock file and make products
		File productFile = new File("src/UserAccounts.txt");
		userDatabase pDatabase = new userDatabase(productFile);
	}

}
