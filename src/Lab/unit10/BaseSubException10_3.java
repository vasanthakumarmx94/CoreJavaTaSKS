package Lab.unit10;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BaseSubException10_3 {

	public static void main(String[] a) {
		if (a.length == 0) {
			System.out.println("invalid usage");
			System.out.println("usage : Java file1 file2 file3 …");
			return;
		}
		for (int i = 0; i < a.length; i++) {
			File f = new File(a[i]);

			try {
				String line;
				DataInput d = new DataInputStream(new FileInputStream(a[i]));
				if (f.exists() && f.isFile()) {
					System.out.println("file exists");
					System.out.println(f + "is ordinary file");
					System.out.println("printing the contents of file named : " + a[i]);
					System.out.println("========================");
					while ((line = d.readLine()) != null) {
						System.out.println(line);
					}
				}
			} catch (FileNotFoundException e) {
				if (f.exists() && f.isDirectory()) {
					System.out.println("======================");
					System.out.println("Name : " + f + "is a directory");
					System.out.println("inside catch of FileNotFoundException");
					System.out.println("========================");
				} else {
					System.out.println("=====================");
					System.out.println("Name : " + a[i] + "does not exists");
					System.out.println("generated exception :" + e);
					System.out.println("======================");
				}
			} catch (IOException p) {
				System.out.println("super class is higher up in the program");
			}
		}

	}

}
