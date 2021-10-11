package Lab.unit4;

//Overriding

class Animals{
	public void eat() {
		System.out.println("Eat all eatbles");
	}
}
class Dog extends Animals{
	public void eat() {
		System.out.println("Eat meat...");
	}
	
}
class cat extends Animals{
	public void eat() {
		System.out.println("Drink milk");
	}
}

public class methodOverriding4_4 {

	public static void main(String[] args) {
		
		System.out.println("=======================");
		 Dog dog=new Dog();
		 dog.eat();//class Dog eat method it overrides super class eat method
		 
		 Animals an= new Dog();//parent class reference refer to derived class object (Upcasting
		 an.eat();   //class Dog eat method it overrides super class eat
		 
		 cat e=new cat();
		 e.eat(); //execute class cat eat() method

	}

}
