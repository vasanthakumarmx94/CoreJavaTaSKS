package Lab.unit11;

import java.io.*;

public class FileMethods {

	public static void main(String[] args) {

		File f1 = new File("c:/java/", "abc.txt");
		System.out.println("FileName:" + f1.getName());
		System.out.println("Path:" + f1.getPath());
		System.out.println("AbsolutePath:" + f1.getAbsolutePath());
		System.out.println(f1.exists() ? "file exists" : "file not exist");
		System.out.println(f1.isDirectory() ? "file is a Directory" : "file is not a Directory");
		System.out.println(f1.isFile() ? "file is a ordinary file" : "file is not ordinary ");
	}

}


