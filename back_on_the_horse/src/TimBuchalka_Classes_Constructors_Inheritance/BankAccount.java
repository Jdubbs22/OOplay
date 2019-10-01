package TimBuchalka_Classes_Constructors_Inheritance;
//Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
//
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.
public class BankAccount {

	private int accntNum;
	private int balance;
	private String custName;
	private String email;
	private String phoneNum;
	
	public BankAccount(){
		this.balance = 200;//setting a default with and empty constructor
		System.out.println("empty constructor created");
		System.out.println("BankAccount constructor called with balance set to  default balance "+ balance);
	}//end constructor
	
	public BankAccount(int balance){//constructor with only balance
		this.balance= balance;
		System.out.println("BankAccount constructor called with balance set to "+ balance);
	}//end constructor
	
	public  void deposit(int amount){
		balance +=amount;
		System.out.println("You deposited "+amount+" dollars, your current balance is "+ balance);
	}//end method
	
	public void withdrawl(int amount){
		if(amount > balance){
			System.out.println("You attempted to withdraw "+ amount);
			System.out.println("Insufficent funds to withdraw this amount.");
			System.out.println("Your current balance is: "+ balance);
		}//end if
		else{
			balance-=amount;
			System.out.println("You took out "+amount+ " dollars, your current balance is "+ balance);
		}//end else
	}//end method
	
	//+++++++++++++++++getters and setters below++++++++++++++++++++++
	public int getAccntNum() {
		return accntNum;
	}//end getter
	public void setAccntNum(int accntNum) {
		this.accntNum = accntNum;
	}//end setter
	public int getBalance() {
		return balance;
	}//end getter
	public void setBalance(int balance) {
		this.balance = balance;
		//deposit(balance);
	}//end setter
	public String getCustName() {
		return custName;
	}//end getter
	public void setCustName(String custName) {
		this.custName = custName;
	}//end setter
	public String getEmail() {
		return email;
	}//end getter
	public void setEmail(String email) {
		this.email = email;
	}//end setter
	public String getPhoneNum() {
		return phoneNum;
	}//end getter
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}//end setter
	
	
}//end class
