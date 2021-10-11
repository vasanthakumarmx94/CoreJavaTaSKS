package Lab.unit9;

import java.util.Vector;

public class Vectordemo9_3 {

	public static void main(String[] args) {
		
		String s="Banglore";
		String m="Mysore";
		Vector v=new Vector();
		v.addElement(s);
		v.addElement(m);
		v.addElement("Kodagu");
		v.addElement(33);
		
		System.out.println("Size of vector is:"+v.size());
		System.out.println(v);

	}

}
