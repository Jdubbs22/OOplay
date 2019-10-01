package timBuchalka_Inner_Abstract_Interfaces;

public class OuterDemo {
// great reference... https://www.tutorialspoint.com/java/java_innerclasses.htm
	
	private int num = 175;
	   
	   // inner class
	  class Inner_Demo {
	      public void print() {
	         System.out.println("This is an inner class");
	      }//end method
	      public int getNum() {
	          System.out.println("This is the getnum method of the inner class");
	          return num;
	       }//end method
	   }//end nested class
	   
	   // Accessing he inner class from the method within
	   void display_Inner() {
	      Inner_Demo inner = new Inner_Demo();
	      inner.print();
	   }//end method
	   
	   
	   void my_Method() {  //this method contains a inner class
		      int num = 23;

		      // method-local inner class
		      class MethodInner_Demo {
		         public void print() {
		            System.out.println("This is method inner class "+num);	   
		         }  //end method 
		      } // end of inner class
			   
		      // Accessing the inner class
		      MethodInner_Demo inner = new MethodInner_Demo();
		      inner.print();
		   }//end method (containing class)
	   
	
}//end class
