package TimBuchalka_Classes_Constructors_Inheritance;

public class VipCustomer {

	private String name;
	private double creditLimit;
	private String email;
	
	
	
	
	public VipCustomer(String name) {
		super();
		this.name = name;
		this.creditLimit = 3.0;
		this.email = "No email found";
	}//end  constuctor with 2 defaults
	
	
	
	public VipCustomer(String name, double creditLimit) {
		super();
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = "No email found";
	}//end constructor
	
	
	public VipCustomer(String name, double creditLimit, String email) {
		super();
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}//end constructor



	public String getName() {
		return name;
	}//end getter
	public double getCreditLimit() {
		return creditLimit;
	}//end getter
	public String getEmail() {
		return email;
	}//end getter
	
	
	
}//end class
