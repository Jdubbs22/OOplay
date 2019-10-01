package TimBuchalka_Arrays;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;//arraylist of customer class

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }//end constructor

    public String getName() {
        return name;
    }//end getter

    public ArrayList<Customer> getCustomers() {
        return customers;
    }//end getter

    public boolean newCustomer(String customerName, double initialAmount) {
    	//bool used to check that the customer doesn't already exist
        if(findCustomer(customerName) == null) {//uses method below ..null means it's not there
            this.customers.add(new Customer(customerName, initialAmount));
            return true; //succesfully added
        }//end if

        return false;
    }//end method

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);//creating an object so that we do not have to call the method more than once
        if(existingCustomer != null) {
            existingCustomer.addTransaction(amount);//this method is in the customer class
            return true;
        }//end if

        return false;//if we couldn't find a customer
    }//end method

    private Customer findCustomer(String customerName) {//private because it's used internally in another method and doesn't need to be seen by user
        for(int i=0; i<this.customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }//end if
        }//end for

        return null;
    }//end method
    
}//end class
