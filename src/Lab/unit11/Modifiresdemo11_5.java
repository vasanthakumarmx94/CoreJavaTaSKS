package Lab.unit11;

import java.util.*;
import java.lang.reflect.*;

public class Modifiresdemo11_5 {

	public static void main(String[] args) {

		try {
			Class c = Class.forName("FileMethods");
			Method m[] = c.getDeclaredMethods();
			for (int i = 0; i < m.length; i++) {
				int ma = m[i].getModifiers();
				if (Modifier.isPublic(ma)) {
					System.out.println(m[i].getName());
				}
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
