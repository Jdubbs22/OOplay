package TimBuchalka_Arrays;

public class ArrayListChallenge1_Contact {

	private String name;
	private String phoneNumber;

	public ArrayListChallenge1_Contact(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}//end constructor

	public String getName() {
		return name;
	}//end getter

	public String getPhoneNumber() {
		return phoneNumber;
	}//end getter

	public static ArrayListChallenge1_Contact createContact(String name, String phoneNumber) {  //uses static in a form of a factory method (single entity)
		return new ArrayListChallenge1_Contact(name, phoneNumber);
	}//end method

}// end class
