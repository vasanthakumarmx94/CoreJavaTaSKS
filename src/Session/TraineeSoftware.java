package Session;

public class TraineeSoftware {//user defined class
//set of instance attributes
	String name;//default null
	String qualification;
	int age;//default 0
	String city;
	String email;
	
	//setting default value from non param constructor
	//special method same name as class name
	public TraineeSoftware() {
		name="Unknown";
		qualification="Unknown";
				city="Missing";
		email="NA";
		
	
	}
	//parameterised constructure
	public TraineeSoftware(String name, String qualification,
			int age, String city, String email) {
		
		this.name = name;//this keyword is used to current object
		this.qualification = qualification;
		this.age = age;
		this.city = city;
		this.email = email;
	}

	//class member/static member (common for all and same 1 copy)
	public final String COMPANY_NAME="NEOSOFT TECH";
	//constant(Not cahngable) and single copy for all
	
	
	public void showDetails(){//instance behaviour
		System.out.println( "Name:"+name+", Qali:"+qualification+",city:"+city
				+",Email:"+email);
	}
	
}
