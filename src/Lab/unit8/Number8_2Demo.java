package Lab.unit8;

public class Number8_2Demo {

	private double db1;
	private long lg;

	public Number8_2Demo() {
		db1 = 108.0d;
		lg = 249;
	}

	public Number8_2Demo(double db1, long lg) {

		this.db1 = db1;
		this.lg = lg;
	}

	public boolean isZero() {
		if (db1 == 0.0)
			return true;
		else
			return false;
	}

	public boolean isPositive() {
		if (db1 > 0.0)
			return true;
		else
			return false;
	}

	public boolean isNegative() {
		if (db1 < 0.0)
			return true;
		else
			return false;
	}

	public boolean isodd() {
		if (db1 % 2 != 0.0)
			return true;
		else
			return false;
	}

	public boolean isEven() {
		if (db1 % 2 == 0.0)
			return true;
		else
			return false;
	}

	public boolean isPrime() {
		int i, lastn;
		double a;
		boolean flag;
		a = Math.sqrt(lg);
		lastn = (int) a;
		flag = true;
		for (i = 2; i < lastn; i++) {
			if (lg != i) {
				if (lg % i == 0) {
					flag = false;
					break;
				}
			}
		}
		if (flag)
			return true;
		else
			return false;
	}

	public boolean isAmstrong() {
		if (db1 == 0.0)
			return true;
		else
			return false;
	}

	public double getFactorial() {
		double d = 1;
		for (int i = 1; i < lg; i++)
			d = d * i;
		return d;
	}

	public double getSqrt() {
		double d;
		d = (double) lg;
		d = Math.sqrt(d);
		return d;
	}

	public double getSqr() {
		double d;
		d = (double) lg;
		d = d * d;
		return d;
	}

	public double sumDigits() {
		double d=0,sum=0;
		while(lg>0) {
			d=lg%10;
			sum=sum+d;
			lg=lg/10;
		}
		return sum;
	}

	public double getReverse() {
		double d = 0;
		double temp;
		while (lg > 9) {
			temp = lg % 10;
			d = d * 10 + temp;
			lg = lg / 10;
			System.out.println("\n" + temp + "\t" + d + " \t " + lg);
		}
		d = d * 10 + lg;
		System.out.println("Inside class" + d);
		return d;
	}

	public void dispBinary() {
		System.out.println("ByteValue of lg :" + Long.toBinaryString(lg));
	}

	public static void main(String[] args) {

		Number8_2Demo mynum = new Number8_2Demo();
		double d = 199;
		System.out.println(" The given numbers are 108.0d and 249");
		System.out.println("isZero; " + mynum.isZero());
		System.out.println("isPositive: " + mynum.isPositive());
		System.out.println("isNegative: " + mynum.isNegative());
		System.out.println("isOdd: " + mynum.isodd());
		System.out.println("isEven: " + mynum.isEven());
		System.out.println(" isPrime: " + mynum.isPrime());
		System.out.println("getFactorial: " + mynum.getFactorial());
		System.out.println("getSqrt: " + mynum.getSqrt());
		System.out.println("getSqr: " + mynum.getSqr());
		System.out.println("sumDigits: " + mynum.sumDigits());
		System.out.println("getReverse: " + mynum.getReverse());
		mynum.dispBinary();
		
		System.out.println(" isPrime: " + mynum.isPrime());

	}

}
