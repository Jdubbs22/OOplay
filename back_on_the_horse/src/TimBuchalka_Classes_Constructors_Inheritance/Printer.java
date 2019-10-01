package TimBuchalka_Classes_Constructors_Inheritance;
//Create a class and demonstate proper encapsulation techniques
// the class will be called Printer
// It will simulate a real Computer Printer
// It should have fields for the toner Level, number of pages printed, and
// also whether its a duplex printer (capable of printing on both sides of the paper).
// Add methods to fill up the toner (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).
// Decide on the scope, whether to use constructors, and anything else you think is needed.

public class Printer {
	private int tonerLevel =100;
 	private int pagesPrinted;
	private boolean isDuplex = false;
	
	 
	 public Printer(int tonerLevel, boolean isDuplex) {
		super();
		if(tonerLevel >0 && tonerLevel <=100){
			this.tonerLevel = tonerLevel;
		}
		
		this.pagesPrinted = 0;
		this.isDuplex = isDuplex;
	}//end constructor
	
	public int printedPages(int num){
		if(isDuplex==true){
			pagesPrinted += (num/2) +(num %2);
			System.out.println("The number of pages printed is "+ pagesPrinted);
		}//end if
		else{
		pagesPrinted+=num;
		System.out.println("The number of pages printed is "+ pagesPrinted);
		}//end else
		return pagesPrinted;
		
	}//end method
	
	public int numPagesPrinted(){
		return pagesPrinted;
	}
	
	public int filltoner(int fill){
		int toner = tonerLevel+fill;
		if (toner <= 100){
				
	System.out.println("toner level is "+ toner);
		return toner;
		}//end if
		else{
			System.out.println("You cannot put that much toner in..current toner level is "+ tonerLevel);
			return tonerLevel;
		}
	
	}

	public int getTonerLevel() {
		return tonerLevel;
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}

	public boolean isDuplex() {
		return isDuplex;
	}
	
	
}//end class
