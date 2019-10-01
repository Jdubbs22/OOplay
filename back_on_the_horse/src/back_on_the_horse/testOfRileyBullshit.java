package back_on_the_horse;

public class testOfRileyBullshit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		doSomething(3);
		
	}//end main

	public static void doSomething(int n){
		if(n>0){
		doSomething(n-1);
		System.out.print(n);
		doSomething(n-1);
		}
	}//end method
	
}//end class
