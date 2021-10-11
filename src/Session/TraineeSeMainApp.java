package Session;

public class TraineeSeMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TraineeSoftware candidate1=new TraineeSoftware();
		//called default constructor
		candidate1.name="vasu";
		candidate1.city="Tumakur";
		candidate1.age=23;
		candidate1.qualification="MCA";
		candidate1.email="vasu@gmail.com";
		
		candidate1.showDetails();
		System.out.println("Company:"+candidate1.COMPANY_NAME);
		//by class name also can access 
		
		System.out.println("========================");
		TraineeSoftware candidate2=new TraineeSoftware();
		
		candidate2.name="karan";
		candidate2.showDetails();
		System.out.println("Company:"+candidate2.COMPANY_NAME);
		
		System.out.println("========================");
		TraineeSoftware candidate3=
				new TraineeSoftware("Preetham","Manglore",22,"MBA","preetham2gmail.com");;
		//called parameteraiseds  constructor
		
		candidate3.showDetails();
		System.out.println("Company:"+candidate2.COMPANY_NAME);
		
		//TraineeSoftware candidate4=new TraineeSoftware();
	}

}
