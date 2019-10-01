package TimBuchalka_Classes_Constructors_Inheritance;

public class electricSockets {

	private int numOfSockets;
	private boolean powerOn;
	
	public electricSockets(int numOfSockets, boolean powerOn) {
		super();
		this.numOfSockets = numOfSockets;
		this.powerOn = false;
	}//end consturcotr
	
	public void lightOn(){
		String isLamp = furniture.class.getName();
	}//end method
	
	public void flipSwitch(){
		if(powerOn==true){
			powerOn= false;
			System.out.println("power is 0ff");
		}//end if
		else
			powerOn=true;
		System.out.println("power is 0n");
	}//end method

	public int getNumOfSockets() {
		return numOfSockets;
	}

	public boolean isPowerOn() {
		return powerOn;
	}
	
	
	
	
	
}//end class
