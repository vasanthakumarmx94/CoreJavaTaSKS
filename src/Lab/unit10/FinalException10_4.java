package Lab.unit10;

import java.io.BufferedInputStream;
import java.io.IOException;

public class FinalException10_4 {

	public static void main(String[] args) throws IOException {
		try {
//			BufferedInputStream f1 = null;
//			int size = f1.available();
//			for (int I = 0; I < size; I++) {
//				System.out.print((char) f1.read());
			int a[]=new int[5];
			for(int i=1;i<7;i++) {
				System.out.println(a[i]);
			}
		} catch (NullPointerException n) {
			System.out.println("exception generated : " + n);
		}
		catch (IndexOutOfBoundsException n) {
			System.out.println("exception generated : " + n);
		}
		finally {
			System.out.println("");
			System.out.println("Inside finally");
			System.out.println("hay I always have the final");
			System.out.println("");
		}
	}
}
