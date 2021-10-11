package Lab.unit11;

import java.io.File;

public class DirectoryCreation11_3 {

	public static void main(String[] args) {
		File f=new File("c:/java/temp", "abc.txt");
		if(f.exists()) {
			System.out.println("Created directory");
			
		}
		else {
			System.out.println("Unable to create directory");
		}
	}

}
