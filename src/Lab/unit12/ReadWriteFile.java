package Lab.unit12;

import java.io.*;
//import java.io.OutputStream;

public class ReadWriteFile {

	public static byte getInput()[] throws Exception {
		
		byte inp[]=new byte[50];
		System.out.println("Enter text:");
		System.out.println("only 50 bytes ie. about 2 lines...");
		for(int i=0;i<50;i++) {
			inp[i]=(byte)System.in.read();
		}
		
		return inp;
	}
	public static void main(String[] args)throws Exception {
		
		byte ipnput[]=getInput();
		OutputStream f=new FileOutputStream("Resource/write.txt");
		for(int i=0;i<50;i++) {
			f.write(ipnput[i]);
		}
		f.close();
		int size;
		InputStream f1=new FileInputStream("Resource/write.txt");
		System.out.println(f1.available());
		size=f1.available();
		System.out.println("Reading contents of file write.txt");
		for(int i=0;i<size;i++) {
			System.out.print((char)f1.read());
		}
		f1.close();
	}
}
