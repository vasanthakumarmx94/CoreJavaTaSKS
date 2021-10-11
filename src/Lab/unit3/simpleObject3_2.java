package Lab.unit3;

public class simpleObject3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Roomclass ob1=new Roomclass(111,"2BHK","Banglore city Stop",true);
		ob1.displayData();
		Roomclass ob2=new Roomclass();
		ob2.setData(333,"2BHK","Banglore city Stop",false);
		ob2.displayData();
		

	}

}
