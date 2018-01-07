
public class swap {

	public static void main(String[] args){ 
		StringObject x = new StringObject("hello"); 
		StringObject y = new StringObject("world"); 
		x.swap(y); 
		System.out.println(x); 
		System.out.println(y); 
	}// end main
} //end swap
class StringObject{ 
	public String str; 
	public StringObject(String str){ this.str = str; } //end constructor
	public String toString(){ return str; }//end constructor

	public void swap(StringObject a){ 
		String t = a.str; 
		a.str = this.str; 
		this.str = t; 
	} //end constructor
	
}//end swap
