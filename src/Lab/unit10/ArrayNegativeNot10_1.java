package Lab.unit10;

public class ArrayNegativeNot10_1 {

	public static void main(String[] args) {
		try {
			int a1[] = new int[-2];
			System.out.println("first element : " + a1[0]);
			}
		catch (NegativeArraySizeException n) {
			System.out.println(" Generated exception : " + n);
		}
		System.out.println(" After the try block");
	}

}
