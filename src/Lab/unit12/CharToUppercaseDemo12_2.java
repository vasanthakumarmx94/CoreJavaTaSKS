package Lab.unit12;

import java.io.*;

public class CharToUppercaseDemo12_2 {

	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream f = new ByteArrayOutputStream(12);
		System.out.println("Enter 10 characters to convert to Uppercase:");
		while (f.size() != 10) {
			f.write(System.in.read());
		}
		System.out.println("Accepted characters to array:");
		byte b[] = f.toByteArray();
		
		System.out.println("Display characters in the arrray:");
		for (int l = 0; l < b.length; l++) {
			System.out.print((char) b[l]);
		}
		
		ByteArrayInputStream inp=new ByteArrayInputStream(b);
		int ch ;
		System.out.println("\n\nConverted uppercase cahractes");
		for(int i=0;i<b.length;i++) {
			while((ch=inp.read())!=-1)
			System.out.print(Character.toUpperCase((char)ch));
		}
		System.out.println();
		inp.reset();
	}

}
