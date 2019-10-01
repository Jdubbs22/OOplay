package timBuchalka_Inner_Abstract_Interfaces;

public class InnerClassMain {

	public static void main(String[] args) {
		 // Instantiating the outer class 
	      OuterDemo outer = new OuterDemo();
	      
	      // Accessing the display_Inner() method.
	      outer.display_Inner();

	      
	      OuterDemo outer2 = new OuterDemo();
	      
	      // Instantiating the inner class
	      OuterDemo.Inner_Demo inner = outer.new Inner_Demo();
	      System.out.println(inner.getNum());
	      
	      OuterDemo  outer3 = new  OuterDemo ();
	      outer3.my_Method();
	      
	}//end main

}//end class
