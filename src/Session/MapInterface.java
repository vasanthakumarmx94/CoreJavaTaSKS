package Session;

import java.util.*;

public class MapInterface {

	public static void main(String[] args) {

		Map<String, Memployee> firstMap = new HashMap<String, Memployee>();
		firstMap.put("N00", new Memployee("N00", "Vignesh", 14000));
		firstMap.put("N01", new Memployee("N01", "Rakshith", 500000));
		firstMap.put("N02", new Memployee("N02", "Venkatesh", 700000));
		firstMap.put("N03", new Memployee("N03", "Nihal", 13000));
		firstMap.put("N07", new Memployee("N07", "Yashwanth", 300000));
		firstMap.put("N04", new Memployee("N04", "Vinay", 400000));
		firstMap.put("N09", new Memployee("N09", "Uday", 600000));
		firstMap.put("N05", new Memployee("N05", "Veeresh", 12000));
		firstMap.put("N06", new Memployee("N06", "Sachin", 50000));
		firstMap.put("N08", new Memployee("N08", "Virat", 90000));

		TreeMap<String, Memployee> sorted = new TreeMap<String, Memployee>(firstMap);

		Iterator<String> it = sorted.keySet().iterator();
		System.out.println("Sorted value of map");
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(key + " " + firstMap.get(key));
		}

		Iterator<String> itr = firstMap.keySet().iterator();

		while (itr.hasNext()) {
			String key = (String) itr.next();

			Memployee sal = firstMap.get(key);

			if (sal.esal < 15000.0) {
				itr.remove();

			}
		}

		Map<String, Memployee> finalMap = new HashMap<String, Memployee>();
		for (Map.Entry<String, Memployee> entry : firstMap.entrySet()) {
			finalMap.put(entry.getKey(), entry.getValue());
		}

		System.out.println("================");
		System.out.println("Value of new Map after removing the employees having salary less than 15000");
		Iterator<String> itr1 = finalMap.keySet().iterator();
		while (itr1.hasNext()) {
			String key = (String) itr1.next();
			System.out.println(key + " " + firstMap.get(key));
		}
		firstMap.clear();
		sorted.clear();
		finalMap.clear();
	}

}
class Memployee {
	String eid;
	String ename;
	double esal;
	public Memployee(String eid, String ename, double esal) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "eid=" + eid + ", ename=" + ename + ", esal=" + esal;
	}
	 
	
}
