package TimBuchalka_Arrays;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();//create a new arraylist
        addTransaction(initialAmount);//use below method to add amount
    }//end constructor

    public void addTransaction(double amount) {
        this.transactions.add(amount);//adds to the arraylist
    }//end method

    public String getName() {
        return name;
    }//end getter

    public ArrayList<Double> getTransactions() {
        return transactions;
    }//end getter
    
}//end class