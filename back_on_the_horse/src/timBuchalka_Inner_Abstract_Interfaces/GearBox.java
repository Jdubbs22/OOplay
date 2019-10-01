package timBuchalka_Inner_Abstract_Interfaces;

import java.util.ArrayList;

public class GearBox {

	private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public GearBox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);

        for(int i=0; i<maxGears; i++) {  // creates the gears in the constructor...could be done in main as well
            addGear(i, i* 5.3);  //assumes set ratio for all gears
        }//end for
    }//end constructor

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }//end method

    public void addGear(int number, double ratio) {
        if((number >0) && (number <= maxGears)) {
            this.gears.add(new Gear(number, ratio));  //adds a new gear
        }//end if
    }//end method

    public void changeGear(int newGear) {
        if((newGear>=0 ) && (newGear <this.gears.size()) && this.clutchIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected.");
        }//end if
        else {
            System.out.println("Grind!");
            this.currentGear = 0;
        }//end else
    }//end method

    public double wheelSpeed(int revs) {
        if(clutchIsIn) {
            System.out.println("Scream!!!");
            return 0.0;
        }//end if
        return revs * gears.get(currentGear).getRatio();
    }//end method

    private class Gear {  //inner class that only gearBox can access
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {

            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }//end constructor

        public double getRatio() {
            return ratio;
        }//end getter

        public double driveSpeed(int revs) {
            return revs *( this.ratio);
        }//end method
    }//end internal method
	
	
}//end class
